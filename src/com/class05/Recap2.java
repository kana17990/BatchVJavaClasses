package com.class05;

public class Recap2 {

	
	/*declare the time(1-24)
	 * based on the time identify wether if morning,afternoon,
	 * if 1-11-->morning
	 * if 12-15-->noon
	 * if 16-20-->evening
	 * if>20-->night
	 */
	public static void main(String[]args) {
		int time = 24;
        String timeOfDay=null;
        if (time >= 1 && time <= 11) {
            timeOfDay = "Morning";
        } else if (time >= 12 && time <= 15) {
            timeOfDay = "Noon";
        } else if (time >= 16 && time <= 20) {
            timeOfDay = "Evening";
        } else if (time > 20 && time<=24) {
            timeOfDay = "Night";
        } else {
            timeOfDay = "Unknown";
        }
System.out.println("Time of the day is " + timeOfDay);
		

	}
	
	
	
	
	
	
	}

