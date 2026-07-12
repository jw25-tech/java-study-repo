package com.test;

public class q_2_1 {
	public static void main(String[] args) {
		double radius = 4;
		double result1, result2;
		result1 = area(radius);
		result2 = perimeter(radius);
		
		System.out.println("원의 넓이 : " + result1);
		System.out.println("원의 둘레 : " + result2);
	}
	
	public static double area(double radius) {
		double AreaResult = radius * radius * 3.14;
		return AreaResult;
	}
	
	public static double perimeter(double radius) {
		double PerimeterResult = 2 * 3.14 * radius;
		return PerimeterResult;
	}
}

// 실무에서 사용할 일이 있다면 Math.PI 상수를 사용
// 변수명을 따로 작성할 필요 x, 바로 return을 하면 됨.