package com.exce.secondweek17_11_23;

public class ArrayIndexOutOfBoundEx
{
	public void exception() {
		try {
			int[]arr= {2,3,5,7};
			System.out.println(arr[7]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		ArrayIndexOutOfBoundEx arrayIndexOutOfBoundEx =new ArrayIndexOutOfBoundEx();
		arrayIndexOutOfBoundEx.exception();
	}

}
