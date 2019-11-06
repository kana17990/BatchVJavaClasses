package com.class14;

public class StringMethodsRecap {

	public static void main(String[] args) {
		
		//.replace
		String str="your Syntax Technologies";
		System.out.println(str.replace('y', 'i'));
		
		System.out.println("**********************");
		System.out.println(str.replace("your", "My"));
		
		System.out.println("**********************");
		
		//.replaceAll
		String str2="Video provides a powerfull way to to+"
				+ "help you prove your point.When you click+"
				+ "online video,you can paste in the embed+"
				+ "code for the video you want to add ";
		
		System.out.println(str2.replaceAll("way(.*)", ""));
		
		String str3="23423Hell3049o^&^&^&";
		System.out.println(str3.replaceAll("[0-9]",""));
		System.out.println(str3.replaceAll("^A-z", ""));
		
		System.out.println("***************");
		System.out.println(str2.replaceFirst(" ", ""));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
