package com.rev.assign;

public class ExceptionTest {
public static void main(String[] args) {
	try {
		System.out.println("Starting a try block");
		int result = 10/0;
	    System.out.println("Ending try block");
	}catch(Exception e) {
		System.out.println("Starting catch block");
		System.out.println("Exception caught" + e.getMessage());
		System.out.println("Ending of catch block");
	}finally {
		System.out.println("Ending finally block");
	}
}
}
