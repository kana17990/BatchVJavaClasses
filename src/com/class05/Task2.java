package com.class05;
import java.util.Scanner;
public class Task2 {
	
	public static void main(String[] args) {
	
		/*ask a user to enter the month they were born
		 * based on the month define the season
		 * if user is born in jan,feb,dec-->winter
		 * if mar,apr,may-->spring
		 * if jun,jul,aug-->summer
		 * if sep,oct,nov-->fall
		 * otherwise-->unknown
		 * at the end of the programm 
	          "you were born in___"		 */
		Scanner inp = new Scanner(System.in);
        String month = null;
        System.out.println("Please enter month you were born");
        month = inp.nextLine();
        if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("february")
                || month.equalsIgnoreCase("December")) {
            month = "Winter";
        } else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
                || month.equalsIgnoreCase("May")) {
            month = "Spring";
        } else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
                || month.equalsIgnoreCase("August")) {
            month = "Summer";
        } else {
            System.out.println("Invalid");
        }
        System.out.println(month);
		
	}
	
	}
