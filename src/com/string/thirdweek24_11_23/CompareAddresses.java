package com.string.thirdweek24_11_23;

public class CompareAddresses 
{
	public static void main(String[] args) {
		String s="corenuts";
		String s1=new String("corenuts");
		System.out.println(s.equals(s1));//true
		System.out.println(s.compareTo(s1));//0
		System.out.println(s==s1);//false
		System.out.println(s.toString().equals(s1.toString()));
	}

}
