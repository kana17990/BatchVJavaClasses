package com.class24;

public class Test {
public static void main(String[] args) {
	Child1 child1=new Child1();
	System.out.println(child1.race);
	System.out.println(child1.hairColor);
	System.out.println(child1.eyeColr);
	child1.sing();
	child1.code();
	
	Parent parent=new Parent();
	System.out.println(parent.hairColor);
	System.out.println(parent.eyeColr);
	System.out.println(Parent.race);
    parent.sing();
    //parent.code();compiler will give an error
	 Child2 child2=new Child2();
	 System.out.println(child2.race);
	 System.out.println(child2.hairColor);
	 System.out.println(child2.eyeColr);
	 child2.sing();
	 Parent2 parent2=new Parent2();
	 System.out.println(parent2.race);

}
}

