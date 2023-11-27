package com.loop.firstweek10_11_23;

public class CorenutsPattern 
{
	public static void pattern() {
		String name="corenuts";
		for (int i=0; i<name.length(); i++) {
	        for (int j=0; j<=i; j++) {
	          System.out.print(name.charAt(j));
	        }
	        System.out.println();
	      }
	
	}
	public static void main(String[] args) {
		pattern();
	}

}
