package com.loop.firstweek10_11_23;

import java.util.Scanner;

public class Multiplication 
{
	public static void multiplicationUsingWhile() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scn.nextInt();
		System.out.println("enter the endingRange");
		int endingRange=scn.nextInt();
		int value=1;
		while(value<endingRange)
		 {
			if(value%2!=0) {
				System.out.println(number+"*"+value+"="+(number*value));
			}
			value++;
		}
	}
	public static  void multiplicationUsingDoWhile() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scn.nextInt();
		System.out.println("enter the endingRange");
		int endingRange=scn.nextInt();
		int value=1;
		do {
			if(value%2!=0) {
				System.out.println(number+"*"+value+"="+(number*value));
			}value++;
		}
			while(value<=endingRange);
			
		}

	

	public static void main(String[] args) {
		multiplicationUsingDoWhile();
		multiplicationUsingWhile();
	}

}
