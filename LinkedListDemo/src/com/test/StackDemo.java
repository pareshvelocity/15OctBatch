package com.test;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s = new Stack<>();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		System.out.println(s);
		System.out.println(s.search("P"));
		
		
	}

}
