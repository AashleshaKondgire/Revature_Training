package com.rev.first;

import java.util.Scanner;

public class RecatangleCheck {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a length : ");
	double length= sc.nextDouble();
	System.out.println("Enter a breadth : ");
	double breadth = sc.nextDouble();
	
	if(length==breadth) {
		System.out.println("It is a Reactangle");
	}else {
		System.out.println("It is not a Rectangle");
	}
}
}
