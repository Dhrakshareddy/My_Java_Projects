package com.exce.secondweek17_11_23;

public class ExceptionClass
{
	public void exception() {
		try {
			int value1=45;
			System.out.println(value1/0);
		}catch (ArithmeticException e) {
	e.printStackTrace();
	System.out.println(e.getMessage());
		}
		
	}
	public static void main(String[] args) {
		ExceptionClass exceptionClass = new ExceptionClass();
		exceptionClass.exception();
	}

}
