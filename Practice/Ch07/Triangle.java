package com.test;

public class Triangle {
	double base;
	double height;
	double area;
	
	public Triangle(double a, double b) {
		base = a;
		height = b;
	}
	
	public void setBase(double a) {
		base = a;
	}
	public void setHeight(double b) {
		height = b;
	}
	public double getArea() {
		return base * height / 2;
	}
	
	public static void main(String[] args) {
		Triangle t = new Triangle(12, 15);
		System.out.println("삼각형의 넓이" + " = " + t.getArea());
		
		t.setBase(30);
		t.setHeight(8);
		
		System.out.println("삼각형의 넓이: " + t.getArea());
	}
}