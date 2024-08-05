package com.rev.first;

public class ArmStrongNumber {
	 public static void main(String[] args) {
	        System.out.println("Armstrong numbers between 100 and 500 are:");

	        
	        for (int num = 100; num <= 500; num++) {
	         
	            int hundreds = num / 100;
	            int tens = (num / 10) % 10;
	            int ones = num % 10;

	            
	            int sumOfCubes = (hundreds * hundreds * hundreds) +
	                             (tens * tens * tens) +
	                             (ones * ones * ones);

	           
	            if (sumOfCubes == num) {
	                System.out.println(num);
	            }
	        }
	    }
	
}
