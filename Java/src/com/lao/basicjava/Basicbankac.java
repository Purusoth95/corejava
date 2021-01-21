package com.lao.basicjava;

public class Basicbankac {
	
	Long acNo=628345756954l;  // class having method(function)+data)
	String Holdername="purushothaman";
	Integer accountbalance=850;
	
	public void getbalance() {
		System.out.println("balance is :"+accountbalance+"\n"+"holdername :"+Holdername+"\n"+"account number :"+acNo);
		System.out.println("balance is "+ ":"+accountbalance+"\n"+"Holdername is :"
						+ ""+Holdername+"\n"+"accountnumber:"+acNo);
	}
	public static void main(String[] args) { // dis is entry point of main fuction
		// TODO Auto-generated method stub
		Basicbankac ac=new Basicbankac();

		ac.getbalance();
	}

}
