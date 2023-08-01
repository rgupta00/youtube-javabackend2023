package com.a.collections.map.recap;
import java.util.*;
public class E_MapWithUserDefineKey {

	public static void main(String[] args) {
		//YOUR KEY MSUT IMPLEMENT equals and hashcode correctly otherwise u would not be able to get ur data back
		
		Map<Key, String> map=new HashMap<Key, String>();
		map.put(new Key(22), "22");
		
		System.out.println(map.get(new Key(22)));
	}
}
