package com.lao.basicjava;

public class Polimer {
	int add(int m,int n) {
		return m+n;
	}
	int sub(int m1, int m2, int m3) {
		return m1-m2-m3;
	}
	int mul(int n, int n2) {
		return n*n2;
	}

	public static void main(String[] args) {
		Polimer pol=new Polimer();
		System.out.println("sum of two number :"+pol.add(12, 13));
		System.out.println("sum of two number :"+pol.sub(1, 2, 3));
		System.out.println("sum of multiple number :"+pol.mul(45, 52));
	}

}
// what is polimorphism ?
//		 polymorphism is the capability of a method(function) to do different things based
//		 on the object that it is acting upon.
//Types :
//	1.static/Compile/early binding(Overloading)
//	2.Dynamic/RunTime/late binding(overriding)
//
//this is call overloading 
//same method name should me same
//different argument return can be anything