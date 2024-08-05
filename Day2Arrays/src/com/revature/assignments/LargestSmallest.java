package com.revature.assignments;

import java.util.Scanner;

public class LargestSmallest {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n]; 

      
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

      
        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);

    }
}		