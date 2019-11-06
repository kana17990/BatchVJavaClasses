package com.class14;
import java.util.Scanner;
public class ProgrammingQuestions {

	public static void main(String[] args) {
	
	//1	Write a program to swap 2 numbers without a temporary variable?
	//	Swap2stringswithout a temporary variable?
int x=10;
int y=20;

x=x+y;
y=x-y;
x=x-y;
System.out.println("after swaping:" + "x=" + x + ",y + " + y);
System.out.println("***************111****************");

//2.Write a java program to find the second largest number in 
//the array?Maximum and minimum number in the array?

int [] array = {2,4,5,7,1};
int secondLargest = array [0];
int max = array [0]; 
int min = array [0];

for (int i = 0; i<array.length; i++) {
    
    if (array[i]>max) {
        secondLargest = max;
        max = array[i];
    }else if (array[i]>secondLargest) {
        secondLargest = array[i];
    
}if (array[i]>max) {
    max = array[i];
}if (array[i]<min) {
    min = array[i];
}

    
}
System.out.println("The largest number is "+max);
System.out.println("The smallest number is "+min);
System.out.println("The second largest is "+secondLargest);
System.out.println("***************222*****************");


//3.Find out how many alpha characters present in a string?
String s3="jbhjaa576##$$%^";
String s4=s3.replaceAll("[^a-z]", "");  

System.out.println(s4.length());
System.out.println("***********333***************");



//4.//4 How to find out the part of the string from a string?
    //What is substring? Find number of words in string?
String str3="Today we have a Java class";
System.out.println(str3.substring(21));
System.out.println(str3.length());
System.out.println("*********444************");



//5.Write a java program to reverse String?
//Reverse a string word by word?

String str="Today is Sunday";
for (int i=str.length()-1; i>=0; i--) {
    System.out.print(str.charAt(i));
}
{
	System.out.println("******555********");
}
	


//6.Write a Java Program to find whether a 
//String is palindrome or not?

String a, b = "";
Scanner s = new Scanner(System.in);
System.out.print("Is it snowing outside:");
a = s.nextLine();
int n = a.length();
for(int j= n - 1; j >= 0; j--)
{
    b = b + a.charAt(j);
}
if(a.equalsIgnoreCase(b))
{
    System.out.println("The string is palindrome.");
}
else
{
    System.out.println("The string is not palindrome.");




//7. Write a java program to check whether a given number is prime or not?
int temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number:");
	
	int num=scan.nextInt();
    scan.close();
	for(int i=2;i<=num/2;i++)
	{
       temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");

//8. Write a Java Program to print first 10 numbers of fibonacci series.

int n1=0,n2=1,n3,k,count=10;
 System.out.print(n1+" "+n2);

 for(k=2;k<count;++k) 
 { 
 
 
  n3=n1+n2;
  System.out.print(" "+n3);
  n1=n2;
  n2=n3;
  
 
  
  
  
  
  
 }
 

 }

	}
}




