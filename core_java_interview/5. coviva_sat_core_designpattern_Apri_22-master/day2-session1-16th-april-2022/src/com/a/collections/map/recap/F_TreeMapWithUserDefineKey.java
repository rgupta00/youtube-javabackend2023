package com.a.collections.map.recap;
import java.util.*;
public class F_TreeMapWithUserDefineKey {

	public static void main(String[] args) {
		//YOUR KEY MSUT IMPLEMENT comparable otherwise u would get CCEx
		
		TreeMap<Key, String> map=new TreeMap<Key, String>(new Comparator<Key>() {

			@Override
			public int compare(Key o1, Key o2) {
				return Integer.compare(o2.getK(), o1.getK());
			}
		});
		map.put(new Key(44), "44");
		map.put(new Key(4), "4");
		
		System.out.println(map);
		
	}
}
