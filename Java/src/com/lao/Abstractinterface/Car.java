package com.lao.Abstractinterface;

public abstract class Car {
	public abstract void enginesecret(); //{
//		System.out.println("engine secret");
		
	//}
	public abstract void companyvault(); //{
		//System.out.println("companyvault");
	//}
	
	public void display() {
	System.out.println("my own engine");
	
	//cann't create object and main function it's abstract class 0 to 100 % abstract
		
	
}
}
//1.if a class having , an unimplemented method, then the method should be declared abstract.
//2.if a class is having one obstract method then it should be declared abstract
//3.it may or may not have implementation methods
//4.A class can be declared abstract even if doesn't have abstract methods 
//
//can we create object for abstract class ? NOOOOOOOO
//		
//6.If a child doesn't implement all the abstract methods of parent class, then the child class
//must need to be declared abstract as well.