package com.class09;

import java.util.Scanner;

public class NestedHomeWork {
	
public static void main(String[]args) {
	
	//Write a programm that reads a range of Integers(Start and end point)
	//provide by a user
	//and then from that range print the Sum of the even and odd Integers
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter starting point");
	int start=scan.nextInt();
	System.out.println("Please enter ending point");
	int end=scan.nextInt();
	int sumOdd=0;
	int sumEven=0;
	for (int i=start; i<=end; i++) {
		if(i%2==0) {
			sumEven=sumEven+i;
		}else {
			sumOdd=sumOdd+i;
		}
	}
	
	System.out.println("Sum of the even numbers: "+sumEven);
	System.out.println("Sum of the even numbers: "+sumOdd);
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
}
