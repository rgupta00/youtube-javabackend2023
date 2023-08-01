package com.demo;
import java.util.*;
public class DemoComprableVsCompartor {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(18, "sunita", 780000));
		list.add(new Employee(1, "raj", 700000));
		list.add(new Employee(166, "keshav", 600000));
		
		printEmps(list);
		
		Collections.sort(list);		
		System.out.println("---sorted as per id---");
		printEmps(list);
		
		Collections.sort(list, new EmpSalarySorter());
		
		System.out.println("---sorted as per salary--");
		printEmps(list);
		
		Collections.sort(list, new EmpNameSorter());
		
		System.out.println("---sorted as per name--");
		printEmps(list);
		

	}

	private static void printEmps(List<Employee> list) {
		Iterator<Employee> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
