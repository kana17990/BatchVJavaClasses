package Overriding;
//Subclass is inheriting the VAR and methods to find in Base 
public class Subclass extends Base {
	
public static void main(String[] args) {
	Subclass s=new Subclass();

	}
	public Subclass() {
	sayHello();//we are calling the sayHello method defined in base
	
	}
	 @Override
		public void sayHello() {
			// TODO Auto-generated method stub
			super.sayHello();
			
			System.out.println("Hi");
		}
}


