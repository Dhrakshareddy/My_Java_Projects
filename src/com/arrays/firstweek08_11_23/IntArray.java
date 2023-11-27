package com.arrays.firstweek08_11_23;

public class IntArray 
{
	public static void main(String[] args) {
		int[]values=new int[5];
		values[0]=10;
		values[1]=20;
        values[2]=30;
        values[3]=40;
        values[4]=50;
        System.out.println(values[3]);
        System.out.println(values[2]);
       // system.out.println(value1);
    for(int i=0;i<values.length;i++) {
    	System.out.print(values[i]+",");
    }
	}

}
