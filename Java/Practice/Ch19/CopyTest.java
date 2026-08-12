package com.test;

public class CopyTest {
    public static void main(String[] args) {
        try {
            // 원본 생성
            PersonalInfo org = new PersonalInfo("이재용", 58, "삼성전자", "결제");
            // 복사본 생성 (깊은 복사)
            PersonalInfo cpy = (PersonalInfo)org.clone();

            System.out.println("=== 원본 정보 ===");
            org.showPersonalInfo();
            System.out.println();
            
            System.out.println("=== 복사본 정보 ===");
            cpy.showPersonalInfo();

            // 원본의 Business 정보 수정
            System.out.println("\n--- 원본의 회사/업무 변경 후 ---\n");
            
            org = new PersonalInfo("최태원", 65, "SK하이닉스", "결제");

            System.out.println("=== 원본 정보 ===");
            org.showPersonalInfo();
            System.out.println();
            
            System.out.println("=== 복사본 정보 ===");
            cpy.showPersonalInfo();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}