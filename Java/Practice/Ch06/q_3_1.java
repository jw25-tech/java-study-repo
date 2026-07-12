package com.test;

public class q_3_1 {
	public static void main(String[] args) {
		System.out.println("2의 n승 반환: " + powerOfTwo(3));
	}
	
	public static int powerOfTwo(int n) {
		if(n == 0)
			return 1;
		
		return 2 * powerOfTwo(n-1);
	}
}