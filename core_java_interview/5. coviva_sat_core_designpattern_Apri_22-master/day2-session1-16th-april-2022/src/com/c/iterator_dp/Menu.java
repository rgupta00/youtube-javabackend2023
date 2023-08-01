package com.c.iterator_dp;

import java.util.*;

//why iterator design pattern, how to implement it?
//Iterator vs Iterable

public class Menu implements Iterable<Item> {
	List<Item> items;

	public void addItem(Item item) {
		items.add(item);
	}
	
	public Menu() {
		items = new ArrayList<Item>();
	}

	@Override
	public Iterator<Item> iterator() {
		return new MenuIterator();
	}

	class MenuIterator implements Iterator<Item> {
		int currPos = 0;

		@Override
		public boolean hasNext() {
			if (currPos >= items.size())
				return false;
			else
				return true;
		}

		@Override
		public Item next() {
			return items.get(currPos++);
		}

		@Override
		public void remove() {
			items.remove(--currPos);
		}

	}
}
