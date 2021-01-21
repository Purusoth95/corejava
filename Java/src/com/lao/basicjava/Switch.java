package com.lao.basicjava;

public class Switch {
	String hero="superman";
	public void Herono() {
		switch(hero) {
		case  "Iron man":
			System.out.println("your thoughts iron man");
			break;
		case "sakthiman":
			System.out.println("your thoughts sakthiman");
		case "badman":
			System.out.println("your thoughts badman");		
		default:
			System.out.println("sorry i can't guess you");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch ok=new Switch();
		ok.Herono();

	}

}
