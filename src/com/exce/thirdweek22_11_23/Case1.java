package com.exce.thirdweek22_11_23;

import java.io.IOException;

class Animal{
	public void eat(){
		System.out.println("eating....");
	}
}
public class Case1 extends Animal
{
//	public void eat() throws IOException {
//		System.out.println("animaleating....");
//	}
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
	} 
	
}
