package com.arrays.firstweek08_11_23;

public class NegativeSizeInArray
{
	public void negativeValues() {
		try {
			int[]values=new int[-2];
		}catch(NegativeArraySizeException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		NegativeSizeInArray negativeSizeInArray = new NegativeSizeInArray();
		negativeSizeInArray.negativeValues();
	}

}
