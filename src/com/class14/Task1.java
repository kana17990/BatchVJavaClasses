package com.class14;

public class Task1 {

	public static void main(String[] args) {
		
	/*Create a String that will hold a sentence. Write a program to get a new String without any spaces.
	/*Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String.
	/*You have a String a=”Is it Saturday Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?
*/
String str="Today is my day off.I have some plans";
String str1=str.replace(" ","");
System.out.println(str1);

System.out.println("********************");

String str2="17990Kanat^^^$$$";
String s = str2.replaceAll("[^a-zA-Z]", "");
System.out.println(s);
System.out.println(s.length());
System.out.println("********************");

String a = "Is it Saturday?Is it raining?Do we have a Java class today?";
String[] array = a.split("\\?");
for (String out:array) {
	System.out.println(out.trim());
}
	System.out.println("The number of sentences in the " + array.length);
}
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


