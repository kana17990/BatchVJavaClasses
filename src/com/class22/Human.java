package com.class22;

public class Human {
//Instance Variables
String name;
String lastName;

//static variables
static int eyes=2;
static int nose=1;
static boolean brain=true;

public static void main(String[] args) {
	Human human1=new Human();
	human1.lastName="John";
	human1.lastName="Smith";
	System.out.println("Printing static variables");
	System.out.println(Human.eyes);
	System.out.println(human1.nose);
	System.out.println(brain);
	System.out.println("--------------------------");
	
	Human human2=new Human();
	human2.lastName="Jim";
	human2.lastName="Bim";
	human2.lastName="Doe";
	
	System.out.println(human2.lastName);
	System.out.println(human1.lastName);
	
	
}
}
