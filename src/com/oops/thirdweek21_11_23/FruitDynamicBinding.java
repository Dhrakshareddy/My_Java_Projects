package com.oops.thirdweek21_11_23;
class Apple{
	public void taste() {
		System.out.println("apple..");
	}
	public void color() {
		System.out.println("it may be red or white");
	}
}
public class FruitDynamicBinding extends Apple
{
	@Override
	public void taste() {
		System.out.println("apple was to cost");
	}
	@Override
	public void color() {
		System.out.println("i don't like apples");
	}

	public static void main(String[] args) {
		FruitDynamicBinding fruitDynamicBinding = new FruitDynamicBinding();
		fruitDynamicBinding.color();
		fruitDynamicBinding.taste();
	}

}
