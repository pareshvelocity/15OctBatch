package com.test;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.addElement("pune");
		v.addElement("mumbai");
		v.addElement("delhi");
		v.addElement("banglore");
		
		System.out.println(v);
		System.out.println("capacity "+v.capacity()); //10
		System.out.println("Size>> "+ v.size());  //4
		

	}

}
