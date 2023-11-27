package com.cnts.variables03_11_23;

public class Variables 
{

	static int ageValue=23;
	static String stringName="coreNuts";
	int age=22;
	String name="pandu";
	public static int calculate(int value1,int value2) {
		int sum=value1*value2;
		return sum;
	}
	public void calculate1(int value1,int value2) {
		int sum=value1*value2;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int localVariable1=30;
		
		System.out.println(localVariable1);
	Variables helloworld = new Variables();
	System.out.println(helloworld.age);
	System.out.println(helloworld.name);
	System.out.println(Variables.ageValue);
	System.out.println(Variables.stringName);
    System.out.println(Variables.calculate(44,55));//Static variables &methods we can access through classNames
    int localVariable;
    //System.out.println(localVariable);without initialization localVariables can't access 
    localVariable=30;
    System.out.println(localVariable);
    helloworld.calculate1(34,2);//Non-static variables & methods we can access through the object Creation
	
	}

}
