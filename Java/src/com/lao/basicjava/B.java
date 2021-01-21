package com.lao.basicjava;

public class B {
	static int i;
	static int j;

	public static void main(String[] args) {
		B a1=new B();
		int k=10;
		System.out.println(k);
		//B a1=new B();
		a1.test();
		
	}
	public void test() {
		
		System.out.println(i);
		System.out.println(a1.j); // cannot be invoked 
	}
}
