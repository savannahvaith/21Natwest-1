package com.qa.solid.srp;

public class Driver {
	
	private int milesDriven;

	public int getMilesDriven() {
		return milesDriven;
	}

	public void setMilesDriven(int milesDriven) {
		this.milesDriven = milesDriven;
	} 
	

	// functionality here - for driving a car!
	// the driver has responsibility of moving the vehicle, NOT the car
	
	public void drive(CarManufacturer car) {
		car.setSpeed(car.getSpeed() + this.getMilesDriven());
	}
	
	

}
