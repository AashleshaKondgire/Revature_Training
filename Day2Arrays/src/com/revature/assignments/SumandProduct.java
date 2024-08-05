package com.revature.assignments;

import java.util.Scanner;

public class SumandProduct {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers; 

       
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        numbers = new int[n]; 
       
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        
        int sum = 0;
        int product = 1;

       
        for (int num : numbers) {
            sum += num;
            product *= num;
        }

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);

     
    }

}
