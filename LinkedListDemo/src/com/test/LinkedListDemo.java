package com.test;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//Creating an object of LinkedList
		LinkedList ll = new LinkedList<>();
		ll.addLast("pune");
		ll.add(10);
		ll.add("ram");
		ll.add(10);
		ll.add(null);
		ll.addFirst("first");
		ll.addLast("mumbai");
		ll.add(3, "banglore");
		ll.remove(2);
		
		System.out.println(ll);
		

	}

}
