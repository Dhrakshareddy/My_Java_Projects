package com.opera.firstweek09_11_23;

public class UnaryOperator 
{
   public int preIncrement(int value) {
	   System.out.println(++value);
		return value;
	}
   public int postIncrement(int value) {
	   value++;
	   System.out.println(value);
		return value;
	}
   public int preDecrement(int value) {
	   System.out.println(--value);
		return value;
	}
   public int postDecrement(int value) {
	   value--;
	   System.out.println(value);
		return value;
	

}
}
