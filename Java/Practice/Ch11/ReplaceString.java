package com.test;

class ResidentNumber {
	private String number;
	
	public ResidentNumber(String number) {
		this.number = number;
	}
	
	 public String replaceString() {      // 메소드명 소문자로 수정
	        String front = number.substring(0, 6);
	        String back = number.substring(7);

	        return front.concat(String.valueOf(' ')).concat(back);
	    }

		public String replaceStringBuilder() {
		    StringBuilder stb = new StringBuilder(number);
			stb.replace(6, 7, " ");
			return stb.toString();
		}
}

public class ReplaceString {
	 public static void main(String[] args) {
	        ResidentNumber rn = new ResidentNumber("990925-1012999");

	        System.out.println("990925-1012999");
	        System.out.println(rn.replaceString());
	    }	
}