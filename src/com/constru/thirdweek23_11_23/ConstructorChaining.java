package com.constru.thirdweek23_11_23;
class Animal1 {
    String name;
    public Animal1(String name) {
        this.name = name;
        System.out.println("Animal constructor called. Name: " + this.name);
    }
}

class Dog extends Animal1 {
    int age;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
        System.out.println("Dog constructor called. Name: " + this.name + ", Age: " + this.age);
    }

    public Dog(String name) {
        this(name, 0); 
        System.out.println("Another Dog constructor called.");
    }
}
public class ConstructorChaining 
{ 
	public static void main(String[] args) {
		 Dog myDog = new Dog("Buddy", 3);
	        Dog anotherDog = new Dog("Max");
	}

}
