package com.a.enum_ex;

import java.util.EnumSet;

enum Counter {
	ONE(1), TWO(2), THREE(3), FOUR(4);

	private Counter(int val) {
		this.val = val;
	}

	private int val;

	public int getVal() {
		return val;
	}

}

public class E_Enum_Set {

	public static void main(String[] args) {
		for(Counter counter: EnumSet.range(Counter.TWO, Counter.FOUR)) {
			System.out.println(counter);
		}
	}
}





