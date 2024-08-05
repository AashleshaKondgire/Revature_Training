package com.rev.assign;

import java.util.Scanner;

public class CalculateThreeDigit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a 3 digit number");
	int num = sc.nextInt();
	int hundreds = num/100;
	int units = (num/10)%10;
	int tens = num%10;
	int sum = hundreds + units + tens;
	System.out.println("sum of digits " + sum);
	
}
}
