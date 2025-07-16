package com.collection.list;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		
		LinkedHashMap hm = new LinkedHashMap();
		hm.put("if", 1);
		hm.put(true, 2);
		hm.put("three", 4);
		hm.put("three", 'A');
		System.out.println(hm);
		
		System.out.println(hm);
		System.out.println(hm.putFirst("Shunya", 0));
		System.out.println(hm);
		System.out.println(hm.firstEntry());
		System.out.println(hm.lastEntry());
		System.out.println(hm.pollFirstEntry());
		System.out.println(hm);
		System.out.println(hm.reversed());
		
		SequencedCollection sq =  hm.sequencedValues();
		System.out.println(sq.reversed());
		
		System.out.println(Integer.toHexString( sq.hashCode()) );
		
		
		
	
	}

}
