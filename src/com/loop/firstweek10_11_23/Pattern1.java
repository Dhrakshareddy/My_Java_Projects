package com.loop.firstweek10_11_23;

import java.util.Scanner;

public class Pattern1 
{
	public static void pattern() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scn.nextInt();
		int stars=number-1;
		int spaces=1;
		for(int value=1;value<=number;value++) {
			for(int value1=1;value1<stars;value1++) {
				System.out.print("*");
			}
			for(int value1=1;value1<spaces;value1++) {
				System.out.print(" ");
			}
			System.out.println();
			stars--;
			spaces++;
		}
		
		}
	
	public static void main(String[] args) {
		pattern();
	}

}
