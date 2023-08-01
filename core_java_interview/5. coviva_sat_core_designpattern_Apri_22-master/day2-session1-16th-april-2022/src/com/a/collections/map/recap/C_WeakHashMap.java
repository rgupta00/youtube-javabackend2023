package com.a.collections.map.recap;

import java.util.*;

public class C_WeakHashMap {

	public static void main(String[] args) throws InterruptedException {
		//WeakHashMap
		WeakHashMap<Key, String>map=new WeakHashMap<Key, String>();
		Key key=new Key(22);
		map.put(key, "22");
		
		key=null;
		
		System.gc();
		
		Thread.sleep(2000);
		
		System.out.println(map);
	}
}
