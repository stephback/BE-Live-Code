package com.promineotech;

import java.util.Arrays;

public class CodingBatProblems {

	public static void main(String[] args) {

		/*
		 * We'll say that a 1 immediately followed by a 3 in an array 
		 * is an "unlucky" 1. 
		 * Return true if the given array contains 
		 * an unlucky 1 in the first 2 or last 2 positions in the array.
		 */
	/*	
		int[] array = {2, 1, 4, 1, 1, 3};
		
		// Find the first 2 positions w/in array
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		// Find the last 2 positions w/in array
		System.out.println(array[array.length - 1]);
		System.out.println(array[array.length - 2]);
		
		// Print array to  console
		System.out.println(Arrays.toString(array));
		
		System.out.println("Length of array: " + array.length);
		
		System.out.println(array[array.length - 1]);
		
		System.out.println(array[array.length - 1]);

		
		if(((array[0] == 1) && (array[1] == 3)) || 
				((array[1] == 1) && (array[2] == 3)) || 
				(array[array.length - 1] == 3) && (array[array.length - 2] == 1)){
			
				System.out.println("True");
			
		} else {
			System.out.println("False");
		}
		
	*/	
		 /*
		 * Fizz Buzz 
		 * Check to see if the value of num is evenly divisible by:
		 *  3 then print Fizz
		 *  5 then print Buzz
		 *  3 and 5 print Fizz Buzz
		 */
		
	for(int i = 1; i <= 100; i++) {
		
		if((i % 3 == 0) && (i % 5 == 0)) {
			System.out.println("Fizz Buzz " + i);
		} else if(i % 3 == 0) {
			System.out.println("Fizz " + i);
		} else if(i % 5 == 0) {
			System.out.println("Buzz " + i);
		} else {
			System.out.println("No Fizz Buzz for you! " + i);
		}
		
	}	
		
	}

}
