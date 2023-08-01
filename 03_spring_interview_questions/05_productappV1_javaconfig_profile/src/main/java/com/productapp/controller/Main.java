package com.productapp.controller;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.productapp.config.AppConfig;
import com.productapp.service.ProductService;

public class Main {

	public static void main(String[] args) {
	
		//-Dspring.profiles.active=dev
		//System.setProperty("spring.profiles.active", "test");
		
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);

		
		ProductService productService = (ProductService) ctx.getBean("productservice");
		
		List<String> list = productService.getAll();
		list.forEach(product -> System.out.println(product));

	}
}







