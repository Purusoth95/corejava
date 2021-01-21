package com.lao.basicjava;

public class Overri2 extends Overri1{
	@Override
	public void marriage() {
		System.out.println("no my rules");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overri1 over=new Overri2(); //this is dynamic polimerphism
		over.propertiest();
		over.marriage();
		

	}

}
