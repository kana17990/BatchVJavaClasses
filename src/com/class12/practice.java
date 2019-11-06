package com.class12;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
      String a="Apple";
      String b="Banna";
      System.out.println(a.length());
      System.out.println(b.length());
      System.out.println("---------------------");
      
      boolean isEqual=a.equals(b);
      System.out.println(isEqual);
      boolean isEqualTo=b.equalsIgnoreCase(a);
      System.out.println(isEqualTo);
      System.out.println("---------------------");

      System.out.println(a.contains("Apple"));
      System.out.println(b.contains("Banana"));
      String sen="classes";
      System.out.println(a.contains(sen));
      System.out.println("---------------------");
      
      System.out.println(a.toLowerCase());
      System.out.println(b.toUpperCase());
      System.out.println(a.toUpperCase());
      System.out.println("---------------------");




	}

}
