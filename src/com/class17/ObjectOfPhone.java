package com.class17;

public class ObjectOfPhone {

	String name,brand,model;
	int memory;
	boolean camera;
	
	void playGames() {
		System.out.println("I can play games on my " +name);
	}
    void videoCall() {
    	System.out.println("I can call with my " + name);
    	
    }
    void  text() {
    	System.out.println("I can text with my " + name);
    }
	public static void main(String[] args) {
		
	
		Phone p1=new Phone();
        p1.brand="Apple";
        p1.name="Iphone";
        p1.model="7 plus";
        p1.memory=264;
        p1.camera=true;
        System.out.println("I can play games on my " + p1.name);
        
        System.out.println("--------------------------");
        Phone p2=new Phone();
        p2.brand="Android";
        p2.name="Samsung";
        p2.model="Galaxy s 10";
        p2.memory=64;
        p2.camera=true;
        System.out.println("I can call with my " + p2.name);
        
        System.out.println("---------------------------");
        
        Phone p3=new Phone();
        p3.brand="Nokia";
        p3.name="Nokia 3310";
        p3.model="Nokia 11";
        p3.memory=164;
        p3.camera=true;
     
      
  System.out.println("I can text with my  " +p3.name);
 
        
  
        
  
	}

}
