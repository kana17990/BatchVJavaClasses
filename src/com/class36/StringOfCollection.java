package com.class36;

import java.util.LinkedList;

public class StringOfCollection {
public static void main(String[] args) {
	
	LinkedList <String> word = new LinkedList<>();
	word.add("Weather");
	word.add("is");
	word.add("very");
	word.add("bad");
	word.add("this");
	word.add("week !");
	String sent="";
	for (String i:word) {
		sent = sent+" "+i;	
	}
	System.out.println(sent);
}
}
