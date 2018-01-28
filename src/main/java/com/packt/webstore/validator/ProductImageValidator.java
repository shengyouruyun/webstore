package com.packt.webstore.validator;

import org.springframework.validation.Validator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.packt.webstore.domain.Product;

@Component
public class ProductImageValidator implements Validator{

	private long allowedsize;


	public long getAllowedSize(){

		return this.allowedsize;

	}

	public void setAllowedSize(long size){

		this.allowedsize = size;

	}

	public boolean supports(Class<?> clazz){
		return Product.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors){

		Product product = (Product) target;

		long imageSize = product.getProductImage().getSize();

		if (imageSize > allowedsize){

			errors.rejectValue("productImage", "com.packt.webstore.validator.ProductImageValidator.message");
		}



	}









}