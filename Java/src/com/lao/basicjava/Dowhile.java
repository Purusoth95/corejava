package com.lao.basicjava;

public class Dowhile {
	int times=0;
	
	public void display() {
		do {
			System.out.println("i can't sorry");
			times++;
		}while(times<=5);
				//times++;	
	}
	public static void main(String[] args) {
		Dowhile Dowhile = new Dowhile();
		Dowhile.display();
		
	}

	}
