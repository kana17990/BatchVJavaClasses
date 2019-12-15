package com.class35;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HomeWork {
public static void main(String[] args) {
	
Map<Integer,String>map=new TreeMap<>();
map.put(3456, "Mac Laptop");
map.put(6746, "Hp Printer");
map.put(3468, "Dell Screen");
map.put(8753, "Samasung Tv");
map.put(1756, "Sony Camera");

System.out.println(map);
///to retrieve - key values using entry set
	
Set<Entry<Integer,String>>set=map.entrySet();
for(Entry<Integer,String>entry:set) {
String element=entry.getKey()+"=="+entry.getValue();//1765+Sony Camera
System.out.println(element);
}	

System.out.println("---Retrieving key and values using iterator ");
Iterator<Entry<Integer,String>>entryIterator=map.entrySet().iterator();	
while(entryIterator.hasNext()) {
	Entry<Integer,String>singleEntry=entryIterator.next();
	int key=singleEntry.getKey();
	String values=singleEntry.getValue();
System.out.println(singleEntry.getKey() + "----" + singleEntry.getValue());
}	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
}
