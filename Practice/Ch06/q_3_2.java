package com.test;

public class q_3_2 {
	public static void main(String[] args) {
		binaryNum(5);
	}
	
	public static void binaryNum(int num) {
		if (num == 0)
            return;

        binaryNum(num / 2);
        System.out.print(num % 2);
	}
}