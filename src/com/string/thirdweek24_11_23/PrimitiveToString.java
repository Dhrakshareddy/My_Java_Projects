package com.string.thirdweek24_11_23;

public class PrimitiveToString {

	public void convert() {
		int num=34;
	//	String s=String.valueOf(num);
		String s1=""+num;
		System.out.println(s1);
	}
	public static void main(String[] args) {
		PrimitiveToString primitiveToString =new PrimitiveToString();
		primitiveToString.convert();
	}
}
