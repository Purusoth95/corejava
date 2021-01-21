package com.lao.interviewjava;

public class StringRe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given="purushoth";
		char[] list=given.toCharArray();
		String reversed="";
		
		for(int i=list.length-1;i>=0;i--) {
			reversed=reversed+list[i];
			System.out.println(reversed);
			
			
		}
	}

	

}
