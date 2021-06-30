package com.qa.oop.inheritance;

public class Dog extends Mammal{
	
	private String species; 
	
	public Dog(int speed, String species) {
		super(speed);
		this.species = species;
	}

	public void speak() {
		System.out.println("Woof");
	}

}
