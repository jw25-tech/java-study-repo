package com.test;

public class q_6_2 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i > 0; i++) {
			if((i % 2) == 1) {
				sum += i;
				
				if(sum >= 1000) {
					System.out.println("마지막으로 더한 수: " + i);
					System.out.println("1000을 넘어선 값: " + sum);
					break;
				}
			}
		}
	}
}

/* while문 일때 
  int num = 1;
  int sum = 0;
  
  while(true){
        if((num % 2) == 1){
            sum += num;
       
        if(sum >= 1000){
            System.out.println("마지막으로 더한 수: " + num);
            System.out.println("1000을 넘어선 합: " + sum);
            break;
        }
    }
    num++;
}
 */