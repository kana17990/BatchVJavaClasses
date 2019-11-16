package com.class18;

public class Task {

    //1create a method that will take 2 parameters as a numbers and prints which number is larger
	
    //2Create a method that will take a number and prints whether the number is even or odd.
	
    //3Create a method that will print whether given String is Palindrome or not.
	
    void largestNum(int num1,int num2) {
         if (num1>num2) {
                System.out.println(num1 + " is greater than " + num2);
            }else if(num1<num2) {
                System.out.println(num2 + " is greater than " + num1);
            }else {
                System.out.println(num1 + " is equal to " + num2);
            }
        }
    void evenOdd(int a) {
        if(a%2==0) {
            System.out.println(a+" is even number");
        }else {
            System.out.println(a+" is odd number");
        }
            
    }
    void palindrome(String str) {
         char[] charArray=str.toCharArray();
            String strTemp="";
            
            for (int i=charArray.length-1; i>=0; i--) {
                strTemp=strTemp+charArray[i];
            }
            
            if(str.equals(strTemp)) {
                System.out.println(str + " is a palindrome word");
            }else {
                System.out.println(str+ " is NOT a palindrome word");}
    }
        public static void main(String[] args) {
            Task largest=new Task();
            largest.largestNum(5, 8);
            Task oddOrEven=new Task();
            oddOrEven.evenOdd(25);
            Task str=new Task();
            str.palindrome("kayak");
            str.palindrome("sopa");
    }
    
    
    





        


        






























}


	
	
