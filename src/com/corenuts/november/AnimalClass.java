package com.corenuts.november;
class Dog{
	void walk() {
		System.out.println("dog is walking......");
	}
	void eat() {
		System.out.println("dog is eating..");
	}
	void water() {
		System.out.println("every animals needs water");
	}
}
class Tiger extends Dog{
	void walk() {
		System.out.println("tiger is walking...");
	}
	void eat() {
		System.out.println("tiger is eating non-veg mostly");
	}
	void water() {
		System.out.println("every animals needs water");
	}
}
public class AnimalClass extends Tiger
{
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.water();
		tiger.eat();
		
		
	}

}
