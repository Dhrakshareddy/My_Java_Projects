package com.sort.seconweek14_11_23;

public class BinarySearch
{
	public static int sort(int[]arr,int value) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int midValue=start+end/2;
			if(value==midValue)return midValue;
			else if(value<arr[midValue])end=midValue-1;
			else start=midValue+1;
			
		}
		return -1;
	}
  public static void main(String[] args) {
	int[]arr= {1,5,6,7,8,9};
	System.out.println(sort(arr,1));
}
}
