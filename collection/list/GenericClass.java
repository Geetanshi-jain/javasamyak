package com.collection.list;

public class GenericClass<G, T> {

	
	G detail;
	T address;
	
	public GenericClass(G detail, T address) {
		this.detail = detail;
		this.address = address;

	}
	
	public G getDetail() {
		return this.detail;
	}	
	
	public T getAddress() {
		return this.address;
	}
}
