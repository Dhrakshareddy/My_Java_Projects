package com.exce.secondweek17_11_23;

public class MultipleCatchBlocks
{
  public void exception() {
	  try {
		  int value=30;
		  int[]values= {6,7,8,4,2,1};
		 // System.out.println(value/0);
		  //for(int i=0;i<values.length;i++) {
		  System.out.println(values[7]);
		 // }
	  }catch (ArithmeticException e) {
		  e.printStackTrace();
	}catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}catch (Exception e) {
		System.out.println("handled");
	}
  }
  public static void main(String[] args) {
	  MultipleCatchBlocks multipleCatchBlocks = new  MultipleCatchBlocks();
	  multipleCatchBlocks.exception();
}
}
