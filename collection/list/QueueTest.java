package com.collection.list;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;


public class QueueTest {

	public static void main(String[] args) {


		//ArrayList al = new ArrayList();
		//Queue pq = new ArrayDeque(al);
		
		ArrayDeque pq = new ArrayDeque();
		pq.add(1);
		pq.add(2);
		pq.add(4);
		pq.add(3);
		pq.add(7);
		pq.add(6);
		
		System.out.println(pq);
		System.out.println(pq.pollFirst()); //Front/begin deletion
		System.out.println(pq);
		System.out.println(pq.pollLast()); //Rear/Ending  deletion
		System.out.println(pq);
		
		pq.push(100);  // front/Begin Insertion
		System.out.println(pq);
		
		
		pq.offer(1000);  // Rear/Ending Insertion
		System.out.println(pq); 
	}

}
