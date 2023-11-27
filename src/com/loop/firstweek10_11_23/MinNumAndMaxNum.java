package com.loop.firstweek10_11_23;

public class MinNumAndMaxNum {

	public static void minNumber() {
		int[]array= {45,65,23,77,78,32,21,10};
		int minimumNumber=array[0];
		//for(int value1=1;value1<=array.length-1;value1++) {
		int value1=1;
		while(value1<array.length) {
		int	value=array[value1];
			if(value<minimumNumber) {
				minimumNumber=value;
			}value1++;
		}System.out.println("minimumNumber in given array:"+minimumNumber);
	}
	public static void maxNumber() {
		int[]array= {45,65,23,77,78,32,21,10};
		int maximumNumber=array[0];
	 // for(int value1=1;value1<=array.length-1;value1++) {
		int value1=1;
		while(value1<array.length) {
		int	value=array[value1];
			if(value>maximumNumber) {
				maximumNumber=value;
			}value1++;
		}System.out.println("maximumNumber in given array:"+maximumNumber);
	}
	public static void main(String[] args) {
		minNumber();
		maxNumber();
	}
}
