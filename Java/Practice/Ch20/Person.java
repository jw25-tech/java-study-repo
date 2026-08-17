package com.test;

class Person implements Comparable {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/* @Override    // 20-2 Q_1 나이의 역순으로 정렬
	public int compareTo(Object o) {
		Person p = (Person)o;
		if(this.age < p.age)
			return 1;    // 인자로 전달된 o가 크다면 양의 정수 반환
		else if(this.age > p.age)
			return -1;    // 인자로 전달된 o가 작다면 음의 정수 반환
		else
			return 0;    // 인자로 전달된 o와 같다면 0을 반환
	}*/
	
	/* @Override    // 20-2 Q_2 이름의 길이 순으로 정렬
	public int compareTo(Object o) {
		Person p = (Person)o;
		if(this.name.length() > p.name.length())
			return 1;
		else if(this.name.length() < p.name.length())
			return -1;
		else
			return 0;
	}*/
	
	@Override    // 20_3 탐색 기준 변경하기
	public int compareTo(Object o) {
		Person p = (Person)o;
		return this.name.compareTo(p.name);
	}
	
	@Override
	public String toString() {
		return name + ":" + age;
	}
}