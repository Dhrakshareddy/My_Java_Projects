package com.corenuts.loopings;

public class GamingProgram 
{
	
	public static void sum(int[][]arrays) {
		int sum=0;
		for(int i=0;i<arrays.length;i++) {
			for(int j=0;j<arrays.length;j++) {
				sum+=arrays[i][j];
			}
		}if(sum==5)System.out.println("winners");
		else System.out.println("runners");
	}
	public static void count(int[]arrays) {
		int count=0;
		for(int i=0;i<arrays.length;i++) {
			if(arrays[i]==1) {
				count++;
			}
		}System.out.println(count);
	}
	//public static void 
	public static void main(String[] args) {
		int[]array= {1,0,1,1,0};
		int[]array1= {0,0,1,1,1};
		int[]array2= {1,1,1,1,0};
		int[]array3= {0,1,1,1,1};
		int[]array4= {1,1,1,1,1};
		int result[][]= {array,array1,array2,array3,array4};	
				GamingProgram.sum(result);
		//GamingProgram.count(array4);
	}

}
