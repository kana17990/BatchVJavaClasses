package com.class36;
import java.util.*;
import java.util.Map.Entry;
public class Person {
	String name,lastName;
	int age,salary;
	public Person(String name ,String lastname,int age,int salary) {
		this.name=name;
		this.lastName=lastname;
		this.age=age;
		this.salary=salary;
		
	}
	public void display() {
		System.out.println(" name : " + name + ", lastName : "+ lastName + " age : " + age + " and " + " salary : $ " + salary);
	}
	public static void main(String[] args) {
		Map<Integer,Person>person = new TreeMap<>();
		person.put(1, new Person("Kanat","Ussenov",29,90000));
		person.put(2, new Person("Jack","Daniels",34,78000));
		person.put(3, new Person("Anna","Smith",32,67000));
		person.put(4, new Person("Jim","Beam",45,10000));
		Set<Entry<Integer,Person>>ent=person.entrySet();
		for (Entry<Integer,Person>get:ent) get.getValue().display();{
			
		}	
	}
}
