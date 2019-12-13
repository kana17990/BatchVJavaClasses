package com.class33;

import java.util.ArrayList;
import java.util.List;

public class Practice {
public static void main(String[] args) {
	/*Create an arrayList of drinks.
	 * If any drinks has letter "s" or "l" replace it with water
	 */
	List<String>liquid=new ArrayList<>();
	liquid.add("sprite");
	liquid.add("rum");
	liquid.add("tea");
	
	liquid.set(0,"water");
	System.out.println(liquid);
}

}
