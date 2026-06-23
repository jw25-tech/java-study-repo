package com.test;

class MinMaxFinder {
	public static int minValue(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (arr[i] < min)
				min = arr[i];
        return min;
	}
	
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for(int n : arr) {
			if (n > max) 
				max = n;
		}
		return max;
	}
	
	
	// 실행 코드
	public static void main(String[] args) {
        int[] arr = {35, 250, 31, 14, 55, 61, 154, 27};        
        System.out.println("최솟값: " + minValue(arr));
        System.out.println("최댓값: " + maxValue(arr));
    }
}