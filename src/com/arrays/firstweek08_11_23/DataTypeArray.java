package com.arrays.firstweek08_11_23;

public class DataTypeArray
{
	public void dataType() {
		int[]intValue= {6,7,3,1};
		System.out.println(intValue[0]+" "+intValue[1]+" "+intValue[2]+" "+intValue[3]);
		short[]shortValue= {4,5,6};
		System.out.println(shortValue[0]+" "+shortValue[1]+" "+shortValue[2]);
		byte[]byteValue= {4,7,8};
		System.out.println(byteValue[0]+" "+byteValue[1]+" "+byteValue[2]);
		long[]longValue= {6,8,4,3};
		System.out.println(longValue[0]+" "+longValue[1]+" "+longValue[2]+" "+longValue[3]);
		float[]floatValue= {4.4f,6.4f,7.5f};
		System.out.println(floatValue[0]+" "+floatValue[1]+" "+floatValue[2]);
		double[]doubleValue={4.4,6.4,7.3,4.77};
		System.out.println(doubleValue[0]+" "+doubleValue[1]+" "+doubleValue[2]+" "+doubleValue[3]);
		boolean[]booleanValue= {false,true};
		System.out.println(booleanValue[0]+" "+booleanValue[1]);
	    char[]charValue= {'j','a','v','a'};   
		System.out.println(charValue[0]+" "+charValue[1]+" "+charValue[2]+" "+charValue[3]);
	     
	}
	public void declareAnArray() {
		int[]value=new int[3];
		int value1[]= {5,7,8,9,2};
		System.out.print(value1[0]);
		System.out.print(value1[1]);
		System.out.print(value1[2]);
		System.out.print(value1[3]);
		System.out.print(value1[4]);
		value[0]=10;
		value[1]=20;
		value[2]=30;
		System.out.print(value[0]);
		System.out.print(value[1]);
		System.out.print(value[2]);
		
		
	}
	public static void main(String[] args) {
		DataTypeArray dataTypeArray = new DataTypeArray();
		dataTypeArray.dataType();
		dataTypeArray.declareAnArray();
		
		
		
	}
 
	
}
