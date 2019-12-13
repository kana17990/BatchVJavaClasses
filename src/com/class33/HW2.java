package com.class33;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class HW2 {

	public static void main(String[] args) {
		/*Create an arrayList of words
		 * remove every word that ends with "e".use iterator
		 */
	List<String>list=new ArrayList<>();
	list.add("Cute");
	list.add("Love");
	list.add("Hello");
	list.add("Java");
	
	Iterator<String> it =list.iterator();
	
	while(it.hasNext()) {
		if (it.next().endsWith("e")) {
			it.remove();
		}
	}
		System.out.println(list);
		
	}
}
