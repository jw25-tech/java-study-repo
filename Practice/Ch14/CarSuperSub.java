package com.test;

public class CarSuperSub {  // 실행 코드
	public static void main(String[] args) {
        HybridWaterCar hwCar1 = new HybridWaterCar(4, 2, 3);
        hwCar1.showCurrentGauge();
        System.out.println();
        
        HybridWaterCar hwCar2 = new HybridWaterCar(9, 5, 7);
        hwCar2.showCurrentGauge();
        System.out.println();
        
        HybridCar hCar1 = new HybridCar(5, 6, 0);
        hCar1.showHybridGauge();
        System.out.println();

        Car car1 = new Car(3, 0, 0);
        car1.showGasolineGauge();
        System.out.println();
	}
}

// Car, HybridCar, HybridWaterCar에 필요한 생성자 삽입하기
// 학습 후 보완점 : 각 클래스 별로 연료 잔여량을 출력하는 메서드 삽입연습