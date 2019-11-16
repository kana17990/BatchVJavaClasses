package com.class18;

public class  MethodsWithParameters2{

	    void sayHello(String name) {
	        System.out.println("Hello " + name);
	    }
	    public static void main(String[] args) {
	        MethodsWithParameters2 obj = new MethodsWithParameters2();
	        
	        obj.sayHello("Fareed");
	        obj.sayHello("Zabih");
	        obj.sayHello("Fahim");
	        obj.sayHello("Rahmat");
	        System.out.println("************");
	        obj.sayHelloDifferentLanguage("USA");
	        obj.sayHelloDifferentLanguage("Afghanistan");
	        obj.sayHelloDifferentLanguage("russia");
	        
	        obj.saynameAndAge("Jack", 45);
	        obj.saynameAndAge("Olga", 50);
	        obj.isSnowing(true);
	        obj.isSnowing(false);
	    }
	    
	    /*
	     *  create a method that will say hello in different language based on the value that will be passed when user calls a method
	     */
	    void sayHelloDifferentLanguage(String country) {

	        //String country = "USA";
	        switch (country.toLowerCase()) {
	        case "usa" :
	            System.out.println("Hello");
	            break;
	        case "russia" :
	            System.out.println("Privet");
	            break;
	        case "afghanistan" :
	            System.out.println("Salam");
	            break;
	        case "paraguay" :
	            System.out.println("Hola");
	            break;
	            default :
	                System.out.println("i dont know how to say hello in your language");
	                
	                
	                
	                
	                
	                
	                
	        }
	        
	    }
	//method to say name and age
void saynameAndAge(String name,int age) {
	
	System.out.println("My name is "+name+" and i am "+age+" old");
}
	//create a method that will check if it snowing
    //if snow --> stay at home , otherwise go for walk

    void isSnowing(boolean isSnowing) {//method header
	
	if (isSnowing) {
		System.out.println("Stay Home");
	}else {
		System.out.println("Go for walk");
	}
	
	
	
	
	
}






}
		

