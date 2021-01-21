package com.lao.basicjava;

public class Statsvariable {
	static Integer accountbalance;
	String name;
	public static void main(String[] args) {
		Statsvariable st=new Statsvariable();
		accountbalance=1000;
		st.name="Arya";
		
		Statsvariable st1=new Statsvariable();
		accountbalance=2000;
		st1.name="purusoth";
		System.out.println("bankaccount :"+accountbalance);
		System.out.println("customername :"+st.name);
		System.out.println("bankaccount1:"+accountbalance);
		System.out.println("customer name :"+st1.name);
	}
}
//1.common to all the instances (or objects) of the class because it is a class level variable
//2. only a single copy of static variable is created and 
//shared among all the instances of the class.
