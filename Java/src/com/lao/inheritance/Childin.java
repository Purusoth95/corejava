package com.lao.inheritance;

public class Childin extends Parentin {
	
	public void get() {
		System.out.println(wheels);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childin child1=new Childin();
		
		child1.engine();
		child1.get();
	}

}

//1. process of acquiring the properties (data+methods)
//
//2.the one which takes-child class
//3.the one which gives-parent class
//
//how to inherit ? Using extends keyword
//		
//		IS-A relationship
//
//access modiers :
//	1. default= when no access modifier is specified
//	2. private-only within the class in which they are declared.
//	3. protected-within same package/sub classes in different package.
//	4. public- from everywhere in the program.