package com.demo2;

import java.util.*;

import com.demo.Employee;

public class DemoGenerics2 {
	// dont mix wine with milk
	public static void main(String[] args) {
		// Why generics: compile time funda==> generics code is only providing compile
		// time safty
		// IMP: gen is not avaiable at run time

		List<Employee> eList = new ArrayList<>();
		eList.add(new Employee(1, "raj", 89999));

		eList.add(new Employee(12, "ekta", 89999));

		System.out.println("for emps");
		print(eList);

		List<Integer> list = new ArrayList<Integer>();
		list.add(44);
		list.add(84);
		list.add(4);
		list.add(94);
		System.out.println("for ints");
		print(list);

		List<Double> list2 = new ArrayList<>();
		list2.add(44.99);
		list2.add(84.9);
		list2.add(4.0);
		list2.add(94.55);
		System.out.println("for doubles");
		print(list2);
	}

	// if we ignore the data type then the logic is same==> DRY => dont reapeat
	// yourself
//	static void print(List<? extends Object> list) {
//		
//		//list.add(33); u can not change the list
//		
//		for(Object temp: list) {
//			System.out.println(temp);
//		}
//	}

	static void print(List<? > list) {

		// list.add(33); u can not change the list

		for (Object temp : list) {
			System.out.println(temp);
		}
	}

}
