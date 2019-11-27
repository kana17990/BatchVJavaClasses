package com.class26;

public class RunTimePolymorphism {
public static void main(String[] args) {
	//creating an object on parent class
	Animal animal=new Animal();
	animal.sleep();
	animal.eat();
	
	//creating an object from child class
	Cat cat=new Cat();
	cat.eat();//from parent class
	cat.meow();//from child class
	cat.sleep();//from child class 
	
	
	
	//widening
	double d=90;
	
	//narrowing
	int i=(int)1.99;
	System.out.println("-------------------");
	
	//Non Primitive Typecasting
	//widening-->creating an object of the class
	//and giving reference to parent class
	
Animal obj = new Cat();
//narrowing
//Cat obj2=new animal();-->cannot convert from Animal to Cat

	obj.eat();//coming from parent 
	obj.sleep();//this method will 
	//obj.meow();//compiler error----->method wont be available
}
}
