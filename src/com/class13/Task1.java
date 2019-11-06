package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("enter your class day:: ");
	String day=scanner.nextLine();
	if(day.trim().toLowerCase().equals("saturday")) {
		System.out.println("Saturday is your Java class");
	}else if(day.equals("Sunday")) {
		System.out.println("Sunday your Git class");
	}else if(day.toUpperCase().equals("TUESDAY")) {
		System.out.println("Tuesday is your SDLC class");
	}else if(day.equals("Thursday")) {
		System.out.println("Thursday is your Manual Testing Class");
	}else {
		System.err.println("Envalid Entry!!Please enter a valid class day");
	}
	scanner.close();
	
	
	
	
		
		
		
		
		
		
		
		

	}

}
