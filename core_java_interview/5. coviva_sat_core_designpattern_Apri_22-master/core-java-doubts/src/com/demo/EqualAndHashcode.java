package com.demo;
import java.util.*;
//hashcode is imp to override iff u are using collection that is useing hashcode
public class EqualAndHashcode {
	
	public static void main(String[] args) {
		
		HashSet<Employee> set=new HashSet<Employee>();
		
		Employee employee1=new Employee(1, "raj", 70000);
		Employee employee2=new Employee(1, "raj", 70000);
		
		set.add(employee1);
		set.add(employee2);
		
		System.out.println(set.contains(new Employee(1, "raj", 70000)));
//		
//		if(employee1.equals(employee2))
//			System.out.println("yes");
//		else 
//			System.out.println("no");
	}

}
