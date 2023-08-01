package com.demo;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.demo"})
public class AppConfig {
	
	@Bean(name="foo", initMethod = "beanAnnotationWalaInit", destroyMethod = "beanAnnotationWalaDestroy")
	public Foo getFoo() {
		Foo foo=new Foo();
		foo.setMessage("initial foo message");
		return foo;
	}
	@Bean
	public static BeanPostProcessor getBeanPostProcessor1() {
		return new BPP1();
	}
	@Bean
	public static BeanPostProcessor getBeanPostProcessor2() {
		return new BPP2();
	}
	
	@Bean
	public static BeanFactoryPostProcessor getBeanFactoryPostProcessor() {
		return new BeanFactoryPP();
	}

}
