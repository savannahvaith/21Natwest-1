package com.qa.oop.encapsulation;

public class Bank {
	
	// Variables must always be private!!
	private int balance; 
	
	public Bank(int balance) {
		this.balance = balance; 
	}
	
	// to modify variables, use public methods!
	public void deposit(int value) {
//		this.balance + value; 
		setBalance(value+this.balance);
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
