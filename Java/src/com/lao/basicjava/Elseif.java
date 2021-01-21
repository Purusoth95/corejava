package com.lao.basicjava;

public class Elseif {
	String Myhero="super rman";
	public void Mysuperhero() {
		if(Myhero.equals("spider man")) {
			System.out.println("your thoughts spider man");	
		} else if(Myhero.equals("iron man")) {
			System.out.println("your thoughts iron man");		
		}else if (Myhero.equals("sakthiman")) {
			System.out.println("your thoughts sakthiman");
		}
		else{
			System.out.println("sorry i can't guess that");
		}
	}
	public static void main(String[] args) {
		Elseif hero=new Elseif();
		hero.Mysuperhero();
	}

}
