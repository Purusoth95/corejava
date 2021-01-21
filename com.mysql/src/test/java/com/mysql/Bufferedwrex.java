package com.mysql;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedwrex {

	public static void main(String[] args) throws IOException {
		String location="usingtext1.txt";
		String content="am happy";
		FileWriter file=new FileWriter(location);
		BufferedWriter bufferwrite=new BufferedWriter(file);
		bufferwrite.write(content);
		
		
		// performance wise effective 

	}

}
