package com.java.dsa.exceptions;

//Define a custom exception
class AgeNotValidException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeNotValidException(String message) {
		super(message);
	}
}

//Use the custom exception
public class CustomExceptionExample {
	public static void main(String[] args) {
		try {
			checkAge(105); // This will throw AgeNotValidException
		} catch (AgeNotValidException e) {
			System.out.println("Caught custom exception: " + e.getMessage());
		}
	}

	public static void checkAge(int age) throws AgeNotValidException {
		if (age < 18) {
			throw new AgeNotValidException("Age must be 18 or older.");
		} else {
			System.out.println("Age is valid.");
		}
	}
}
