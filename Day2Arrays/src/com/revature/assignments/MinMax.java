package com.revature.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        if (n < 2) {
	            System.out.println("At least two elements are required to find differences.");
	            return;
	        }

	        int[] array = new int[n]; 

	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter integer " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }

	       
	        Arrays.sort(array);

	        
	        int maxDifference = array[n - 1] - array[0];
	        int minDifference = Integer.MAX_VALUE;

	     
	        for (int i = 1; i < n; i++) {
	            int diff = array[i] - array[i - 1];
	            if (diff < minDifference) {
	                minDifference = diff;
	            }
	        }

	       
	        System.out.println("Maximum difference: " + maxDifference);
	        System.out.println("Minimum difference: " + minDifference);

	    }
	}
	