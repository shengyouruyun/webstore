package com.packt.webstore.service.impl;
import java.util.List;
import com.packt.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.impl.InMemoryProductRepository;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService{
	private ProductRepository productRepository = new InMemoryProductRepository();
	@Override
	public void updateAllStock(){
		List<Product> allProducts = productRepository.getAllProducts();
		for (Product product : allProducts){
			if(product.getUnitsInStock() < 500)
				productRepository.updateStock(
					product.getProductId(), product.getUnitsInStock()+1000);
		}
	}

	@Override
	public List<Product> getAllProducts(){
		return productRepository.getAllProducts();
	}

	@Override
	public List<Product> getProductsByCategory(String category){

		return productRepository.getProductsByCategory(category);
	}

	@Override
	public List<Product> getProductsByFilter(Map<String,List<String>> filterParams){

		return productRepository.getProductsByFilter(filterParams);
	}

	@Override
	public Product getProductById(String productID){

		return productRepository.getProductById(productID);

}

	@Override
	public List<Product> filterProducts(String productCategory, 
		Map<String,Object> filterParams, String manufacturer){

		return productRepository.filterProducts(productCategory,filterParams, manufacturer);
	}

	@Override
	public void addProduct(Product product){

		productRepository.addProduct(product);
	}

}

