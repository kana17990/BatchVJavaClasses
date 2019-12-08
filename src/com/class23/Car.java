package com.class23;

public class Car {
/*we want to build make as Toyota cars 
 * that will have different models and color
 * */ 
 
static String make;
public String model;
public String color;
public int speed;
public int doors;


public void getDetails(){
	
	System.out.println("I build "+color+" "+make+" "+model);
	System.out.println("My car has "+doors+" and can have speed up to "+speed);
}


}


