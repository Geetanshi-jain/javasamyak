package com.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
	
		
		ArrayList al = new ArrayList();
		al.add("Helllloo");
		
		LinkedList l = new LinkedList();
		l.add(al);
		l.add(1);
		l.add(2);
		l.add("hyy");
		l.add(true);
		l.add(null);
		l.add(null);
		
		l.forEach(o -> System.out.println("forEach : "+o));
		
		
		
		System.out.println(l);
		System.out.println(l.hashCode());
		System.out.println(l.peek());
		System.out.println(l);
		
		System.out.println(l.poll());
		System.out.println(l);
		System.out.println(l.pop());
		System.out.println(l);
		
		
		System.out.println(l.remove(2));
		System.out.println(l);
		
		System.out.println(l.set(0, "Sayyyyyy"));
		System.out.println(l);
		
		System.out.println(l.reversed());
		System.out.println(l.subList(0, 3));
		
		
		
		l.clear();
		System.out.println(l);
	}

}
