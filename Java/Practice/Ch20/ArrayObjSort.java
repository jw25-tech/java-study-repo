package com.test;

import java.util.Arrays;

class ArrayObjSort {
	public static void main(String[] args) {
		Person[] ar = new Person[5];
		ar[0] = new Person("Lee", 29);
		ar[1] = new Person("Karina", 26);
		ar[2] = new Person("Hana", 37);
		ar[3] = new Person("Goo", 15);
		ar[4] = new Person("WonYoung", 22);
		
		Arrays.sort(ar);
		/*for(Person p : ar)
			System.out.println(p);*/
		
		int idx = Arrays.binarySearch(ar,  new Person("Hana", 8));  // 나이가 달라도 이름이 일치하면 출력됨을 알 수 있음
		System.out.println(ar[idx]);
	}
}