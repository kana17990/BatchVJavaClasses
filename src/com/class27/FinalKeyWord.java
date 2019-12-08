package com.class27;

public class FinalKeyWord {

	public  final String str="Hello";
	
	public static void main(String[] args) {
		
		String str = "I am awesome";
		str = "I am cool";
		System.out.println(str);

		final String finalString="Java is easy";
	    //finalString = "Java is hard";ce-->cant modify final variable
		
		final int age=120;
		//age=100; ce-compiler error
	    FinalKeyWord obj=new FinalKeyWord();
	    System.out.println(obj.str);
	
	}
public final void hello(int num) {
	System.out.println("I am a final method in Parent class");
}
//can we overload a final method

}
class FinalKeyWordChild extends FinalKeyWord{
	
	
	//final methods cant be ovverriden , we will get CE	
		 //public final void hello(){
		//System.out.println();
	//}
}

