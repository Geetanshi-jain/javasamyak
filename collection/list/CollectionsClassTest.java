package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class CollectionsClassTest {

	public static void main(String[] args) {
	
		
	
		
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(9);
		l.add(2);
		l.add(2);
		l.add(7);
		l.add(0);
		
		LinkedList l1 = new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(9);
		l1.add(2);
		l1.add(2);
		l1.add(7);
		
		
		System.out.println("Before soring : "+l);
		Collections.sort(l);
		System.out.println(l);
		
		int idx = Collections.binarySearch(l,9);
		System.out.println("The list has a element "+l.get(idx)+" at position "+idx);
		
		Comparable min = Collections.min(l);
		System.out.println(min);
		
		Comparable max = Collections.max(l);
		System.out.println(max);
		
		
		System.out.println(Collections.frequency(l, 2));
		System.out.println(Collections.disjoint(l, l1));
		
		
		
		
		
		Collections.fill(l, 5);;
		System.out.println(l);
		

	
	
	}
}
