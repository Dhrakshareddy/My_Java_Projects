package com.oops.thirdweek21_11_23;
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Mammal extends Animal {
    Mammal(String name) {
        super(name);
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Mammal {
    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " is barking");
    }
}
public class MultipleInheritence 
{
	public static void main(String[] args) {
		 Dog myDog = new Dog("Buddy");
	        myDog.eat();   
	        myDog.sleep(); 
	        myDog.bark(); 
	    }
	}
