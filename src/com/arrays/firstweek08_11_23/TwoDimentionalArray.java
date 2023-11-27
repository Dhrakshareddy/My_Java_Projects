package com.arrays.firstweek08_11_23;

public class TwoDimentionalArray 
{
	public static void main(String[] args) {
		int[][]value=new int[3][3];
		value[0][0]=10;
		value[0][1]=20;
		value[0][2]=30;
		value[1][0]=40;
		value[1][1]=50;
		value[1][2]=60;
		value[2][0]=70;
		value[2][1]=80;
		value[2][2]=90;
		System.out.println(value[2][2]);
		int[]value1= {34,65,65,767,332,78};
		for(int i=0;i<value1.length-1;i++) {
			System.out.print(value1[i]+",");
		}
		
		
	}

}
