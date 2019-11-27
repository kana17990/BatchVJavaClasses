package com.class22;

public class StaticVsNonStatic {
//template for a student (school,name,grade)
	
	static String school="Syntax";
	String name;
	char grade;
	
	//instance method
	void getInfo() {
	System.out.println("My name is "+name+" and I am going to "
	+school + " and my grade is "+ grade);
	}
	
	//static method
	static void getInfo1() {
		System.out.println("I am attending classes at "+school);
		//System.out.println("My name is "+name);
		//complier will give an error 
		
		
	}
	
	public static void main(String[] args) {
		//accessing static numbers within same class
		//-->just use name for a variable
		//or call method by its name only
		//you cannot access NON static members within static methods
		System.out.println(school);
		getInfo1();
		
		
	}
	
	
	
	
}
