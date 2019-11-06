package com.class8;

import java.util.Scanner;

public class BreakContinuePractice {
	
public static void main(String[]args) {
	
	for(int i=1; i<=50; i++) {
		if (i%3==0) {
			continue;
		}
		System.out.println(i+" ");
	}
	System.out.println(" ");
	System.out.println("----------------");
	
	Scanner scan = new Scanner(System.in);
			
			for(int i=1; i<=10; i++) {
				System.out.println("Do you want to apply for a credit card?");
				String answer = scan.nextLine();
				if(answer.equals("Yes")) {
					break;
					
				}
			}
	System.out.println("Thanks!");
}
	

}

