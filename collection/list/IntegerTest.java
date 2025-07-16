package com.collection.list;

public class IntegerTest {

	public static void main(String[] args) {
		
		int i1 = 10;
		int i2 = 10;
		
		
		Integer intClass = new Integer(10);
		Integer intClass1 = new Integer(300);
		
		System.out.println(i1==i2);
		System.out.println(intClass==intClass1);
		System.out.println(intClass.equals(intClass1));
		System.out.println(intClass==i1);
	}

}
