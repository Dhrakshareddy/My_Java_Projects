package com.sort.seconweek14_11_23;

public class FabanacciSeries 
{
	public static void fabanacci() {
		int number=20;
		int value1=1,value2=1;
		double result=0;
		System.out.print(value1+" "+value2+" ");
		for(int i=3;i<=number;i++) {
			int sum=value1+value2;
			result=result+sum;
			System.out.print(sum+" ");
			value1=value2;
			value2=sum;
		}
		System.out.println();
		double average=result/number;
		System.out.println("average:"+average);
	}
	
	public static void main(String[] args) {
		FabanacciSeries.fabanacci();
	}
}
