package com.lao.Abstractinterface;

public class BMW extends Car implements Interface1,Interface2{
	@Override
	public void enginesecret() {
		System.out.println("Bmw engine secret");
		
	}
	@Override
	public void companyvault() {
		System.out.println("Bmz companyvault");
	}
	

	public static void main(String[] args) {
		Car car=new BMW();
		car.enginesecret();
		car.companyvault();
		
		
		
	}
	
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("wheels");
		
	}
	public void motors() {
		// TODO Auto-generated method stub
		System.out.println("motors");
		
	}
	
}


