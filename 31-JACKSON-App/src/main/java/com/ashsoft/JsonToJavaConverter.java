package com.ashsoft;

import java.io.File;

import com.ashsoft.binding.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConverter {

	public static void main(String[] args) throws Exception{
		
		
		ObjectMapper mapper = new ObjectMapper();
		
		Product product= mapper.readValue(new File("product.json"),Product.class);
		
		System.out.println(product);
	}

}
