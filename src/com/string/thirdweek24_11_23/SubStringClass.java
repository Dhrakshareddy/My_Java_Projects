package com.string.thirdweek24_11_23;

import java.util.Arrays;

public class SubStringClass {
	public void toCharArray(String s) {
		char[] str1=s.toCharArray();
		//System.out.println(str1);
		System.out.println(Arrays.toString(str1));
	}
	
	public void subString(String s) {
		String str=(s.substring(0, 20));
		System.out.println("substring:"+str);
		
	}
	
  public static void main(String[] args) {
	String s="CoreNuts Technologies Pvt ltd";
	SubStringClass subStringClass = new SubStringClass();
	subStringClass.subString(s);
	subStringClass.toCharArray(s);
}
}
