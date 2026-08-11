package com.test;

class Rectangle {
	private Point upperLeft;    // 좌측 상단 좌표
	private Point lowerRight;    // 우측 하단 좌표
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	
	@Override
	public boolean equals(Object obj) {
        Rectangle r = (Rectangle)obj;    // Object 클래스는 모든 클래스의 최상위 클래스
		
		if(upperLeft.equals(r.upperLeft) && lowerRight.equals(r.lowerRight))
			return true;
		else
			return false;
	}
}