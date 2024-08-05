package com.rev.assign;

import java.util.Scanner;

public class FartoCel {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter temperature  in Fahrenheit:");
	double fahrenheit = sc.nextDouble();
	double celsius = (fahrenheit - 32)*5/9;
	System.out.println(fahrenheit + " fahrenheit is equal to "+ celsius +" celsius");
}
}
