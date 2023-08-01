package com.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPP implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryPP--postProcessBeanFactory method is called ");
		BeanDefinition bd=beanFactory.getBeanDefinition("foo");
		MutablePropertyValues mp=bd.getPropertyValues();
		mp.addPropertyValue("message", "new value ie changed using BeanFactoryPP");
	}

}
