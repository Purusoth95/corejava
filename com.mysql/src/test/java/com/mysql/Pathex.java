package com.mysql;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pathex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="usingtext2.txt";
		String content="am happy";
		Path path=Paths.get(location);
		Files.write(path, content.getBytes());
		
	}

}
