
package com.cnts.variables03_11_23;

import java.io.FileNotFoundException;
import java.io.IOException;
class B
{
	String person="reddy";
	public void m1() {
		System.out.println("method executing");
	}
	public B() {
		
		System.out.println("no arg constructor of b");
	}
	public B(String name) {
		System.out.println("one arg constructor of b");
	}
	public B(String name,int age) {
		System.out.println("two arg constructor of b");
	}
}
public class A extends B
{
	public A(){
		System.out.println("no agr constructor");
	}
	public A(String name){
		super();
		System.out.println("one agr constructor");
	}
	public A(String name,int age){
		System.out.println(super.person);
		System.out.println("two agr constructor");
	}
	public void m2() {
		System.out.println("m2 method executing");
	}
	
	public static void main(String[] args) {
	 B a=new A("pandu",5);
	}

}
