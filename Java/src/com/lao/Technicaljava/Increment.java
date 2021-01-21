package com.lao.Technicaljava;

public class Increment {

	public static void main(String[] args) {
	
		int i=10;
		int j=i++ + ++i + ++i;
		System.out.println("i value :"+i);
		System.out.println("j value :" +j);
		
		int k=1;
		int l=k++ + ++k;
		System.out.println("k value is :"+k);
		System.out.println("L value is :"+l);

	}

}
