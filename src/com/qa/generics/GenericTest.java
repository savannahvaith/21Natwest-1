package com.qa.generics;

public class GenericTest {

	// method to print arrays

	public static <T> void printArrays(T[] inputArray) {
		// display the array elements
		
		for (T element : inputArray) {
			System.out.print("value: " + element + " ");
		}
	}

//	// Print Strings
//	public void printArrays(String[] inputArray) {
//		// display the array elements
//		for (String element : inputArray) {
//			System.out.print("value: " + element + " ");
//		}
//	}
//
//	// Print Integers
//	public void printArrays(Integer[] inputArray) {
//		// display the array elements
//		for (Integer element : inputArray) {
//			System.out.print("value: " + element + " ");
//		}
//	}
//
//	// Print Doubles
//	public void printArrays(Double[] inputArray) {
//		// display the array elements
//		for (Double element : inputArray) {
//			System.out.print("value: " + element + " ");
//		}
//	}
//	
//	// Print Characters
//	public void printArrays(Character[] inputArray) {
//		// display the array elements
//		for (Character element : inputArray) {
//			System.out.print("value: " + element + " ");
//		}
//	}

	public static void main(String[] args) {
		// create arrays of Integer, double, character

		Integer[] intArray = { 1, 2, 3, 4, 5, 6 };
		Double[] doubleArray = { 1.3, 34.7, 47.8, 56.8 };
		Character[] letters = { 'H', 'E', 'L', 'L', 'O' };

		printArrays(intArray);
		System.out.println("\n ---- double array: ---- \n");
		printArrays(doubleArray);
		System.out.println("\n ---- character array: ---- \n");
		printArrays(letters);
	}

}
