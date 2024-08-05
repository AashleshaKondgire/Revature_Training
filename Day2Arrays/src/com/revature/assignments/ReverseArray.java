package com.revature.assignments;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArray = new int[10]; 
        int[] reversedArray = new int[10]; 

        
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < 10; i++) {
            reversedArray[i] = originalArray[9 - i];
        }

       
        System.out.println("The reversed array is:");
        for (int i = 0; i < 10; i++) {
            System.out.println(reversedArray[i]);
        }

    }
}
