package com.test;

public class q_7_2 {
	public static void main(String[] args) {
		for(int A = 0; A < 10; A++) {
			for(int B = 0; B < 10; B++) {
				if(A + B == 9) {
				System.out.println("  " + "A" + " " + "B");
				System.out.println("+ " + "B" + " " + "A");
				System.out.println("------");
				System.out.println("  9 9");
				System.out.println();
				}
			}
		}
	}
}