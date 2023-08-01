package com.demo.backup;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Foo implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware{

	private String message;

	public Foo() {
		System.out.println("foo default ctr");
	}

	@PostConstruct
	public void annotationWalaInit() {
		System.out.println("annotation WalaInit is called");
	}
	
	@PreDestroy
	public void annotationWalaPreDestroy() {
		System.out.println("annotation Wala PreDestroy is called");
	}
	
	public void xmlWalaInit() {
		System.out.println("xmlWalaInit is called");
	}
	
	public void xmlWalaDestroy() {
		System.out.println("xmlWalaDestroy is called");
	}
	
	public void setMessage(String message) {
		System.out.println("foo setMessage is called");
		this.message = message;
	}
	
	public void print() {
		System.out.println("-----------------------");
		System.out.println("printing value of message: "+ message);
		System.out.println("-----------------------");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet of InitializingBean is called");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method of DisposableBean is called");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName(String name) : is called :"+ name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("void setBeanFactory(BeanFactory beanFactory) is called");
	}
	
	
	
}
