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
//		enhancedPrintNames();
		printMDArray();
	}

	// print arrays
	public static void printNames() {
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

	// enhanced for loop - let the computer do the hard stuff
	public static void enhancedPrintNames() {
		for (String person : names) {
			System.out.println(person);
		}
	}

	// Multi-dimensional arrays

	public static int[][] ageArray = { { 1990, 25, 45 }, { 1995, 26, 54 } };

	public static void printMDArray() {
//		System.out.println(ageArray[0][3]);

		// loop through the COLUMNS
		for (int i = 0; i < ageArray.length; i++) {
			// loop through the ROWS
			for (int j = 0; j < ageArray[i].length; j++) {
				System.out.println(ageArray[i][j]);

//				ageArray[0][0]
//				ageArray[0][1]
//				ageArray[0][2]

//				ageArray[1][0]
//				ageArray[1][1]
//				ageArray[1][2]
			}
		}

	}

}
