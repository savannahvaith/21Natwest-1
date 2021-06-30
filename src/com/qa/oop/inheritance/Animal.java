package com.qa.oop.inheritance;

public class Animal {
	
	private boolean hungry; 
	private String name; 
	
	public void eat() {
		System.out.println("Yummers");
	}
	
	public void sleep() {
		System.out.println("Catching some zzz's");
	}

	public boolean isHungry() {
		return hungry;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
