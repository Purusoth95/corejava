package com.lao.Contructor;

public class Parameter {
	String animal_name;
	String animal_type;
	
	Parameter(String name,String type){
		animal_name=name;
		animal_type=type;
		
	}
	public void sayaboutanimal() {
		System.out.println("animal name is :"+animal_name+" and type is "+animal_type);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameter meter= new Parameter("lion","domoestic animal");
		meter.sayaboutanimal();

	}

}
