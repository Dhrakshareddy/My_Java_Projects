package com.nonaccess.secondweek15_11_23;

import com.nonaccess1.seconweeks15_11_23.NonAccesModifier;

public class NonAccessModifierTest extends NonAccesModifier
{
	@Override
	public void method4() {
		System.out.println("method4 is executing");
	}
	@Override
	public void method5() {
		System.out.println("method5 is executing");
	}

	@Override
	public void method6() {
		System.out.println("method6 is executing");
}
   public static void main(String[] args) {
	  NonAccesModifier  nonAccessModifierTest = new NonAccessModifierTest();
	  nonAccessModifierTest.method3();
	  System.out.println(nonAccessModifierTest.value);
	  nonAccessModifierTest.method4();
	  nonAccessModifierTest.method5();
	  nonAccessModifierTest.method6();
	  
}
}
