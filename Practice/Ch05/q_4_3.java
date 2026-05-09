package com.test;

public class q_4_3 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while (num <= 1000) {
			if ((num % 2) == 0 && (num % 7) == 0) {
				System.out.println(num);
				sum += num;
			}
			num++;
		}
		
		System.out.println("1000 이하 자연수 중에서 2의 배수이자 7의 배수인 수들의 합: " + sum);
	}
}