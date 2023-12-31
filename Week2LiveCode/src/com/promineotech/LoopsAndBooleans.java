package com.promineotech;

public class LoopsAndBooleans {

	public static void main(String[] args) {

		// Create a program that flips a coin
		// Hint: Do not need a loop. - Coin only has 2 sides so we would use a boolean

		// A coin consists of 2 sides: heads and tails

		// How to mathematically randomize a number

//		System.out.println(Math.random() + " 1st time random");
//		System.out.println(Math.random() + " 2nd time random");
		double coin = Math.floor(Math.random() * 100);	
		System.out.println(coin);
		
//		coin = Math.round(coin);
//		
//		System.out.println(coin);
		// System.out.println(coin);

		String coinSide;
		
		System.out.println("Our coin value: " + coin);
		
		if (coin % 2 == 0) {
			coinSide = "heads";
			System.out.println(coinSide);
		} else {
			coinSide = "tails";
			System.out.println(coinSide);
		}

		System.out.println("Outside of if/else");
		// Switch case
		switch (coinSide) {
		case ("heads"):
			System.out.println(coinSide);
			break;
		case ("tails"):
			System.out.println(coinSide);
			break;
		default:
			System.out.println("It's null. Try again!");
		}

		// create a for loop that uses += and/or -= buckets and coins
		
		// Power, Base, and result - use a for loop to raise base
		// to the power of power. Result should be used to capture the value
		// of each iteration (run from 1 to power) 
		
		int power = 4; 
		int base = 2;
		int result = 1;
		
		for(int i = 1; i < power; i++) {
			result *= base;
			System.out.println(result);
		}
		
		System.out.println("Outside of for loop. Value of result " + result);
		
		
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Value of i: " + i);
			sum += i;
			System.out.println();
			System.out.println("Value of sum: " + sum);
		}
		
		// Create a loop that counts down from 10 to 1 then prints "Blast Off!"
		
		for(int i = 10; i <= 10 && i >= 1; i--) {
			//if(i <= 10 && i >= 1) {
				System.out.println(i);
			//} else {
//				System.out.println("Your number is not between 10 and 1");
			//}
			
		}
		System.out.println("Blast Off!");
		
		

	} // end of main method
	
}
