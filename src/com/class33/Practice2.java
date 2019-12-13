package com.class33;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
public static void main(String[] args) {
	/*Create an arrayList of cars
	 * If any cars has letter "a" or "k" replace it with bike
	 */
	List<String> cars = new ArrayList<>();
	cars.add("Audi");
	cars.add("Mazda");
	cars.add("Bugatti");
	cars.add("Nissan");
	
	cars.set(0, "bike");
	System.out.println(cars);
	
	for (int i=0; i<cars.size();i++) {
		if (cars.get(i).contains("a")||cars.get(i).contains("k")) {
			cars.set(i, "bike");
		}
	}
	System.out.println("cars");
}
}
