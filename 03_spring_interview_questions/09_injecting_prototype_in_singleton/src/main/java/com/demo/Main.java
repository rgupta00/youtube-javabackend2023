package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Foo foo=ctx.getBean("foo", Foo.class);
		
		foo.printValue();
		
		Thread.sleep(1000);
		
		foo.printValue();



	}
}
