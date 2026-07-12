package com.test;

public class RotateArray {
	public static void rotateRows(int[][] arr) {
	    int[][] temp = new int[arr.length][arr[0].length];

	    // 마지막 행을 맨 앞으로
	    temp[0] = arr[arr.length - 1];

	    for (int i = 1; i < arr.length; i++) {
	        temp[i] = arr[i - 1];
	    }
	    
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = temp[i];
	    }
	}
	
	public static void showTwoDArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
	
	public static void main(String[] args) {
		int[][] nums = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		System.out.println("원 배열: ");
		showTwoDArr(nums);

        rotateRows(nums);
        
        System.out.println();
        System.out.println("변경 후:");
        showTwoDArr(nums);
	}
}