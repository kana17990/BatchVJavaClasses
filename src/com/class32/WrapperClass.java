package com.class32;

public class WrapperClass {
	public static void main(String[] args) {
		
	
int num=10;

//Autoboxing --> converting primitive type into an object type

Integer integer=100000;
System.out.println(integer.MIN_VALUE);
String str=integer.toString();
System.out.println(str);

//Converting boolean primitive type into Boolean Object type

Boolean bool=true;
Byte $b=20;
System.out.println($b.MAX_VALUE);

//Autoboxing --> converting Object type into primitive type
int num1=new Integer(10);
System.out.println(num1);


	}

}
