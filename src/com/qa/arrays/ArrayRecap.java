package com.qa.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayRecap {

	static List<String> names = new ArrayList<>();
	
	public static void main(String[] args) {

		// ArrayList - A way to store information
		// DataType - Type of data - String, Integer, Double

		// use the methods from the LIST class!
		names.add("Savannah");
		names.add("Cameron");
		names.add("Mike");
		names.add("lisa");
		names.add("kim");
		
		System.out.println(names.size());
//		printNames();
		enhancedPrintNames();
	}
	
	// print arrays
	public static void printNames() {
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
	}
	
	// enhanced for loop - let the computer do the hard stuff
	
	public static void enhancedPrintNames() {
		for(String person : names) {
			System.out.println(person);
		}
	}
	
}
