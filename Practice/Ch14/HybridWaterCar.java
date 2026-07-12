package com.test;

class HybridWaterCar extends HybridCar{  // 하이브리드 워터카
	int waterGauge;  // 에너지 전환용 물의 잔여량
	
	public HybridWaterCar(int i, int j, int z) {
		super(i, j, z);
		this.waterGauge = z;
	}
	
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린: " + gasolineGauge);
		System.out.println("잔여 전기량: " + electricGauge);
		System.out.println("잔여 워터량: " + waterGauge);
	}
}