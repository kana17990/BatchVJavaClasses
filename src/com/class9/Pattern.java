package com.class9;

public class Pattern {
public static void main(String[]args) {
	//*****
	
	for (int k=1; k<=5; k++) {
		
	System.out.print("*");
		}
	System.out.println();
	
	//*****
	//*****
	//*****
	
	for (int k=1; k<=5; k++) {
		System.out.println("*");
	}
	System.out.println();
	
	for (int k=1; k<=5; k++) {
        System.out.println();
        for (int l=1; l<=5; l++) {
            System.out.print("*");
	}
	
	//*****-->rows
    //*****
    //*****
    //*****
        System.out.println("-------------------------");
       //*******
       //*******
       //*******
       //*******
       //*******
        
        for (int i=0; i<10;i++) {//Rows
        	for (int y=0; y<10; y++) {//cols
        		System.out.println("*");
        	}
        	System.out.println();
        }
	}
}
}
