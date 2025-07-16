package com.collection.list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class SetTest {

	public static void main(String[] args) {


		TreeSet ts = new TreeSet();
		ts.add(9);
		ts.add(10);
		ts.add(4);
		ts.add(2);
		ts.add(6);
		ts.add(7);
		ts.add(8);
		ts.add(1);
		System.out.println(ts);
		SortedSet ss = ts.reversed();
		System.out.println(ss);
		
		System.out.println(ts.first());//lowest
		System.out.println(ts.last());//highest
		
		System.out.println("floor : "+ts.floor(7));//<=
		System.out.println("lower : "+ts.lower(7));//<
		
		System.out.println("Ceiling : "+ts.ceiling(7));//>=
		System.out.println("higher : "+ts.higher(7));//>
		
		System.out.println("floor : "+ts.subSet(2, 8));
		
		System.out.println("head of set : "+ts.headSet(5));//Top elems
		System.out.println("tail of set: "+ts.tailSet(5)); //bottom elmns

		
		
		
	
		
		
		
		
		
	}

}
