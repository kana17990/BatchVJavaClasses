package com.class5;
import java.util.Scanner;
public class HomeWork2 {
	public static void main (String[]args) {
		
		        Scanner scan;
		        int guiz;
		        int midterm;
		        int finalexam;
		        int avarage;
		        char grade1;
		        scanner scan=new Scanner(System.in);
		        System.out.println("What is   your guiz score?");
		        guiz = scan.nextInt();
		        System.out.println("What is your midterm score");
		        midterm = scan.nextInt();
		        System.out.println("What is your finalexam score");
		        finalexam = scan.nextInt();
		        avarage = (guiz + midterm + finalexam) / 3;
		        if (avarage >= 90) {
		            System.out.println(grade1 = 'A');
		        } else if (avarage >= 70 && avarage <= 90) {
		            System.out.println(grade1 = 'B');
		        } else if (avarage >= 50 && avarage <= 70) {
		            System.out.println(grade1 = 'C');
		        } else if (avarage < 50) {
		            System.out.println(grade1 = 'F');
		        } else {
		            System.out.println("Fail");
		        }
		        System.out.println("Your avarage score is " + avarage);
		        System.out.println("__________________________");
		        
		        boolean rain = true;
		        String classMode;
		        if (rain) {
		            classMode = "Online";
		        } else {
		            classMode = "Inclass";
		        }
		    }
	
	
	}
	
