package com.inter.secondweek16_11_23;

public class TestClass implements Vehicle
{
	@Override
	public void calculate(int value1,int value2) {
	  int sum=value1+value2;
	  System.out.println(sum);
	}
	@Override
	public void maxValue() {
     int value1=23, value2=56;
     int maxValue=(value1>value2)?value1:value2;
     System.out.println(maxValue);
	}

	public static void main(String[] args) {
		TestClass testClass = new TestClass();
		testClass.calculate(20, 30);
		testClass.maxValue();
	}

	

	
}
