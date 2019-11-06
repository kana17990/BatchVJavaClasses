package com.class11;

import java.lang.reflect.Array;

public class Task3 {
public static void main(String[] args) {

	//Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only.
	//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
	
	 int[][] numbers = {
             { 8, 7, 5, 3 },
             { 1, 5, 6, 7 },
             { 3, 6, 8, 1 }
             };
     
     int sum=0;
     for (int i = 0; i < numbers.length; i++) {
         for (int j = 0; j < numbers[i].length; j++) {
             //System.out.print(numbers[i][j] + ” “);
             
             sum=sum+numbers[i][j];
         }
         System.out.println();
     }
     System.out.println("The sum of all elements in the array is= "+sum);
     
     int sum1=0;
     for(int nums[]: numbers) {
         for(int getNum:nums) {
             sum1=sum1+getNum;
         }
     }
     System.out.println("The sum of all elements in the array is= "+sum1);
 }	

	}

