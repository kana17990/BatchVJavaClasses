package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

public static void main(String[] args) {
		
//lets create a collection of vegies where I do not want to have a duplicate		

	
HashSet<String> hset= new HashSet<>();
//storing values into hashset
hset.add("Cucumber");
hset.add("Onion");
hset.add("Pepper");
hset.add("Zuccini");
hset.add("Carrot");
hset.add("Zuccini");	

System.out.println(hset.size());
System.out.println(hset);	
	
//they do not have any methods to retrieve elements from the collection
//.get(); .set();

//hw can we retrieve all elements?
//itereator

Iterator<String>it=hset.iterator();
while(it.hasNext()) {
	String element=it.next();
	System.out.println(element);
}
System.out.println("------------------------");

//enhanced for loop





}
}