package com.loop.firstweek10_11_23;

import java.util.Scanner;

public class StudentsMarks
{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the total marks obtained:");
		int marks=scn.nextInt();
		int percentage=(marks*100)/100;
		switch(marks/10) {
		case 10:
		case 9:System.out.println("A grade");
		break;
		case 8:System.out.println("B grade");
		break;
		case 7:System.out.println("C grade");
		break;
		case 6:System.out.println("D grade");
		break;
		case 5:System.out.println("E grade");
		break;
		default:System.out.println("Fail");
		}
	}

}
