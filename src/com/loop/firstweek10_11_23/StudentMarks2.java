package com.loop.firstweek10_11_23;

public class StudentMarks2 
{
	public static void minmarks(int[]array) {
		int min=array[0];
		for(int value=0;value<=array.length-1;value++) {
			if(array[value]<min) {
				min=array[value];
			}
		}
		System.out.println("minimum marks:"+min);
		
	}
	public static void maxmarks(int[]array) {
		int max=array[0];
		for(int value=0;value<=array.length-1;value++) {
			if(array[value]>max) {
				max=array[value];
			}
		}
		System.out.println("maximum marks:"+max);
		
	}
	public static void avgmarks(int[]array) {
		int sum=0;
		for(int value=0;value<=array.length-1;value++) {
			sum+=array[value];
		}	
	  double average=sum/5;
	  System.out.println("average marks:"+average);
		
	}
   public static void main(String[] args) {
	int array[]= {76,92,68,73,88};
	minmarks(array);
	maxmarks(array);
	avgmarks(array);
	
	
}
}
