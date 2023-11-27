package com.exce.secondweek17_11_23;

public class MultipleExInOneCatch {
	public void exception1() {
		try {
			  int value=30;
			  int[]values= {6,7,8,4,2,1};
			 // System.out.println(value/0);
			  //for(int i=0;i<values.length;i++) {
			  System.out.println(values[7]);
			 // }
		  }catch (ArithmeticException|ArrayIndexOutOfBoundsException e) {
			  e.printStackTrace();
			  System.out.println(e.getMessage());
	}
	}
	public static void main(String[] args) {
		MultipleExInOneCatch multipleExInOneCatch = new MultipleExInOneCatch();
		multipleExInOneCatch.exception1();
	}

}
