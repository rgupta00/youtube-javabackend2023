package com.demo2;
import java.util.*;

import com.demo.Employee;
public class DemoGenerics {
	//dont mix wine with milk
	public static void main(String[] args) {
		//Why generics: compile time funda==> generics code is only providing compile time safty
		//IMP: gen is not avaiable at run time
		List<Integer> list=new ArrayList<Integer>();
		list.add(44);
		list.add(84);
		list.add(4);
		list.add(94);
		
		stanageMethod(list);
		int total=0;
		for(Integer temp: list) {
			total+=temp;
		}
		
		System.out.println(total);
	}

	private static void stanageMethod(List list) {
		list.add("foo");
	}
}
