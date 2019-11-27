package com.class24_1;

import com.class24.Task;

public class TestTask {
	public static void main(String[] args) {
		
		Task obj=new Task();//default
		Task obj1=new Task(4);//public
		Task obj2=new Task(4,5);//protected
		Task obj3=new Task("Some string");//private
}
}
