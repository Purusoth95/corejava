package com.lao.basicjava;

public class Statsmethod {
	
	public static void display() {
		//method(); 
		System.out.println("haii");
	}
	public void method() {
		display(); //we can call static method from non static method but not otherwise
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statsmethod stat=new Statsmethod();
		 //stat.display();
		//display();
		//method(); //it will accur obeject 
		stat.method();
	}

}

//static is keyword
//1. can be used with class, variable, method block
//2.belong to the class instead of a specific instance.
//this mean if you make a member static, you can access it without object