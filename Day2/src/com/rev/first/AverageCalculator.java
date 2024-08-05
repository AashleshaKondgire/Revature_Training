package com.rev.first;

import java.util.Scanner;

public class AverageCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;     
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int number = scanner.nextInt();
            sum += number;
        }
        double average = sum / 10.0;

        System.out.println("The average of the entered integers is: " + average);

     
    }
}
