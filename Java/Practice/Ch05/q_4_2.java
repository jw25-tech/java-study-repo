package com.test;

public class q_4_2 {
	public static void main(String[] args) {
		int num = 1;
		
		while (num <= 100) {
			System.out.print(num + " ");
			num++;
		}

		System.out.println(" ");
		num--;
		
		do {
			System.out.print(num + " ");
			num--;
		}while (num > 0);
	}
}
