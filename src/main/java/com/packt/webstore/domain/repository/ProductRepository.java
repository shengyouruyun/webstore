package com.packt.webstore.domain.repository;
import java.util.List;
import com.packt.webstore.domain.Product;
import java.util.List;
import java.util.Map;
public interface ProductRepository {
	List<Product> getProductsByFilter(Map<String,List<String>>filterParams);
	List<Product> getProductsByCategory(String category);
	List<Product> getAllProducts();
	void updateStock(String productId, long noOfUnits);

	Product getProductById(String productID);
	List<Product> filterProducts(String productCategory, 
		Map<String,Object> filterParams, String manufacturer);

	void addProduct(Product product);
}