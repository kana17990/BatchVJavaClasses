package com.class12;

public class Task {
public static void main(String[] args) {
	
	

    // Create two Strings and initaialize them with some value.
    //implement the following methods on those strings.
    
    /*
     * sen.length();
     * sen.equals();
     * sen.contains(s);
     * sen.toUpperCase();
     * sen.toLowerCase();
     * sen.equalsIgnoreCase(anotherString);
     */
    String a = "Java classes";
    String b = "I love Java classes";
    System.out.println(a.length());
    System.out.println(b.length());
    System.out.println("____________________________");
    
    boolean isEqual = a.equals(b);
    System.out.println(isEqual);
    boolean isEqualTo = b.equalsIgnoreCase(a);
    System.out.println(isEqualTo);
    
    System.out.println("____________________________");
    
    System.out.println(a.contains("Java"));
    System.out.println(b.contains("Classes"));
    String sen="classes";
    System.out.println(a.contains(sen));
    System.out.println("____________________________");
    
    System.out.println(a.toLowerCase());
    System.out.println(b.toUpperCase());
    System.out.println(a.toUpperCase());
    System.out.println("____________________________");
    
    /*This method tests if a string starts with  the 
     * specified prefix beginning
     */
String str2="It is very hot in the class";
System.out.println("Is this string starts with="+str2.startsWith("It"));
//System.out.println("Is this string starts with="+str2.startsWith("is",3));
System.out.println("*********************");
	
	/*This method tests if this string end with
	 * the specified suffix
	 */
	System.out.println("Is this string ends with="+str2.endsWith("class"));
	
	
	
	
	
	
	
	
	
	
}
}
