package com.exce.thirdweek20_11_23;

public class CallerMethod 
{
	static void method1() {
		System.out.println("method1 starts");
		try {
			method2();
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("method1 ends");
	}
	static void method2() throws ArithmeticException{
		try {
			method3();
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(45/0);
	}
	static void method3() throws NullPointerException {
		String str=null;
		System.out.println(str.length());	
	}
	public static void main(String[] args) {
		method1();
	}
	//why we need of throws means we don't know how to handle

}
