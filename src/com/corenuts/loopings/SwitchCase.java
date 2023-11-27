package com.corenuts.loopings;

import java.util.Scanner;

public class SwitchCase 
{
	public static void switchMethod() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scn.nextInt();
		if(num<0)System.out.println("no negatives");
		else
			switch(num) {
		case 1:
			  System.out.println("monday");
			  System.out.println("working day");
		case 2:System.out.println("tuesday");
		       return;
		case 3:System.out.println("wednesday");
		       break;
		case 4:System.out.println("thursday");
		       break;
		default:System.out.println("invalid num");
		        break;
		case 5:System.out.println("friday");
		       break;
		case 6:System.out.println("saturday");
		       break;
		case 7:System.out.println("sunday");
		       System.out.println("holiday");
		       break; 
		}
		}
	 public static void main(String[] args) {
		switchMethod();
	}

}
