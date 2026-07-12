package com.test;

public class q_6_1 {
	public static void main(String[] args) {
		int count = 0;
		
		for(int num = 1; num <= 100; num++){
			if(((num % 5) != 0) || ((num % 7) != 0))
				continue;  // 5와 7의 배수가 아니라면 나머지 건너뛰고 위로 이동
			count++;  // 5와 7의 배수인 경우만 실행
			System.out.println(num);  // 5와 7의 배수인 경우만 실행
		}
		System.out.println("count: " + count);
	}
}