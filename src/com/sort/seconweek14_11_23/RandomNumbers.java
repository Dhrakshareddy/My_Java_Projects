package com.sort.seconweek14_11_23;

import java.util.Random;

public class RandomNumbers
{
	public static void randomNum(){
		Random rand = new Random();
        int[] randNumber = new int[25];

        for (int i = 0; i <25; i++) {
            randNumber[i] = rand.nextInt(100);
        }

        for (int i = 0; i < 24; i++) {
            if (randNumber[i] < randNumber[i + 1]) {
                System.out.println("Number " + randNumber[i] + " is smaller than " + randNumber[i + 1]);
            } else if (randNumber[i] > randNumber[i + 1]) {
                System.out.println("Number " + randNumber[i] + " is greater than " + randNumber[i + 1]);
            } else {
                System.out.println("Number " + randNumber[i] + " is equal to " + randNumber[i + 1]);
            }

    }}
	public static void main(String[] args) {
		RandomNumbers.randomNum();
	}
       


}
