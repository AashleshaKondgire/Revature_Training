package com.rev.assign;

import java.util.Scanner;

public class RevThreeDigit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a three digit number");
	int num = sc.nextInt();
	if(num<100||num>999) {
		System.out.println("Enter a 3 digit num");
	}else {
		int reversednum = reversenum(num);
		
		System.out.println("Reversed num:"+ reversednum);
	}
	
}

public static int reversenum(int num) {
	int hundreds = num / 100;
    int tens = (num / 10) % 10;
    int units = num % 10;
	return (units * 100) + (tens * 10) + hundreds;
}
}
