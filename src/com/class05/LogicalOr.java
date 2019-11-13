package com.class05;

public class LogicalOr {
	public static void main(String[]args) {
		String weekday="Sunday";
		
		if (weekday.equals("Tueasday") || weekday.equals("Thursday")){
			System.out.println("SDLC Class");
		}else if (weekday.equals("Saturday") || weekday.contentEquals("Sunday")) {
			System.out.println("Java Class");
		}else if (weekday.equals("Monday") || weekday.equals("Friday")) {
			System.out.println("No Class");
		}else if (weekday.equals("Wednesday")) {
			System.out.println("Review Class");
		}else {
			System.out.println("Not a valid day");
			
		}
		
	}
	

}


