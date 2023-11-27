package com.arrays.firstweek08_11_23;

public class ArrayIndexBoundOutOfException extends Throwable
{
	
	public void exception() {
		try {
			int[]array= {3,6,1,8,9,3,8};
			System.out.println(array[10]);
		}catch (ArrayIndexOutOfBoundsException  e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		 ArrayIndexBoundOutOfException arrayIndexBoundOutOfException =
				new ArrayIndexBoundOutOfException();
		 arrayIndexBoundOutOfException.exception();
	}
	
  
}
