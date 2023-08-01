package com.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Foo {

	private String message;


	public void setMessage(String message) {
		this.message = message;
	}

	public Foo() {
		System.out.println("foo default ctr");
	}

	public void beanAnnotationWalaInit() {
		System.out.println("@Bean wala method (init)  is called");
		
	}
	
	
	@PostConstruct
	public void annotationWalaInit() {
		System.out.println("@PostConstruct wala method is called");
	}

	public void print() {
		System.out.println("----------------------");
		System.out.println("printing value of message: " + message);
		System.out.println("----------------------");
	}

	public void beanAnnotationWalaDestroy() {
		System.out.println("@Bean wala method (Destroy) is called");
		
	}
	
	@PreDestroy
	public void annotationWalaPreDestroy() {
		System.out.println("annotation Wala PreDestroy is called");
	}

}
