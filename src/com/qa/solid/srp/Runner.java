package com.qa.solid.srp;

public class Runner {

	public static void main(String[] args) {
		
		CarManufacturer merc = new CarManufacturer("blue","c220d","Mercedes",260);
		
		Driver lewisHamilton = new Driver(); 
		
		lewisHamilton.setMilesDriven(500);
		lewisHamilton.drive(merc);
		
		System.out.println(merc.getSpeed());
		
	}
	
}
