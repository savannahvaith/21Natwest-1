package com.qa.oop.inheritance;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		
		Dog milo = new Dog(10, "Lhasa Apso");
		milo.eat(); // Animal class
		milo.sleep(); // Animal class
		milo.zoom(); // Mammal class
		milo.speak(); // Dog class
	
	}

}
