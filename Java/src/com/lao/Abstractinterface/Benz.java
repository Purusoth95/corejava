package com.lao.Abstractinterface;

public class Benz extends Car{
	
	@Override
	public void enginesecret() {
		System.out.println("Benz engine secret");
		
	}
	@Override
	public void companyvault() {
		System.out.println("Benz companyvault");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Benz();
		car.enginesecret();
		car.companyvault();
		
			
	}

}
