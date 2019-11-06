package com.class12;

public class StringManipulationDemo {
public static void main(String[] args) {
	
//There are two ways to create String objects
	//1.String Literal
	String name="John";
	
	System.out.println(name);
	System.out.println(name.length());
	
	
	//2.Creating string with new key word
	String name1=new String("John1");
	
	/*
	//*This method returns the  length of this string .
	//*The length is equal to the number
	//*of 16-bit unicode characters in the string.
	*/
	 int name1Len=name1.length();
	 System.out.println("The length of name1 is= "+name1Len);
	 
	 String str1="hello World";
	 System.out.println("Before:: "+str1);
	 str1=str1.toLowerCase();
	 System.out.println("Affter:: "+str1);
	 
	 System.out.println("=============================");
	 
     /*
      * toLowerCase();
      * This method converts all of the
      * characters in this String to lowercase     
      */
     String str2="HelLo woRld";
     System.out.println("Before:: "+str1);
     str1 = str1.toLowerCase();
     System.out.println("After:: "+str1);
     
     System.out.println("=================");
     
     //.equals()
     //This method will count everything such
     //capitalization and content
     String str3="HElLo WoRld";
     
     boolean isEqual=str2.equals(str2);
     System.out.println(isEqual);
     
     //.equalsIgnoreCase();
     //This method does not care for capitalization and compare the
     //content only
     System.out.println(str1.equalsIgnoreCase(str2));
     
    
    
    
    /*to Uppercase();
     * this method converts all of the charactersi n 
     * this String to Uppercase
     */
    
    String str4="Mohammad";
    System.out.println("Before :: "+str4);
    str3=str3.toUpperCase();
    System.out.println("Affter :: "+str4);
    
    
    

	 
	 
       
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
