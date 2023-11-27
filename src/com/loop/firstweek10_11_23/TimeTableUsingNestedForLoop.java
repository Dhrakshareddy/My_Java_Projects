package com.loop.firstweek10_11_23;

public class TimeTableUsingNestedForLoop 
{
	public static void nestedLoop() {
		int number=9;
		for(int value=1;value<=number;value++) {
			for(int value1=1;value1<=number;value1++) {
				System.out.print(value*value1);
			}
			System.out.println();
		}
	}
   public static void main(String[] args) {
	  TimeTableUsingNestedForLoop.nestedLoop();
	 }
}
