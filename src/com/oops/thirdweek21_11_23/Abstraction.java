package com.oops.thirdweek21_11_23;
abstract class Atm{
	abstract void withdraw();
	abstract void deposite();
	abstract void checkBalance();
}
public class Abstraction extends Atm
{
	@Override
	void withdraw() {
   		System.out.println("you can draw the sufficient amt");
	}

	@Override
	void deposite() {
    		System.out.println("you can deposite more than 1000 rs");
	}

	@Override
	void checkBalance() {
		System.out.println("processing.......");
	}
	public static void main(String[] args) {
		Abstraction abstraction =new Abstraction();
		abstraction.checkBalance();
		abstraction.withdraw();
		abstraction.deposite();
	}

}
