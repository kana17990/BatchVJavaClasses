package com.class13;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
	
		String city="Fairfax";
        String city1="FAirfax";
        System.out.println(city.isEmpty());
        System.out.println(city.length());
        
        int [] a= {12,32,55,77};
        System.out.println(a.length);
        System.out.println(city);
        String city2=city.toUpperCase();
        System.out.println(city2);
     
    }

	//6.Write a Java Program to find whether a 
	//String is palindrome or not?

	String a, b = "";
	Scanner s = new Scanner(System.in);
	System.out.ptint("Is it snowing outside:");
	a = s.nextLine();
	int n = a.length();
	for(int j= n - 1; j >= 0; j--)
	{
	    b = b + a.charAt(j);
	}
	if(a.equalsIgnoreCase(b))
	{
	    System.out.println("The string is palindrome.");
	}
	else
	{
	    System.out.println("The string is not palindrome.");




			
	}		
			
	}		
			
			
			
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


