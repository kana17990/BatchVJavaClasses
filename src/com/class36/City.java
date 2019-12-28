package com.class36;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class City {


public static void main(String[] args) {
Map<String,Integer>city=new TreeMap<>();
city.put("Rome", 4);
city.put("La", 2);
city.put("Brooklyn", 7);
city.put("Moscow", 6);
city.put("Dublin", 6);

Iterator<Entry<String, Integer>>cityIt=city.entrySet().iterator();
while(cityIt.hasNext()) {
	int a=cityIt.next().getValue();
	
	if(a>7) {
		cityIt.remove();
	}
}
System.out.println(city);
}
}



