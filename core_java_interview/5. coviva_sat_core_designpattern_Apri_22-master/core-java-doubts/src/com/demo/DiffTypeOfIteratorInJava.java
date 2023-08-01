package com.demo;
import java.util.*;
public class DiffTypeOfIteratorInJava {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("raj");
		list.add("suman");
		list.add("anita");
		list.add("pooja");
		
		
		System.out.println(list);
		
		ListIterator<String> it=list.listIterator();
		while(it.hasNext()) {
			String name=it.next();
			if(name.equals("pooja")) {
				it.remove();
			}else if(name.equals("raj")) {
				it.set("rajiv");
			}else if(name.equals("anita")) {
				it.add("sunita");
			}
		}
		
		System.out.println(list);
		
		
//		ListIterator<String> it=list.listIterator(list.size());
//		while(it.hasPrevious()) {
//			System.out.println(it.previous());
//		}
	
		
		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//System.out.println(list);
		
		
//		System.out.println(list);
//		
//		Iterator<String> it=list.iterator();
//		while(it.hasNext()) {
//			it.next();
//			it.remove();
//		}
//		
//		System.out.println(list);
		
		
		
//		Vector<Integer> list=new Vector<Integer>();
//		list.add(44);
//		list.add(84);
//		list.add(4);
//		list.add(94);
//		//vector ke sath enumation use hota tha
//		Enumeration<Integer> en=list.elements();
//		while(en.hasMoreElements()) {
//			System.out.println(en.nextElement());
//		}
	}

}
