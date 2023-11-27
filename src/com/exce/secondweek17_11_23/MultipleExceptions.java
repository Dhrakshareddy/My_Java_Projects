package com.exce.secondweek17_11_23;

public class MultipleExceptions {
 public static void exception() {
	 try {
		 try {
			 String str=null;
			 System.out.println(str.length());
		 }catch (NullPointerException e) {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
			 }
		 System.out.println(20/0); 
	 }
	 catch (ArithmeticException e) {
		 e.printStackTrace();
		 System.out.println(e.getMessage());
	}
 }
 public static void main(String[] args) {
	exception();
}
}
