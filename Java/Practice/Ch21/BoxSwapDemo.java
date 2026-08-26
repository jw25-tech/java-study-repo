package com.test;

class BoxSwapDemo {
	public static <T extends Number> void swapBox (Box<T> t, Box<T> r) {
		T temp = t.get();
		t.set(r.get());
		r.set(temp);
	}
	
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.set(99);
		Box<Integer> box2 = new Box<>();
		box2.set(55);
		
		System.out.println(box1.get() + " & " + box2.get());
		swapBox(box1, box2);
		System.out.println(box1.get() + " & " + box2.get());
	}
}