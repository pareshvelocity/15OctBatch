package com.test;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList<Integer> ll =new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		//First way
		System.out.println(ll);
		
		//Second way for each
		for(int i:ll) {
			System.out.println(i);
		}
		
		//Third way interator
		Iterator<Integer> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
