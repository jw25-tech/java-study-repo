package com.test;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberAZ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 A를 입력하세요: ");
		int A = sc.nextInt();
		
		System.out.print("정수 Z를 입력하세요: ");
		int Z = sc.nextInt();
		
		int min, max;
		
		if(A>Z) {
			min = Z;
			max = A;
		}
		else {
			min = A;
		    max = Z;
		}
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			int randomNum = rand.nextInt(max - min + 1) + min;
			System.out.println(randomNum);
		}
	}
}