package com.corenuts.november;

import java.util.Scanner;

public class TablesProgram 
{ 
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scn.nextInt();
		System.out.println("enter the ending range");
		int endingRange=scn.nextInt();
		for(int i=1;i<=num;i++) {
			multiplication(i,endingRange);
			System.out.println();
		}
}
	static void multiplication(int n,int endingRange) {
		for(int startRange=1;startRange<=endingRange;startRange++) {
			System.out.println(n+"*"+startRange+"="+(n*startRange));
		}
	}

}
