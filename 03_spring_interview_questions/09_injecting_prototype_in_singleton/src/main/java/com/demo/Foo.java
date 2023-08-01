package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "foo")
@Scope(value = "singleton")
 public class Foo {

	@Autowired
	private Bar bar;
	
	public void printValue() {
		System.out.println(bar.getBarValue());
	}

}
