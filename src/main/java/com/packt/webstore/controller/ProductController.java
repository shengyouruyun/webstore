package com.packt.webstore.controller;
import java.math.BigDecimal; 
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.RequestMapping; 
import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.impl.InMemoryProductRepository;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.impl.ProductServiceImpl;
import com.packt.webstore.service.ProductService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.InitBinder;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.validation.BindingResult;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.DispatcherServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.packt.webstore.exception.*;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import com.packt.webstore.validator.ProductValidator;


@Controller
@RequestMapping("market")
public class ProductController{
	 private ProductService productService = new ProductServiceImpl();
	// private ProductRepository productRepository = new InMemoryProductRepository();
	@RequestMapping("/products")
	public String list(Model model)
	{
		model.addAttribute("products", productService.getAllProducts());

		System.out.println(productService.getAllProducts());
		return "products";

	}
	@RequestMapping("/update/stock")
	public String updates(Model model){
		productService.updateAllStock();
		return "redirect:/market/products";
	}

	@RequestMapping("/products/{category}")
	public String getProductsByCategory(Model model, @PathVariable("category") String productCategory)

	{
		List<Product> products =  productService.getProductsByCategory(productCategory);

		if(products == null || products.isEmpty()){
			throw new NoProductsFoundUnderCategoryException();
		}

		model.addAttribute("products", products);
		return "products";
	}

	@RequestMapping("/products/filter/{params}")
	public String getProductsByFilter(@MatrixVariable(pathVar="params")
		Map<String,List<String>> filterParams, Model model){
		model.addAttribute("products", productService.getProductsByFilter(filterParams));
		System.out.println(filterParams);
		return "products";
	}

	@RequestMapping("/product")
	public String getProductById(Model model, @RequestParam("id") String productId){
		
		model.addAttribute("product", productService.getProductById(productId));
		return "product";
	}

	@RequestMapping("/products/{category}/{price}")
	public String filterProducts(Model model, @PathVariable("category") String productCategory,
	 @MatrixVariable(pathVar="price") Map<String,Object> filterParams,
	  @RequestParam("manufacturer") String manufacturer){
	  	System.out.println(filterParams);
		System.out.println(manufacturer);
		System.out.println(productCategory);
	  	model.addAttribute("products", productService.filterProducts(productCategory,filterParams,manufacturer));
	  	return "products";
	}
	
	@RequestMapping(value="/products/add", method=RequestMethod.GET)
	public String getAddNewProductForm(Model model){
		Product newProduct = new Product();
	model.addAttribute("newProduct", newProduct);
		return "addProduct";
	}

	@RequestMapping(value="/products/add", method=RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newProduct") 
		@Valid Product newProduct, BindingResult result, HttpServletRequest request){

		if(result.hasErrors()){return "addProduct";}

		 String[] suppressedFields = result.getSuppressedFields();
		
		
		if (suppressedFields.length > 0){		
			throw new RuntimeException("Attempting to bind disallowed fields: " +
				StringUtils.arrayToCommaDelimitedString(suppressedFields));
		}

		MultipartFile productImage = newProduct.getProductImage();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		System.out.println(rootDirectory);
		if(productImage!=null && !productImage.isEmpty()){
		try{
			productImage.transferTo(new File(rootDirectory+"/resources/images/"+newProduct.getProductId()+".jpg"));
		}catch(Exception e){
			throw new RuntimeException("Product Image saving failed, e");
		}

	}
	    System.out.println(rootDirectory+"/resources/images/"+newProduct.getProductId()+".jpg");
		productService.addProduct(newProduct);
		System.out.println(productService.getAllProducts());
		return "redirect:/market/products";
	}


	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView handleError(HttpServletRequest req, ProductNotFoundException exception){
		ModelAndView mav = new ModelAndView();
		mav.addObject("invalidProductId", exception.getProductId());
		mav.addObject("exception", exception);
		mav.addObject("url", req.getRequestURL()+"?"+req.getQueryString());
		mav.setViewName("productNotFound");
		return mav;
	}


	@RequestMapping("/products/invalidPromoCode")
	public String invalidPromoCode(){
		return "invalidPromoCode";
	}


	@Autowired
	private ProductValidator productValidator;
	

	@InitBinder
	public void initialiseBinder(WebDataBinder binder){
		binder.setAllowedFields(
			"productId",
			"name",
			"unitPrice",
			"description",
			"manufacturer",
			"category",
			"unitsInStock",
			"condition",
			"productImage",
			"language");
		binder.setValidator(productValidator);
	}

  }




