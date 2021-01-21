package com.lao.Contructor;

public class ConsOver {
	String draw;	
	ConsOver(){
		System.out.println("draw object created");
	}
	ConsOver(String Todraw){
		draw=Todraw;
		System.out.println("Drawing"+Todraw);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsOver over=new ConsOver();
		ConsOver over1=new ConsOver("circle");

	}

}
