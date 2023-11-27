package com.loop.firstweek10_11_23;

public class PrimeNumber 
{
	  public static void main(String[] args) {
	        System.out.println("Non-prime numbers from 1 to 100 using for loop:");
	        printNonPrimeFor();

	        System.out.println("\nNon-prime numbers from 1 to 100 using while loop:");
	        printNonPrimeWhile();

	        System.out.println("\nNon-prime numbers from 1 to 100 using do-while loop:");
	        printNonPrimeDoWhile();
	    }

	    // Using for loop
	    private static void printNonPrimeFor() {
	        for (int value1 = 1; value1 <= 100; value1++) {
	            if (isPrime(value1)) {
	                System.out.print(value1 + " ");
	            }
	        }
	    }

	    // Using while loop
	    private static void printNonPrimeWhile() {
	        int value = 1;
	        while (value <= 100) {
	            if (isPrime(value)) {
	                System.out.print(value + " ");
	            }
	            value++;
	        }
	    }

	    // Using do-while loop
	    private static void printNonPrimeDoWhile() {
	        int value2 = 1;
	        do {
	            if (isPrime(value2)) {
	                System.out.print(value2 + " ");
	            }
	            value2++;
	        } while (value2<= 100);
	    }

	    // Function to check if a number is prime
	    private static boolean isPrime(int start) {
	        if (start==1) {
	            return true;
	        }
	        for (int num = 2; num <= Math.sqrt(start); num++) {
	            if (start % num== 0) {
	                return true;
	            }
	        }
	        return false;
	    }
}
