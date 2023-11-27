package com.loop.firstweek10_11_23;

import java.util.Scanner;

public class SumAndAverageProgram 
{
	public static void sumOfNumber() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scn.nextInt();
		int sum=0;
		for(int value1=1;value1<=number;value1++) {
			sum+=value1;
		}
		System.out.println("The sum of given number is:"+sum);
		double average=0;
		average=sum/number;
		System.out.println("The average of given number is:"+average);
	}
	
	
	public static void main(String[] args) {
		sumOfNumber();
	}

}
