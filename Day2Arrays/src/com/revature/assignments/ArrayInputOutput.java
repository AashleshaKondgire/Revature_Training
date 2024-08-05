package com.revature.assignments;

import java.util.Scanner;

public class ArrayInputOutput {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; 
        
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

       
        System.out.println("The integers you entered are:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }

       
    }
}