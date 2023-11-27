package com.oops.thirdweek21_11_23;

public class AnimalClass extends DogClass
{
	public static void main(String[] args) {
		//AnimalClass animalClass = new DogClass();
		DogClass animalClass=new AnimalClass();
		System.out.println(animalClass.name);
		System.out.println(animalClass.gender);
		System.out.println(animalClass.age);
		//System.out.println(animalClass.color);
		animalClass.eat();
		animalClass.sleep();
		animalClass.water();
	}

}
