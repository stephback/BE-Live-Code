package com.promineotech;

import java.util.Arrays;

public class Loops {

	public static void main(String[] args) {
		
		// Write a loop that iterates from 100 to 0 and prints even numbers only
		
		// traditional for loop that starts at 100 and ends at 0
		// i == index or position
//		for(int i = 0; i > 0; i--) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//			//System.out.println("I is: " + i);
//		}
		 //System.out.println("outside of for loop!");
		 
		 //int i = 100;
		 
//		 do {
//			 
//			 System.out.println("Hello!" + i);
//			 i++;
//			 
//		 } while (i <= 10);
//		 
//	//System.out.println(i < 10);
//		 
//		while(i >= 10) {
//			System.out.println("Counting down from 100 to 10! " + i);
//			i--;
//		}
		 
//		for(int i = 0; i <= 100; i++) {
//			while(i % 2 == 0) {
//				System.out.println("This is an even number " + i);
//				i++;
//			}
//			int i2 = 0;
//		int sumOfLetters = 0;
//		String name = "Bob";
//		while(i2 < name.length()) {
//			System.out.print(name.charAt(i2));
//			sumOfLetters += i2;
//			i2++;
//		}
		
//		int sum = 100;
//		for(int i = 100; i >= 10; i--) {
//			
//			System.out.println("value of i " + i);
//			sum -= i;
//			System.out.println(sum);
//		
//			
//		}
		
		
		// For loops! There are 2 kinds: Traditional && Enhanced
		
//		/*
//		 * Create a loop that iterates through an array of int
//		 */
//		
		//int[] numbers = {1, 2, 3, 4, 5};
//		
//		System.out.println("Length of int array: " + numbers.length);
//		
//		System.out.println(numbers.length - 1);
//		
//		// Traditional:
//		
//		for(int i = 0; i <= numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//		
		
//		for(int i = 0; i <= 10; i++) {
//			System.out.println(i);
//		}
		
//		String word = "Tech";
//		
//		for(int number : numbers) {
//			System.out.println(number);
//		}
	
		reverseArray(3, 4, 5, 6, 7);
		
	} // end of main method
	
	static void reverseArray(int a, int b, int c, int d, int e) {
		int[] arr = {a, b, c, d, e};
		
		
//		for(int i = 0; i < arr.length / 2; i++) {
//			int reverse = arr[i];
//			arr[i] = arr[arr.length - i - 1];
//			arr[arr.length - i - 1] = reverse;
//		}
		//return arr;
		
		// Instructor solution
		int j = arr.length;
		
		System.out.println("Length of arr: " + arr.length);
		
		int [] reverseArr = new int[j];
		
		for(int i = 0; i < arr.length; i++) {
			reverseArr[j - 1] = arr[i];
			j--;
			System.out.println(Arrays.toString(reverseArr));
		}
		
		for(int x : arr) {
			System.out.println(x);
		}
		
		for(int y : reverseArr) {
			System.out.println(y);
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(reverseArr));
		
		
		
		
	}

}
