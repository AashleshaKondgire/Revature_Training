package com.rev.assign;

public class CustomException extends Exception{

	public CustomException(String message) {
		super(message);
	}
	@Override
	public String getMessage() {
		return super.getMessage();
	}
	public static void main(String[] args) {
		try {
			throw new CustomException("Something went Wrong");
		}catch(CustomException e) {
			System.out.println(e.getMessage());
		}
	}

}
