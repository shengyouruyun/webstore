package com.packt.webstore.service;
import java.util.List;
import com.packt.webstore.domain.Product;
import java.util.Map;

public interface ProductService{
	List<Product> getProductsByCategory(String category);
	List<Product> getAllProducts();
	void updateAllStock();
	List<Product> getProductsByFilter(Map<String,List<String>> filterParams);
	Product getProductById(String productID);


	List<Product> filterProducts(String productCategory, 
		Map<String,Object> filterParams, String manufacturer);


	void addProduct(Product product);
}






