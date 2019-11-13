package com.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		int temp1=67;
		int temp2=32;
		if(temp1<temp2) {
			
			System.out.println("Water will freeze with tenperature "+temp2);
			
		}else {
			System.out.println("Water will NOT freeze with " + temp1 +" temperature");
			
			boolean val=false;
			if(val) {//if val==true
				System.out.println("hello");
				
			}else {
				System.out.println("Bye");
				
			}boolean isRain=true;
			//if it is raining I will take an umbrella, otherwise i will be wet
			if(isRain ) {//isRain==true
				System.out.println(" I will take umbrella");
			}else {
				System.out.println("I will be wet");
				
			}
			
		}

	}

}
