package com.lao.basicjava;

public class Supers extends Child {

public void stats() { //final abstract static is not allowed
	//jvm default mention super.keyword
	System.out.println("child class created");
}

	public static void main(String[] args) {
		Supers su=new Supers();
		su.stats();
		 

	
	}
}
