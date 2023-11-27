package com.loop.firstweek10_11_23;

import java.util.Scanner;

public class CheckerBoard 
{
	public static  void patter1() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scn.nextInt();
		for(int value=1;value<=number;value++) {
			for(int value1=1;value1<=number;value1++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		patter1();
	}

}
