package com.sort.seconweek14_11_23;

public class AscendingAndDecending 
{
  public static void ascending(int[]arr) {
	  for(int i=0;i<arr.length-1;i++) {
		  for(int j=0;j<arr.length-1;j++) {
			  if(arr[j]>arr[j+1]) {
				  int temp=arr[j+1];
					arr[j+1]=arr[j];
							arr[j]=temp;
			  }
		  }
	  }
  }
  public static void decending(int[]arr) {
	  for(int i=0;i<arr.length-1;i++) {
		  for(int j=0;j<arr.length-1;j++) {
			  if(arr[j]<arr[j+1]) {
				  int temp=arr[j+1];
					arr[j+1]=arr[j];
							arr[j]=temp;
			  }
		  }
	  }
  }
  public static void main(String[] args) {
		int[]array= {-13,44,67,12,14};
	//	AscendingAndDecending.decending(array);
		AscendingAndDecending.ascending(array);
		 for(int n:array) {
			 System.out.print(n+",");
		 }
	}
}
