package com.class3;

public class RelationalOperator {

	public static void main(String[] args) {
		
	int num1=20;
	int num2=19;
	 System.out.println(num1>num2);
	 System.out.println(num1<num2);
	 
		double d=1.99;
		double d1=2.99;
		
		boolean b=d>d1;
		System.out.println(b); //false
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("#################");
		
		int a=20;
		int c=30;
		//if number a is bigger than b
		//I want to print a is larger than b
		
		if (a>c) {
			System.out.println("a is larger than c");
				
		}else {
			System.out.println("a is smaller than c");
			
			
		}
		
		

	}

}

