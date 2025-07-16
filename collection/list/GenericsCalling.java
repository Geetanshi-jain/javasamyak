package com.collection.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class GenericsCalling {

	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList();
		
		l.add(1);
		l.add(2);
		l.add(null);
		l.add(null);
		
		System.out.println(l);
		
		Map<Character, String> m = new HashMap<>();
		m.put('A', "Disha");
		m.put('D', "Geetanshi");
		m.put('E', "Sneha");
		m.put('B', "Ujjwal");
		m.put('C', "Yash");
		System.out.println(m);
	}

}
