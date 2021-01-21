package com.lao.basicjava;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExamples {

	public static void main(String[] args) {
		
		List<String> arraylist=new ArrayList<String>();
		arraylist.add("Audi");
		arraylist.add("Benz");
		arraylist.add("Bugatti");
		arraylist.add("Aston Martin");
		System.out.println("total number arraylist:"+arraylist);
		arraylist.add("hamour");
		System.out.println(arraylist);
		//arraylist.clear();
		//System.out.println(arraylist);
		arraylist.add(3, "Ambasodor");
		System.out.println(arraylist);
		System.out.println(arraylist.lastIndexOf("Audi"));
		System.out.println(arraylist.lastIndexOf("Bugatti"));
		List<String>anotherlist=new ArrayList();
		anotherlist.addAll(arraylist);
		System.out.println(anotherlist);
		//anotherlist.clear();
		System.out.println(anotherlist);
		System.out.println(arraylist);
		anotherlist.add(null);
		anotherlist.set(0,"maruthi");
		System.out.println(anotherlist);
		System.out.println(anotherlist.remove(1));
		anotherlist.set(1, "honda");
		System.out.println(anotherlist);
		System.out.println(anotherlist.get(5));
		System.out.println(anotherlist.isEmpty());		
		for(int size=0;size<anotherlist.size(); size++) {
			System.out.println(anotherlist.get(size));
			System.out.println(anotherlist.getClass());
		}
		
		for (String string : anotherlist) {
			System.out.println(string);
			
		ListIterator listiterator=anotherlist.listIterator();{
		
		while(listiterator.hasPrevious()) {
			
			System.out.println(listiterator.previous());
			
		}
	
		
	}
		try {
			for (String string2 : anotherlist) {
				System.out.println("hi:"+string2);
				
				
				
			}
		}catch(Exception e) {
			System.out.println("Dude! You are trying to modify a list while a read operation is happening");
		}
		
		
		
		
		
		}}}
	

