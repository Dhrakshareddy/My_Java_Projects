package com.oops.thirdweek21_11_23;

import java.io.IOException;

class A{
	void msg() throws IOException {
		System.out.println("hello medam");
	}
}
public class TestClass extends A
{
	void msg()throws IOException {
		System.out.println("hello sir");
	}
	
	public static void main(String[] args) throws IOException  {
		TestClass testClass =new TestClass();
		testClass.msg();
		
	}

}
