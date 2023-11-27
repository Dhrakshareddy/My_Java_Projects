package com.sort.seconweek14_11_23;

public class Pallindrome 
{
	public static void pallindromeOrNot() {
		int number=12121;
		int result=0;
		while(number>0) {
			int remainder=number%10;
			result=result*10+remainder;
			number/=10;
		}
		System.out.println(result);
		if(number==result) {
			System.out.println("given number is pallindrome");
		}else System.out.println("given number is not a pallindrome");
	}
	public static void main(String[] args) {
		Pallindrome.pallindromeOrNot();
	}

}
