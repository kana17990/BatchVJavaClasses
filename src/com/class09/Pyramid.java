package com.class09;

public class Pyramid {
public static void main(String[]args) {
	//*
	//**
	//***
	//****
	//*****
	//*
	
	for (int i=1; i<=5; i++) {
		
		for (int j=1; j<=i; j++) {
			
			System.out.print("*");
		}
		
		System.out.println();
	}
	System.out.println("-------------------------");
	
	//to print
	//1
	//22
	//333
	//4444
	//55555
	//666666
	//7777777
	//88888888
	//999999999
	
	for (int i=1; i<=9;i++) {
		for (int j=1; j<=i;j++) {
			System.out.print(i);
		}
		System.out.println();
	}
	System.out.println("-----------------------------");
	/*to print
	 * 999999999
	 * 88888888
	 * 7777777
	 * 666666
	 * 55555
	 * 4444
	 * 333
	 * 22
	 * 1
	 */
	
	for (int r=9; r>=1;r--) {
		
		for (int c=1; c<=r;c++) {
			
			System.out.print(r);
	}
	System.out.println();
	
	
}
}
}

