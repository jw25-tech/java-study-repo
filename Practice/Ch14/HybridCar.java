package com.test;

class HybridCar extends Car{  // 하이브리드 자동차
	int electricGauge;  // 전기 배터리 잔여량
	
	public HybridCar(int i, int j, int z) {
		super(i, j, z);
		this.electricGauge = j;
	}
	public void showHybridGauge() {
		System.out.println("잔여 가솔린: " + gasolineGauge);
		System.out.println("잔여 전기량: " + electricGauge);
	}
}