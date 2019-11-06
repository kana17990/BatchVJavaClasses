package com.class13;

public class RegularExpression {

	public static void main(String[] args) {
		
    //Print only text and not numbers
		
	String str="1234Hel45lo465456";//Hello
	System.out.println(str.replaceAll("[0-9]","" ));//leave only text
	System.out.println("------------------");
	System.out.println(str.replaceAll("[a-zA-Z]", ""));	//leave only numbers
	System.out.println("------------------");
		
	
	
	//remove everything except text
	
	String str2="Hi#$%How#$%&%$#4356346";
	System.out.println(str2.replaceAll("[^a-zA-Z0-9]",""));
	System.out.println("------------------------");
	System.out.println(str2.replaceAll("\\w", ""));
	
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
