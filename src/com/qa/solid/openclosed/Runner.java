package com.qa.solid.openclosed;

public class Runner {
	
	public static void main(String[] args) {
		
		Rectangle shape1 = new Rectangle(10, 15);
		Rectangle shape2 = new Rectangle(3,5);
		
		AreaCalculator calculate = new AreaCalculator(); 
		
		System.out.println(" --------- RECTANGLE ----------");
		System.out.println(calculate.calculateArea(shape1));
		System.out.println(calculate.calculateArea(shape2));
		
		System.out.println(" ---------- CIRCLE --------------");
		
		Circle round1 = new Circle(35);
		Circle roundthing2 = new Circle(89);
		
		System.out.println(calculate.calculateArea(round1));
		System.out.println(calculate.calculateArea(roundthing2));
		
	}

}
