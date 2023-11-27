package com.loop.firstweek10_11_23;

import java.util.Scanner;

public class BreakKeywordProgram {
	
	//break keyword using for loop
	public static void breakUsingFor(){
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scn.nextInt();
		for(int value=1;value<=number;value++) {
			if(value==47) {
				break;
			}
			System.out.println(value);
		}
	}
	//break keyword using while loop
	public static void breakUsingWhile(){
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scn.nextInt();
		int value=1;
		while(value<number) {
			if(value==47) {
				break;
			}
			System.out.println(value);
			value++;
			
		}
	}
	//break keyword using do-while loop
	public static void breakUsingDoWhile(){
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scn.nextInt();
		
		int value=1;
		do {
			if(number<0)System.out.println("no negatives");
			else if(value==47) {
				break;
			}
			value++;
		}
		while(value<number);
	}
	

	public static void main(String[] args) {
		//breakUsingFor();
		//breakUsingWhile();
		breakUsingDoWhile();
	}
}
