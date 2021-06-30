package com.qa.oop.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
//		Animal a = new Animal(); 
		
		Elephant dumbo = new Elephant(); 
		dumbo.eat();
		dumbo.sleep();
		dumbo.speak();
		
		Dog milo  = new Dog(); 
		milo.eat();
		milo.sleep();
		milo.speak();
		
		List<String> names = new ArrayList<>(); 
//		Animal a = new Animal(); 
		
		Animal rocky = new Dog(); 
		rocky.eat();
		rocky.sleep();
		
	}
}
