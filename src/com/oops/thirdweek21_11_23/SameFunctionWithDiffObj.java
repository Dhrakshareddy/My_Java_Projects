package com.oops.thirdweek21_11_23;
class Calculator1 {
    int add(int a, int b) {
        return a + b;
    }
}
public class SameFunctionWithDiffObj 
{
	public static void main(String[] args) {
        Calculator1 calculator = new Calculator1();
        Calculator1 calculator2 = new Calculator1();

        int result1 = executeAdd(calculator, 5, 10);
        int result2 = executeAdd(calculator2, 8, 15);
        
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }

    
    private static int executeAdd(Calculator1 calculator, int operand1, int operand2) {
        return calculator.add(operand1, operand2);
    }
	}
