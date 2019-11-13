package com.class17;

public class Dog {
String name,color,type;
int weight,height,year;
void eat() {
	System.out.println("The dog "+type+" is can run");
}
void play() {
	System.out.println("The dog "+type+" like to play around");
}	
public static void main(String []args)	{
	Dog husky=new Dog();
	husky.type="Husky";
	husky.color="White";
	husky.name="Bimbo";
	husky.weight=140;
	husky.year=2017;
	
	Dog Pudel=new Dog();
	Pudel.type="Pudel";
	Pudel.color="Brown";
	Pudel.name="Kiko";
	Pudel.weight=100;
	Pudel.year=2018;
	
	Dog Alabai=new Dog();
	Alabai.type="Alabai";
	Alabai.color="Black";
	Alabai.name="Tank";
	Alabai.weight=200;
	Alabai.year=2016;
	
	husky.eat();
	Pudel.eat();
	Alabai.eat();
	
	husky.play();
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
