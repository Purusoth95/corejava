package com.mysql;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriterex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location="usingtext.txt";
		String content="hai";
		FileWriter file=new FileWriter(location);
		file.write(content);

	}

}
