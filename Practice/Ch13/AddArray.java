package com.test;

class AddArray {
	public static void addOneDArr(int[] arr, int add) {
		for(int i = 0; i < arr.length; i++)
			arr[i] += add;
	}
	
	public static void addTwoDArr(int[][] arr, int add) {
		for(int i = 0; i < arr.length; i++)
			addOneDArr(arr[i], add);
	}
	
	
	// 실행코드
	public static void main(String[] args) {
		int[][] nums = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };

	        addTwoDArr(nums, 10);

	        for (int i = 0; i < nums.length; i++) {
	            for (int j = 0; j < nums[i].length; j++) {
	                System.out.print(nums[i][j] + " ");
	            }
	            System.out.println();
	        }
	}
}