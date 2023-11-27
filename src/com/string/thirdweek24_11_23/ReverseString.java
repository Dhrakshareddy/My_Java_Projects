package com.string.thirdweek24_11_23;

public class ReverseString 
{
	//first
	public void reverse1(String s) {
		String s1 = "";
		for(int i=s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		System.out.println(s1);
	}
	//Second 
	public void reverse2(String s) {
		String res="";
		char[]arr=s.toCharArray();
		int i=arr.length-1;
		int j=arr.length-1;
		while(i>=0) {
			while(i>=0&&i!=' ')i--;
				int k=i+1;
				String temp="";
				while(k<=j) {
					temp+=arr[k];
					k++;
				}
				res+=temp;
				if(i>=0)res+="";
				i--;
				j=i;
				
		}
		System.out.println(res);
		
	}
	//Third
	public void reverse3(String s) {
		String res="";
		String[]s1=s.split(" ");
		for(int i=s1.length-1;i>=0;i--) {
			res+=s1[i]+" ";
		}
		System.out.println(res);
	}

	
	public static void main(String[] args) {
		String s="Corenuts Technologies Pvt Ltd";
		ReverseString reverseString =new  ReverseString();
		reverseString.reverse1(s);
		reverseString.reverse2(s);
		reverseString.reverse3(s);
	}

}
