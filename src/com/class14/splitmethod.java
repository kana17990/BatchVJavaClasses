package com.class14;

public class splitmethod {

	public static void main(String[] args) {
	
/*.split
 * This method splits this string around matches of the given regular expression.
 */
		
//Split the following string into array of string /work
		
String str="Video provides a powerfull way to help you prove your point";
		
String[] array=str.split(" ");
		
for(int i=0;i<array.length;i++) {
			
System.out.println(array[i]);
			
}
	System.out.println("*******************************");	
	
//how can we find how many sentences are in the following string
String str1="Today is Sunday. Its sunny day. And we are having java class";

String[] array2=str1.split("\\.");
System.out.println("The number of sentences in the given String is:: "+array2.length);

//for (String string : array2) {
	//System.out.println(string.trim());
	
//}



		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
