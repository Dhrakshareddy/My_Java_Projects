package com.constru.thirdweek23_11_23;
class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

interface Herbivore {
    default void makeSound() {
        System.out.println("Eating plants");
    }
}
interface Carnivore {
    default void makeSound() {
        System.out.println("Hunting other animals");
    }
}

public class DiamondProblem implements Herbivore, Carnivore {
    public static void main(String[] args) {
        DiamondProblem diamond = new DiamondProblem();
        diamond.makeSound();
    }

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		Carnivore.super.makeSound();
	}



}
