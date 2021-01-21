package com.mysql;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bufferedred {

	public static void main(String[] args) throws Exception {
		String location="usingtext2.txt";
		FileReader file=new FileReader(location);
		BufferedReader reader=new BufferedReader(file);
		//String currentline=reader.readLine();
		//System.out.println(currentline);
		String currentline;
		while((currentline=reader.readLine())!=null) {
			
		}
		System.out.println(currentline);
		
		

	}

}
