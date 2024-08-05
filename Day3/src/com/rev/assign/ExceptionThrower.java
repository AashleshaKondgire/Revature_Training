package com.rev.assign;

public class ExceptionThrower {
public void checkAndThrow(int value) throws CustException{
	if(value<0) {
		throw new CustException("Negative Value");
	}else {
		System.out.println("value is valid");
	}
}
public static void main(String[] args) {
	ExceptionThrower et = new ExceptionThrower();
	try {
		et.checkAndThrow(-10);
	}catch(CustException e) {
		System.out.println(e.getMessage());
	}
	try {
		et.checkAndThrow(6);
	}catch(CustException e) {
		System.out.println(e.getMessage());
	}
}
}
