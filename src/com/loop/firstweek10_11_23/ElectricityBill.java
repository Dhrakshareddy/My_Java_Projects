package com.loop.firstweek10_11_23;

import java.util.Scanner;

public class ElectricityBill 
{
	 public static void main(String[] args) 
	 {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of units consumed: ");
	        int unitsConsumed = scanner.nextInt();
	        // Calculating the electricity bill and usage category
	        double billAmount;
	        String usageCategory;

	        if (unitsConsumed <= 50) {
	            billAmount = 250;
	            usageCategory = "Minimum Usage";
	        } else if (unitsConsumed <= 100) {
	            billAmount = 250 + (unitsConsumed - 50) * 5;
	            usageCategory="Moderate Usage";
	           }else{
	            	billAmount=250+(unitsConsumed-80)*8;
	            	usageCategory="High Usage";
	            }
	        
	 }
	 
}
