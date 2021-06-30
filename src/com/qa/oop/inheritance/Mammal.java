package com.qa.oop.inheritance;

public class Mammal extends Animal {
	
	private int speed; 
	
	public Mammal(int speed) {
		this.speed = speed;
	}
	
	public void zoom() {
		System.out.println("Look how fast I can move... " + this.speed);
	}

}
