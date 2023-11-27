package com.inter.secondweek16_11_23;
interface Father{
	public abstract void color();
	//private  void behaviour();
	//protected void hair();
	void structure();
}
public class Son implements Father{
	@Override
	public void color() {
		System.out.println("red");
	}
//	@Override
//	public void behaviour() {
//		System.out.println("same like his father");
//	}
//	@Override
//	public void hair() {
//		System.out.println("curly hair");
//	}
	@Override
	public void structure() {
		System.out.println("handsome");
	}
	public static void main(String[] args) {
		Son son = new Son();
		//son.behaviour();
		son.color();
	//	son.hair();
		son.structure();
	}
	

}
