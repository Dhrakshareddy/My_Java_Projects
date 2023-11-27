package com.corenuts.loopings;
class B{
	public void m1(int n) {
		System.out.println("hi");
	}
}
class C extends B{
	public void m1(double d) {
		System.out.println("hello");
	}
}
public class A
{
	public static void main(String args[])
	{
		C a=new C();
		a.m1(23445);
	}
}