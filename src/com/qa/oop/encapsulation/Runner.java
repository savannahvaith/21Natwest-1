package com.qa.oop.encapsulation;

public class Runner {

	public static void main(String[] args) {
		Bank savannah = new Bank(40);
		
		savannah.deposit(400);
		
		System.out.println(savannah.getBalance());
		
//		natwest.balance = 400000000; // can't access if variable is PRIVATE! 
	}
	
	
	
}
