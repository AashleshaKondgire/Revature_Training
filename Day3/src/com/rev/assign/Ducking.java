package com.rev.assign;

public class Ducking {
	public static int riskyMethod()throws ArithmeticException{
		int result = 10/0;
		return result;
	}
public static void main(String[] args) {
	try {
		riskyMethod();
	} catch (ArithmeticException e) {
		System.out.println("exception caught"+e.getMessage());;
	}
	
}	

}
