package com.class8;

//print numbers from 1 to 100 in 1 line with spase.
//print numbers from 100 to 1
//Print even numbers from 20 to 1 (2 ways)
//print odd numbers between 20 and 50( 2 ways)


public class PracticeLoop {
public static void main(String[]args) {
	
	//print numbers from 1 to 100 in 1 line with spase.
	
	for (int i = 1; i <= 100; i++) {
        System.out.print(i + " ");
    }
    System.out.println(" ");
    System.out.println("*******************2*******************");
    
//Print numbers from 100 to 1
    
    for (int i = 100; i >= 1; i--) {
        System.out.print(i + " ");
    }
    System.out.println(" ");
    System.out.println("*******************3a*******************");
    
//Print even numbers from 20 to 1 (2 ways)
    
    for (int i = 2; i <= 20; i += 2) {
        System.out.print(i + " ");
    }
    System.out.println(" ");
    System.out.println("*******************3b*******************");
    for (int i = 1; i<=20 ; i++) {
        if (i%2==0)
        System.out.print(i + " ");
    }
    System.out.println(" ");
    System.out.println("*******************4a*******************");
    
//Print odd numbers between 20 to 50 (2 ways)
    
    for (int i = 21; i <= 50; i += 2) {
        System.out.print(i + " ");
    }
    System.out.println(" ");
    System.out.println("*******************4b*******************");
    for (int i = 20; i<=50; i++) {
        if (i%2!=0)
        System.out.print(i + " ");
      
        
}
}
}