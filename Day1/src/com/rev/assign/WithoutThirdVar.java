package com.rev.assign;

public class WithoutThirdVar {
	 public static void main(String[] args) {
	        int a = 6;
	        int b = 8;

	        
	        System.out.println("Before swapping: a = " + a + ", b = " + b);

	       
	        a = a + b; 
	        b = a - b;
	        a = a - b; 

	        
	        System.out.println("After swapping: a = " + a + ", b = " + b);
	    }


}
