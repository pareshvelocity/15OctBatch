package com.test;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v= new Vector<>();
		for(int i =1; i<=10; i++) {
			v.addElement(i);
		}
		
		System.out.println(v);
		System.out.println(v.capacity());//10
		v.remove(2);
		System.out.println(v);
		System.out.println(v.elementAt(3));  //5 

	}

}
