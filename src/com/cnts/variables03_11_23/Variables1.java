package com.cnts.variables03_11_23;

public class Variables1
{
  static int value1=10;
  int value2=20;
  public static void sum(int value1,int value2) {
	  int sum=value1+value2;
	  System.out.println(sum);
	 // System.out.println(Operators.value1);
	//  System.out.println(value2);
  }
  public static void main(String[] args) {
	  int value3;
	//  System.out.println(value3);
	Variables1 operators =new Variables1();
	operators.sum(13, 7);
}
}
//we can access static dm inside the non-static method
//we can't access non-static dm inside the static method
//without main method programs won't be executed
