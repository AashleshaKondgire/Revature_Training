package com.revature.assignments;

public class Sorting {
	 public static void main(String[] args) {
	       
	        int[] array = {2, 3, 1, 45, 15};

	       
	        System.out.println("Initial array:");
	        printArray(array);

	       
	        selectionSort(array);

	        
	        System.out.println("Sorted array:");
	        printArray(array);
	    }

	   
	    public static void selectionSort(int[] array) {
	        int n = array.length;

	        for (int i = 0; i < n - 1; i++) {
	            
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (array[j] < array[minIndex]) {
	                    minIndex = j;
	                }
	            }

	          
	            if (minIndex != i) {
	                int temp = array[i];
	                array[i] = array[minIndex];
	                array[minIndex] = temp;
	            }

	           
	            System.out.println("Array after iteration " + (i + 1) + ":");
	            printArray(array);
	        }
	    }

	    
	    public static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.print(num + "\t");
	        }
	        System.out.println();
	    }
}
	

