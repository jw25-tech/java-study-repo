package com.test;

class ResidentNumber {
	private String number;
	
	public ResidentNumber(String number) {
		this.number = number;
	}
	
	 public String Replace() {
	        String front = number.substring(0, 6);
	        String back = number.substring(7);

	        return front.concat(String.valueOf(' ')).concat(back);
	    }
}

public class ReplaceHyphen {
	
	 public static void main(String[] args) {

	        ResidentNumber rn =
	                new ResidentNumber("990925-1012999");

	        System.out.println("990925-1012999");
	        System.out.println(rn.Replace());
	    }	
}