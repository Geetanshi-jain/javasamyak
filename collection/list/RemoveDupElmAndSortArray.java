package com.collection.list;

import java.util.TreeSet;
import java.util.Collections;
import java.util.List;

public class RemoveDupElmAndSortArray {

	public static void main(String[] args) {

		int[] a = {8,1,2,2,3,2,4,5,6,7,6,6};
		int size = a.length;
		
	
		Object[] unique = removeDuplicateElmAndSortArray(a,size);
		for(var elm : unique)
			System.out.println(elm);
		
	}
	
	public static Object[] removeDuplicateElmAndSortArray(int[] a, int size) {
	
		TreeSet<Integer> ts = new TreeSet<>();
		
		
		for(int i = 0; i<size; i++)
			ts.add(a[i]);
		//System.out.println(ts);
			
			
			return ts.reversed().toArray();
			
	}
	

}
