package com.string.thirdweek24_11_23;

public class CountRepeatedChar 
{
	public void repeatedChar(String s) {
		int count=0;
		for(int i=0;i<s.length()-1;i++) {
			char c=s.charAt(i);
			for(int j=i+1;j<s.length()-1;i++) {
				if(i==j)count++;	
			}
		}
		System.out.println(count);
	}
   public static void main(String[] args) {
	   CountRepeatedChar countRepeatedChar = new CountRepeatedChar();
	   countRepeatedChar.repeatedChar("dhraksha");
}
}
