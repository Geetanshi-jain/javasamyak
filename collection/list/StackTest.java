package com.collection.list;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {


		
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(10);
		s.push(100);
		s.push(1000);
		
		System.out.println(" search() : "+s.search(10));
		
		int size = s.size();
		
		System.out.println(s);
		
		for(int i =0; i<size; i++) {
			
			if(!s.empty()) {
				s.pop();
				System.out.println("appying pop(): "+s);
				System.out.println("i : "+i);
			}

			
		}
		
	
	
	}

}
