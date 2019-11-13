package com.class09;

public class NetedloopPattern {
	
public static void main(String[]args) {  
	//print

	/* 11111
	 * 22222
	 * 33333
	 * 44444
	 * 55555
	 */
	    System.out.println("----------------------");
	    for (int i=1; i<=5; i++) {
		 
     	for (int j=1; j<=5; j++) {
    
  System.out.print(i);
     	}
     	System.out.println();
	 }
	 /* 123456789
	  * 123456789
	  * 123456789
	  * 123456789
	  * 123456789 */
	 
	 System.out.println("------------------");
	    for (int a=1; a<5; a++) {//rows
	    for (int b=1; b<10; b++) {//colm
	    System.out.print(b);
	    }
	    System.out.println();
	 
	    }
	    System.out.println("----------------------");
	    for (int i=5; i>=1;i--) {//rows
	    	
	    for (int j=5;j>=1; j--) {//colums
	    System.out.print(j);			
	    	}
	    System.out.println();
	    }
	    
	    System.out.println("------------------------");
	   
	    /*print
	     * 55555
	     * 44444
	     * 33333
	     * 22222
	     * 11111*/
	    
	    for (int i=5; i>0; i--) {//rows
	    	
	    for (int j=5; j>0;j--) {//colums
	    		
	    System.out.print(i);
	    }
	    System.out.println();
	    }
	    
	    
	    
}
}	 
	 
	 
	 
	 
	 
	 
	 
	 
	 


	
	
	
	
	
	
	
	
	
	
	


