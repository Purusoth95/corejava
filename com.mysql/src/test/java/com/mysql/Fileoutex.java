package com.mysql;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutex {

	public static void main(String[] args) throws IOException {
		String location="usingtext2.txt";
		String content="am happy";
		FileOutputStream stream=new FileOutputStream(location);
		byte[] file=content.getBytes();
		stream.write(file);
		stream.close();
		
		
		

	}

}
