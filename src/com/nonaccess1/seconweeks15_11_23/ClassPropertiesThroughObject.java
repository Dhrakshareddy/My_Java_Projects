package com.nonaccess1.seconweeks15_11_23;

public class ClassPropertiesThroughObject 
{
	private int value=10;
	int value1=20;
	protected int value2=30;
	public int value3=40;
	public static void main(String[] args) {
		ClassPropertiesThroughObject classPropertiesThroughObject 
		                =new ClassPropertiesThroughObject();
	   System.out.println(classPropertiesThroughObject.value);
	   System.out.println(classPropertiesThroughObject.value1);
	   System.out.println(classPropertiesThroughObject.value2);
	   System.out.println(classPropertiesThroughObject.value3);
	}
	

}
