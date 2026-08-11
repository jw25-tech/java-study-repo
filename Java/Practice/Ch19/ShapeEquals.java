package com.test;

class ShapeEquals {
	public static void main(String args[]) {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		Point p3 = new Point(3, 4);
	
		Rectangle r1 = new Rectangle(1, 2, 4, 5);
		Rectangle r2 = new Rectangle(1, 2, 4, 5);
		Rectangle r3 = new Rectangle(4, 6, 3, 7);
		
		if(p1.equals(p2))
            System.out.println("같다.");
        else
            System.out.println("다르다.");
		
		System.out.println("");
		
		if(p1.equals(p3))
			System.out.println("같다.");
		else
			System.out.println("다르다.");
		
		System.out.println("");

        if(r1.equals(r2))
            System.out.println("같다.");
        else
            System.out.println("다르다.");
        
        System.out.println("");
        
        if(r1.equals(r3))
        	System.out.println("같다.");
        else
        	System.out.println("다르다.");
	}
}