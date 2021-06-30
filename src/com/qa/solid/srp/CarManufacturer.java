package com.qa.solid.srp;

public class CarManufacturer {
	
	private String colour; 
	private String make; 
	private String model;
	private int speed; 
	
	// constructuor - creating the instance of our object
	
	public CarManufacturer(String colour, String make, String model, int speed) {
		this.colour = colour; 
		this.make = make; 
		this.model = model; 
		this.speed = speed; 
	}
	
	
	private boolean deployAirBag() {
		return false; 
	}
	// getters and setter

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
}
