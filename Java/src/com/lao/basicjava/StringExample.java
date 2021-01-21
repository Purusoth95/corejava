package com.lao.basicjava;

public class StringExample {
	public static void main(String[] args) {
		String name="purushothaman";
		int number=3;
		System.out.println(name.charAt(1));
		System.out.println(name.compareTo("balaji"));
		System.out.println(name.indexOf("n"));
		System.out.println(name.indexOf("p-n", 9));
		System.out.println(name.length());
		System.out.println(name.equals("murali"));
		System.out.println(name.equalsIgnoreCase("murali"));
		System.out.println(name.isEmpty());
		System.out.println(name.concat("balaji"));
		System.out.println(name);
		System.out.println(name.endsWith("a"));
		System.out.println(name.replace("h", ""));
		System.out.println(name.replace("h", "H"));
		System.out.println(name);
		System.out.println(name.replace("purushothaman", "murali"));
		System.out.println(name.indexOf("u", 2));
		System.out.println(name.trim());
		System.out.println(name.valueOf(number));
		System.out.println(name.join("-", "purusoth","amman"));
		System.out.println(name.join("-", "30","12","1991"));
		String splitthis="am,i,teaching,good";
		String[] splitwords=splitthis.split("-");
		for (String string : splitwords) {
			System.out.println(string);		
		}
	}
}
