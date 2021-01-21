package com.lao.Technicaljava;

public class A {
	static A a;
	static int i;

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a.i);
		a.test();

	}
	public void test() {
		System.out.println(a.i);
	}

}
