package com.string.thirdweek24_11_23;

public class PossibleSubStrings 
{
	public static void main(String[] args) {
		String s="corenutsTechonology";
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length()-1;j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

}
