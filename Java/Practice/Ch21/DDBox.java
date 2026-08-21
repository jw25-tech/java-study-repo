package com.test;

class DDBox<U, D> {
	private U up;
	private D down;
	
	public void set(U u, D d) {
		up = u;
		down = d;
	}
	
	@Override
	public String toString() { 
		return up + "\n" + down;
	}
	
	
	public static void main(String[] args) {  // 문제 1 : main메소드를 기반으로 DBox<L, R>을 저장한 DDBox<U, D> 를 정의하기 
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);
		
		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33);
		
		DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
		ddbox.set(box1, box2);    // 두 개의 상자를 하나의 상자에 담음
		System.out.println(ddbox);    // 상자의 내용물 출력
	}
}