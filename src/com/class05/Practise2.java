package com.class05;

import java.util.Scanner;

public class Practise2 {
	
	public static void main(String[]args) {
		//write a programm to ask user to enter numbers
		//of worked years and annual salary.If user worked for more or equals to 5 years than user
		//is eligible for bonus,otherwise he is not
		//Once user is eligible and salary is larger than
		//50000 than bonus = 5000,otherwise
		//bonus=3000
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the total years you worked");
		
		int years=scan.nextInt();
		
		System.out.println("Please enter your annual salary");
		int salary=scan.nextInt();
		
		if (years>5) {
			System.out.println("You are eligible for bonus");
			if(salary>50000) {
				System.out.println("your bonus is $5000");
			}else {
				System.out.println("your bonus is $3000");
			}
		}
			else {
				System.out.println("You are not eligible for bonus");
			
		
		
	}

	}
}
