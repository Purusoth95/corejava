package com.lao.Contructor;

public class Noargument {
	String name;
	int rollno;
	
	Noargument(){
		name="purusothaman";
		rollno=1234568;
	System.out.println("student created");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Noargument argus=new Noargument();
	System.out.println(argus.name);
	System.out.println(argus.rollno);

	}

}
