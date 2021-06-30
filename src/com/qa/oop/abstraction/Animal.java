package com.qa.oop.abstraction;

// Abstract classes can never be instantiated!!!
public abstract class Animal {
	
	public void eat() {
		System.out.println("Nom");
	}
	
	public void sleep() { 
		System.out.println("zzzz");
	}

	// methods with no bodies
	public abstract void speak();
	
	
	
}
