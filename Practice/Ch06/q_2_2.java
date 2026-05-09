package com.test;

public class q_2_2 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			if(primeNum(i)) {
				System.out.println(i + " = 소수");
			}
		}
	}
	
	public static boolean primeNum(int num) {
		if(num <= 1)
			return false;
		
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		
		return true;
	}
}