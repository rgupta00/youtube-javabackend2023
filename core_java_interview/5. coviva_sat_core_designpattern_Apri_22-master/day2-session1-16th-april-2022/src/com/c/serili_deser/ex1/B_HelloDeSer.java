package com.c.serili_deser.ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class B_HelloDeSer {

	//Why we have to ClassNotFoundException this ex?
	public static void main(String[] args) throws FileNotFoundException, IOException, 
	ClassNotFoundException {
		//other party must be doing reverse of it
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("foo.ser")));
		Account account=(Account) ois.readObject();
		
		System.out.println(account);
	}
}
