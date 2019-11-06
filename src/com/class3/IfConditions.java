package com.class3;

public class IfConditions {
	
 public static void main(String[] args) {
	 int a=90;
	 int b=300;
	 //if number a is bigger than number b
	 //I want to print a is larger than b
	 System.out.println("a is larger than b");
 
 
	
	 System.out.println("a is smaller than b");
	 
	 int expectedHours=15;
	 int actualHours=20;
	 //if expected hours are more than actual ->you will succeed
	 //otherwise,please study more
	 if(actualHours>expectedHours) {
		 System.out.println("you will succeed");
	 }else {
		 System.out.println("please study more");
	 }
	 double teaPrice=4.99;
	 double allowedPrice=3.99;
	 //if price more than I can afford I will NOT buy
	 //if price is less or matches what I can afford then I will buy tea
	 
	 if(allowedPrice>=teaPrice) {
		 System.out.println("I will buy tea");
		 System.out.println("And I will enjoy my tea");
	 }else {
		 System.out.println("I cannot afford, I need to study more");
		 System.out.println("I will go back to study more");
	 
		 
		 System.out.println("I keep writing some code");
		 System.out.println("I keep writing some code");
		 
		 
		 
	 }
	 
 }
}
