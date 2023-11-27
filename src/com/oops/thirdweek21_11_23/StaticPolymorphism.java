package com.oops.thirdweek21_11_23;
class Calculator{
	public void calculate(int value,int value1 ) {
		int result= value*value1;
		System.out.println(result);
		System.out.println("********");
	}
	public void calculate(double value,double value1 ) {
		double result= value*value1;
		System.out.println(result);
		System.out.println("********");
	}
	public void calculate(String name,String name2 ) {
		String res=name+" "+name2;
		System.out.println(res);
		System.out.println("********");
	}
	
}
public class StaticPolymorphism extends Calculator
{
	 public void calculate(float value,float value1 ) {
	 		double result= value*value1;
			System.out.println(result);
			System.out.println("********");
		}
	public static void main(String[] args) {
		 Calculator calculator =new Calculator();
	     calculator.calculate(3, 10);
	     calculator.calculate(123, 7890);
	     calculator.calculate("pandu", "reddy");
	     System.out.println("******");
	     StaticPolymorphism calculator1 =new StaticPolymorphism();
	     calculator1.calculate(344, 100);
	     calculator1.calculate(3, 10);
	     calculator1.calculate(5.6, 3.9);
	     calculator.calculate("reddy", "pandu");
	     System.out.println("******");
	     
	     

	     
	   
	     
	}
	

}
