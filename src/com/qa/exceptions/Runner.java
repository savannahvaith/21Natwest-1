package com.qa.exceptions;

public class Runner {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator(); 
//		calc.checkNumbers(34, 0); // CAN'T DIVIDE BY 0
		
		calc.checkNumbers("abc", "4");
		
	}

}
