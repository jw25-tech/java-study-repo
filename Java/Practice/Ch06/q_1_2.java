package com.test;

public class q_1_2 {
	public static void main(String[] args) {
		absolute(4,5);
		absolute(9,6);
		absolute(-8,6);
	}
	
	public static void absolute(int num1, int num2) {
		int result = num1 - num2;
		
		if(result >= 0)
			System.out.println(result);
		else
			System.out.println(-(result));
	}
}