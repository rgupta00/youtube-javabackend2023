package com.a.enum_ex;
import java.util.*;
public class F_Enum_Map {

	public static void main(String[] args) {
		EnumMap<Counter, String> enumMap=
				new EnumMap<Counter, String>(Counter.class);
		
		enumMap.put(Counter.ONE, "one");
		
		Counter counter= Counter.ONE;
		
		
		Counter counter2= Counter.TWO;
		
		if(counter==counter2) {
			
		}
		
	}
}
