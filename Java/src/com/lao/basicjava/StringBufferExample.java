package com.lao.basicjava;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("agni");
		System.out.println(b.append("arya"));
		System.out.println(b.reverse());
		System.out.println(b.delete(0, 3));
		System.out.println(b.reverse());
		System.out.println(b.insert(5, "arya"));
		System.out.println(b.capacity());
		                     

	}

}
