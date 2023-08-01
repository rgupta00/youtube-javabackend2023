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

	@PostConstruct
	public void annotationWalaInit() {
		System.out.println("---------------------");
		System.out.println("annotation WalaInit is called");
		System.out.println("---------------------");
	}

	public void print() {
		System.out.println("printing value of message: " + message);
	}

	@PreDestroy
	public void annotationWalaPreDestroy() {
		System.out.println("annotation Wala PreDestroy is called");
	}

}
