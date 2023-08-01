package com.productapp.web;

import java.sql.SQLException;
import java.util.List;

import com.productapp.dto.Product;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		ProductService productService=new ProductServiceImpl();
		
		//----------------------printing all products-------------------
		List<Product> list;
		try {
			list = productService.getAll();
			list.forEach(p-> System.out.println(p));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//---------------------get a particular product-------------------
//		System.out.println("---------------------get a particular product-------------------");
//		Product product=productService.getById(100);
//		System.out.println(product);
		
//		System.out.println("---------------------add product----------------");
//		Product product=new Product("pen set", .3);
//		product=productService.addProduct(product);
//		System.out.println(product);
		
		System.out.println("---------------------update product----------------");
	//	productService.updateProduct(6	, .4);
		
	}

}
