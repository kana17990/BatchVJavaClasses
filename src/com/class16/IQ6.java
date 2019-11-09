package com.class16;
import java.util.Scanner;
public class IQ6 {

	public static void main(String[] args) {
		
		
		
		
		    
		   
		        
		        // Write a Java Program to find whether a String is palindrome or not?
		        
		        Scanner scan=new Scanner(System.in);
		        System.out.print ("Please enter a string: ");
		        String str=scan.nextLine();
		        
		        // String str="radar";
		        
		        char[] arr=str.toCharArray();
		        
		        String reverse="";
		        
		        for (int i = arr.length-1; i >= 0; i--) {
		            reverse=reverse+arr[i];
		        }
		        
		        if(str.equals(reverse)) {
		            System.out.println(str+ " is a palindrome word.");
		        }else {
		            System.out.println(str+ " is NOT a palindrome word.");
		        }
		        
		        scan.close();
		
		
		
		
		
		
		
		
		
		
		        
		
		
		
		
		
		
		
		

	}

}
