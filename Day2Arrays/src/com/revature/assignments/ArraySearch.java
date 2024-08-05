package com.revature.assignments;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; 

        
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter a number to search for: ");
        int searchNumber = scanner.nextInt();

       
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] == searchNumber) {
                found = true;
                break;
            }
        }

       
        if (found) {
            System.out.println("The number " + searchNumber + " is present in the array.");
        } else {
            System.out.println("The number " + searchNumber + " is not present in the array.");
        }

	}

}
