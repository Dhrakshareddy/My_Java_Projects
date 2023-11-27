package com.arrays.firstweek08_11_23;
import com.corenuts.bean.*;
public class StringArray
{
	public static void main(String[] args) {
		String[]values=new String[5];
		values[0]="benglore";
		values[1]="hyderabad";
		values[2]="chennai";
		values[3]="mumbai";
		values[4]="delhi";
		//System.out.println(values[4]);
		//System.out.println(values);
		//String[]value1=new String[4];
		//System.out.println(value1.length); 
	Person person =new Person();
	   System.out.println(person.getAge());
	   System.out.println(person.getName());
	   person.setName("corenuts");
	   System.out.println(person.getName());
	   person.setAge(23);
	   System.out.println(person.getAge());
	    person.setGender("female");
	   System.out.println(person.getName());
	   System.out.println(person.toString());
	  Person person2 =new Person();
	   System.out.println( person2.equals(person));
	   System.out.println(person2.toString());
       
	}

}
