package com.class35;

import java.util.HashMap;

public class HashMapTask {

	public static void main(String[] args) {
		HashMap<Integer,String>building=new HashMap<>();
		
		building.put(1, "Google");
		building.put(2, "Google");
		building.put(3, "Amazon");
		building.put(4, "Amazon");
		building.put(5, "Syntax");
		building.put(6, "PuffCity");
		building.put(7, "PuffCity");
		
		System.out.println("There are building "+building.size()+"entries in the map.");
		System.out.println(building);
		building.replace(4, "Syntax");
		System.out.println(building);
		building.remove(7);
		System.out.println(building);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
