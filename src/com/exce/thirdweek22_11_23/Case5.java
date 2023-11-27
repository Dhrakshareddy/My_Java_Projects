package com.exce.thirdweek22_11_23;

import java.io.IOException;

class company{
	public void empid()throws Exception {
		System.out.println("emp is required for every employee");
	}
}
public class Case5 extends company {
	public void empid() {
		System.out.println("salary will be credited with their bank a/cs");
	}
	public static void main(String[] args) {
		Case5 case5 = new Case5();
		case5.empid();
	}
}
