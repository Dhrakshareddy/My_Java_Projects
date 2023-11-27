package com.constru.thirdweek23_11_23;

public class ConstructorOverloading 
{

	int a;
	int b;
	int c;

	public ConstructorOverloading() {
		super();
		System.out.println("ZERO ARGUMENT CONSTRUCTOR");
		System.out.println();
	}

	public ConstructorOverloading(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	
		System.out.println("PARAMETERISED CONSTRUCTOR ");
		System.out.println(a+" "+b+" "+c);
	}

	public ConstructorOverloading(int a, int b) {
		super();
		this.a = a;
		this.b = b;

		System.out.println("TWO PARAMETERISED CONSTRUCTOR");
		System.out.println(a+" "+b);
	}

	public ConstructorOverloading(int a) {
		super();
		this.a = a;
		System.out.println("SINGLE PARAMETERISED CONSTRUCTOR");
		System.out.println(a);
	}
	public static void main(String[] args) {
		ConstructorOverloading co = new ConstructorOverloading();
		//System.out.println(co);
		System.out.println("=======================================");
		ConstructorOverloading co1 = new ConstructorOverloading(10);
		//System.out.println(co1);
		System.out.println("=======================================");
		ConstructorOverloading co2 = new ConstructorOverloading(10,20);
		//System.out.println(co2);
		System.out.println("=======================================");
		ConstructorOverloading co3 = new ConstructorOverloading(10,20,30);
		//System.out.println(co3);
		System.out.println("=======================================");

	}

}
