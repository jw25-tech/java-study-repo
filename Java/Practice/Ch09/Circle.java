package com.test;

class Circle {
	private int rad;
	private Point center;  // 참조변수 선언 , private로 외부접근 차단
	
	public Circle(int x, int y, int r) {  // 생성자
		center = new Point(x, y);
		rad = r;
	}
	
	public void showCircleInfo() {
		System.out.print("원의 중심 좌표 : ");
		center.showPointInfo();
		System.out.println("반지름의 길이 : " + rad);
	}
}