package com.qa.oop.polymorphism;

public class Runner {
	
	public static void main(String[] args) {
		
		System.out.println(" -----DOG--------");
		Dog dog = new Dog(); 
		dog.speak(); // dog class 
		dog.sleep(); // animal class
		
		
		System.out.println(" -----ANIMAL--------");
		Animal animal = new Dog(); 
		((Dog) animal).speak();
		animal.sleep(); // Animal class!
		
		
		System.out.println(" -----OBJECT--------");
		Object object = new Dog(); 
		((Dog) object).speak(); // DOG CLASS
		((Dog) object).sleep(); // ANIMAL CLASS
		
	}

}
