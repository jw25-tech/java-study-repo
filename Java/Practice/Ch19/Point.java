package com.test;

class Point {
	private int xPos;
	private int yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		
		if(this.xPos == p.xPos && this.yPos == p.yPos)
			return true;
		else
			return false;
	}
}