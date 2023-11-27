package com.inter.secondweek16_11_23;
interface Animal{
	public void water();
	public void walk();
}
interface Dog extends Animal{
	public void eat();
	public void sleep();
}
public class ParentAndChild implements Dog,Animal
{
	@Override
	public void water() {
		System.out.println("every animals needs water");
	}
	@Override
	public void walk() {
		System.out.println(" walking...");
	}
	@Override
	public void eat() {
		System.out.println("eating....");
	}
	@Override
	public void sleep() {
	System.out.println("sleeping...");	
	}
	public static void main(String[] args) {
		ParentAndChild parentAndChild = new ParentAndChild();
		parentAndChild.eat();
		parentAndChild.water();
		parentAndChild.walk();
		parentAndChild.sleep();
	}
  // we are implementing more than one interface in a class
	
}
