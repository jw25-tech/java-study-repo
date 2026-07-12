package com.test;

public class q_2_1 {
	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		int big;
		int diff;
		
		if (num1 > num2) {
			big = num1;
			diff = (num1 - num2);
		}
		else {
			big = num2;
			diff = (num2 - num1);
		}
		
		System.out.println("큰 수: " + big);
		System.out.println("절댓값: " + diff);
	}
}