package com.class31;
/*Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter .
 *  Create 2 child classes: Circle & Square that should have an implementation of area and perimeter calculation.
 *   Test your code. 
 */
public interface Shape {
void calculateArea();
void calculatePerimiter();

}
class Circle implements Shape   {
int radius=7;
double pi=3.14;
	@Override
	public void calculateArea() {
		System.out.println("Area of circle : " + pi * radius *radius);
		
	}

	@Override
	public void calculatePerimiter() {
		System.out.println("Perimetir of the circle :" + 2 * pi * radius);
	}
}
	class Square implements Shape{
int a=4;
int b=2;
		@Override
		public void calculateArea() {
			System.out.println("Area of the Square :" +a*a);
			
		}

		@Override
		public void calculatePerimiter() {
	double perimitir=a*4;
			System.out.println("Area of perimitir  "+perimitir);
			
		}
		
	}


	
