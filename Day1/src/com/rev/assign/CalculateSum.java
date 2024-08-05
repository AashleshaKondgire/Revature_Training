package com.rev.assign;

import java.util.Scanner;

public class CalculateSum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Five Digit number:");
	int number = sc.nextInt();
	int firstDigit = number/10000;
	int secondDigit = (number/10)%10;
	int sum = firstDigit + secondDigit;
	System.out.println("Sum of the first and second last digit:"+ firstDigit+"+"+ secondDigit+"="+sum);
	
}
}
