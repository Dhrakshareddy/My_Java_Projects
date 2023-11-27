package com.string.thirdweek24_11_23;

public class StringBuffer1 
{ 
//	public static void  priToStr(int n) {
//		String str=String.valueOf(n);
//		System.out.println(str);
//		System.out.println(str.length());
//		
//	}
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Corenuts Technology Pvt Ltd");
		System.out.println(sb.delete(9, 19));
		StringBuffer sb1=new StringBuffer("Corenuts Pvt Ltd");
		String s="Technologies";
		int n=sb1.indexOf("corenuts")+"Corenuts ".length()+1;
		sb1.insert(n,s);
		System.out.println(sb1);
	    
	}

}
