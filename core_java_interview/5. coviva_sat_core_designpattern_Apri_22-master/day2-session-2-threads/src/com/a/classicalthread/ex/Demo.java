package com.a.classicalthread.ex;

public class Demo {
	int a=0, b=0, c=0;
	volatile int x=0;
	void writeTherad() {
		a=1;
		b=1;
		c=1;
		
		x=1;// write to volatile
	}
	
	void readTherad() {
		int r=x;
		int d1=a;
		int d2=b;
		int d3=c;
	}
}
