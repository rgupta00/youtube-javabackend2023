package com.a.collections.list;
import java.util.*;
/*
 * List: AL, LL, Vector
 * java 5: generics
 */
public class B_DemoCollection2 {

	public static void main(String[] args) {
		//generics* "is a compile time safty net"
		
		List<Integer>  list=new ArrayList<Integer>();
		list.add(55);
		list.add(5);
		list.add(8);
		list.add(90);
		//move, del  CRUD op			move
		//Iterator, ListIteratror, Enumeration(Vector)
		
		ListIterator<Integer> it=list.listIterator(list.size());
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
//		Iterator<Integer> it=list.iterator();
//		it.next();
//		it.next();
//		it.remove();
//		it.remove();
//		System.out.println(list);
		
		//System.out.println(list);
		//how to print the value?
		//enhacne for loop===> syntex suger(Iterator Design pattern)
//		for(Integer temp: list) {
//			System.out.println(temp);
//		}
		
//		Iterator<Integer> it=list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
	}
}
