package com.demo;

import java.util.*;

//What is annotation : aka meta data @Override, u can create ur own annotation
class A{
	void foo() {
		System.out.println("foo of class A...");
	}
	@Deprecated
	public void oldApi() {
		System.out.println("some old code... 2010");
	}
}
class B extends A {
	//What i want to do: overriding but my mistake i did overloading :(
	
	@SuppressWarnings({"rawtypes","unused"})
	@Override
	void foo() {
		List l=new ArrayList();
		System.out.println("foo of class B...");
	}
}
public class Demo {

	public static void main(String[] args) {
		A a=new B();
		a.foo();
		
		a.oldApi();
		
		Date date=new Date();
		System.out.println(date.getDay());// it is a bad prog practice to use decrepected method
	}
}




