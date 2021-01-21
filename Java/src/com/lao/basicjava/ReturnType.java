package com.lao.basicjava;

public class ReturnType {
	Integer collectedAmount=1000;
	
	public Integer collectedAmountGiveTome() {
		System.out.println("daddy have collected rupees :"+collectedAmount+"\n"+"send it you");	
		return collectedAmount ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnType type=new ReturnType();
		Integer amount=type.collectedAmountGiveTome();
		System.out.println("got the amount"+amount);
		
		

	}

}
