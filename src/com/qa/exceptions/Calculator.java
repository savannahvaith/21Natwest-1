package com.qa.exceptions;

public class Calculator {

	// divide by zero exception

	private double divide(double firstnumber, double secondnumber) throws ArithmeticException {

		if (firstnumber == 0 || secondnumber == 0) {
			throw new ArithmeticException("SORRY CAN'T DIVIDE BY ZERO!");
		}

		return firstnumber / secondnumber;

	}

	public void checkNumbers(String firstnumber, String secondnumber) {

		// check if the first number is a valid double number!
		double first = 0, second = 0;

		try {
			first = Double.valueOf(firstnumber);
		} catch (NumberFormatException e) {
			System.out.println("First number is invalid: " + e);
		} finally {
			System.out.println("The first number is: " + firstnumber);
		}

		// Check if the second number is a valid double number!
		try {
			second = Double.valueOf(secondnumber);
		} catch (NumberFormatException e) {
			System.out.println("Second number is invalid: " + e);
		} finally {
			System.out.println("The second number is: " + secondnumber);
		}

		// Divide functionality
		try {
			System.out.println(firstnumber + " / " + secondnumber + " = " + divide(first, second));
		} catch (ArithmeticException e) {
			System.out.println("Sorry something went wrong " + e.getMessage());
		}

	}

}
