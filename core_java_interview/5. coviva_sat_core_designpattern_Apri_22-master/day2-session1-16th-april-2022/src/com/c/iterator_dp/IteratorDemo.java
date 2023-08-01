package com.c.iterator_dp;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Menu menu=new Menu();
		menu.addItem(new Item("laptop", 59999.0));
		menu.addItem(new Item("mouse", 999.0));
		menu.addItem(new Item("lcd", 51999.0));
		
		Iterator<Item> iterator=menu.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
