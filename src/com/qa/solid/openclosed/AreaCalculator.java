package com.qa.solid.openclosed;

public class AreaCalculator {
	
	// work out the area of a shape depending on what it is 
	
	// Rectangle
//	public double calculateRectangle(Rectangle square) {
//		return square.getLength() * square.getWidth();
//	}
//	
//	// Circle
//	public double calculateCircle(Circle circle) {
//		return Math.PI * circle.getRadius() * circle.getRadius(); // PIR2
//	}
	
	// TRIANGLE
	
	
	public double calculateArea(Shape s) {
		return s.calculateArea();
	}
}
