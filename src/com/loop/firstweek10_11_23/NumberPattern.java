package com.loop.firstweek10_11_23;

import java.util.Scanner;

public class NumberPattern 
{
	public static  void pattern() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scn.nextInt();
		for(int value=1;value<=number;value++) {
			if(value==2)continue;
				for(int value1=1;value1<=value;value1++) {
				System.out.print(value1);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		pattern();
	}

}
