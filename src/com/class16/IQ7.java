package com.class16;
import java.util.Scanner;
public class IQ7 {

	public static void main(String[] args) {
  
		        //Write a java program to check whether a given number is prime or not?
		        
//		      Scanner scan=new Scanner(System.in);
//		      System.out.print("Please enter a number: ");
		        
//		      in
		
num=scan.nextInt();
		        boolean isPrime=true;
		        for(int nums=2; nums<=100; nums++) {
		            for (int i=2; i<nums; i++) {
		                if (nums%i==0) {
		                    isPrime=false;
		                    break;
		                }else if(nums==0 || nums==1) {
		                    isPrime=false;
		                }else {
		                    isPrime=true;
		            }
		            if(isPrime) {
		                System.out.println(Prime nums+ " is a prime number.");
		            }
//		          else {
//		              System.out.println(nums+" is NOT a prime number.");
//		          }   
		        }
		        
		    }
		}

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


