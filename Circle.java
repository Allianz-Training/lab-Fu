package com.allianz.day3;

public class Circle {
	private double radius = 1.0;
	private String colour = "red";
	
	public Circle() {
	}
	public Circle(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		double area = Math.PI*Math.pow(this.radius, 2);
		return area;
	}
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius;
	}
	
	
}
