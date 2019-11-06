package com.class5;

import java.util.Scanner;

public class HomeWork {
public static void main(String[]args) {
	Scanner Scanner = new Scanner(System.in);
	System.out.println("Do you have a credit card? true or false");
	boolean cc=input.hasNextBoolean();
	if (cc) {
		System.out.println(" inputWhat is the balance on your card?");
		int balance=input.nextInt();
		
		if (balance>1000) {
			System.out.println("Please pay off your balance");
		}else {
			System.out.println("you van spend more money");
		}
			
		}else {
			System.out.println("Would you like to apply for credit card");
		}
			
}	
	
}


