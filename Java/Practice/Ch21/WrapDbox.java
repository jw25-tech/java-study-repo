package com.test;

class WrapDbox {  // 문제 2 : DBox만으로 문제 1과 같은 내용물을 출력하기
	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);
		
		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33);
		
		DBox<DBox<String, Integer>, DBox<String, Integer>> wdBox = new DBox<>();
		wdBox.set(box1, box2);
		
		System.out.println(wdBox);
	}
}

// 문제 1의 출력과 같은 결과를 얻으려면 출력 메소드를 별도로 작성하면 될 것 같음
// 혹은 wdBox로 박싱만 해두고 출력 시에 box1, box2를 직접 인자로 전달하는 방법도 존재 