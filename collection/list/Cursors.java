package com.collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Vector;

public class Cursors {

	public static void main(String[] args) {


		Vector l = new Vector();	
		l.add(1);
		l.add(2);
		l.add(null);
		l.add(null);
		System.out.println(l);
		
	Arrays.sort(new int[]{1,2});
		
		ListIterator itr = l.listIterator();	
		
		while(itr.hasNext()) {
			
			Object o = itr.next();
			
			if( o!=null && (o.equals(1)))
				itr.add("hyyyyyyyyyyy");
	
		System.out.println(o);
			
		}
		
		System.out.println(l);
		
		
		
		
		
		
		
		
		
		
		
		/*
		TreeSet s = new TreeSet();
		s.add(1);
		s.add(10);
		s.add(13);
		s.add(34);
		s.add(2);
		System.out.println(s);
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			
			Object o = itr.next();
			
			if(o.equals(10))
				itr.remove();
			
			System.out.println(o);
		}
		
		
		System.out.println(s);
		*/	
		
		
	}

}
