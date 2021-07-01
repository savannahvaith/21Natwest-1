package com.qa.exceptions;

import java.sql.SQLException;

public class ExceptionHandler {
	public static void main(String[] args) {
		
//		String[] names = {"Savannah", "Cameron"};
//		try {	
//			System.out.println(names[50]);			
//		}catch(Exception e) {
//			System.out.println("I caught an error for you: " + e);
//		}
		
		// UseCase : User entering their account number
		
		String accountNumber= "abccccccc";
		
		try {
			int number = Integer.parseInt(accountNumber);
			System.out.println(number);
		}catch(NumberFormatException incorrect) {
			System.out.println("Hey, you didn't enter a number!!!");
		}catch(Exception e) {
			System.out.println("Oops something went wrong!" + e);
		}finally {
			// try / catch 
			// any clean up? 
			// any mesasge you want tell them before moving on
		}
		
		// rest of the code after goes here
		System.out.println("Continue code here...");
		
	}
	
	public void enterBankAccountNumber() throws NumberFormatException{
		String accountNumber = "2345";
		int number = Integer.parseInt(accountNumber);
		System.out.println(number);
	}
	

}
