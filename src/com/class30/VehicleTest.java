package com.class30;

public class VehicleTest {
	public static void main(String[] args) {

		BMW bmw = new BMW("767jbh676", "Sedan", "BMW", "X5");
		BMW.displayTotal();//1or3
		//Vehicle.displayTotal();
		// come from Vehicle class
		bmw.drive();
		bmw.stop();
		bmw.speed();
		bmw.start();
		// comes from Car class
		bmw.breaking();
		// comes from BMW
		bmw.display();

		Car car = new BMW("9999hjk789", "SUV", "BMW", "X3");
		// come from Vehicle class
		car.drive();
		car.stop();
		car.speed();
		car.start();
		// comes from Car class
		car.breaking();
		// comes from BMW - wont be available to the parent
		// car.display();

		Vehicle vehile = new BMW("hfhhfh899", "Truck", "BMW", "A7");
		// come from Vehicle class
		vehile.drive();
		vehile.stop();
		vehile.speed();
		vehile.start();
		// comes from Car class
		//vehile.breaking();
		// comes from BMW
		//vehile.display();
		new BMW("weiwe","Truck","BMW","A7");
		new BMW("hfffwf89","Sedan","BMW","i3");
		new BMW("fssjfkf","Sedan","BMW","i7");
		System.out.println("--------------------");
		BMW.displayTotal();
	}
}
