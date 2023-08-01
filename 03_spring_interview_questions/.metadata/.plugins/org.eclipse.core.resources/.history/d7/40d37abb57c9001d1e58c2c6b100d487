package com.productapp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.productapp.dao.ProductDaoImplArrrayList;
import com.productapp.dao.ProductDaoImplJdbc;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		ProductService productService = (ProductService) ctx.getBean("productservice");
		
		List<String> list = productService.getAll();
		list.forEach(product -> System.out.println(product));

	}
}







