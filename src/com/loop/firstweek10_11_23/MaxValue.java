package com.loop.firstweek10_11_23;

public class MaxValue
{
	public static void maxValueProgram() {
		int value1=34,value2=67,value3=12;
		int keyValue=(value1>value2)?value1:value2;
		int maxNum=(keyValue>value3)?keyValue:value3;
		System.out.println("maxNum in given numbers:"+maxNum);
	}
	public static void main(String[] args) {
		maxValueProgram();
	}

}
