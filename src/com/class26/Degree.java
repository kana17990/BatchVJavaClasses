package com.class26;

public class Degree {

	public void getDegree() {
		System.out.println("i got a degree");
	}
}
class Undergraduate extends Degree{
	public void getDegree() {
		System.out.println("I am an undergraduate");
	}
}
class Postgraduate extends Degree{
	public void getDegree() {
		System.out.println("i am an postgraduate");
	}
}