package com.promineotech;

import java.util.Arrays;

public class WeekThree {
	
	public static void main(String[] args) {
		
		// Arrays are immutable 
		
		// Create an array of fruit String with length of 5
		
//		String[] fruit = new String[5]; 
//		
//		// Assign the first fruit in index 0
//		fruit[0] = "Apple";
//		
//		// Second index = [1]
//		fruit[1] = "Banana";
//		fruit[2] = "Pear"; 
//		
//		// an out of bounds exception to be thrown
//		fruit[3] = "Kiwi";
//		fruit[4] = "Pineapple";
		
		String[] fruit = {"Apple", "Banana", "Pear", "Kiwi", "Pineapple"};
		
		// Print out fruit array
		System.out.println(Arrays.toString(fruit));
		
		System.out.println("First element in fruit array: " + fruit[0]);
		
		// How to find the last element of an array
		// fruit[fruit.length() - 1];
		
		System.out.println(fruit.length);
		System.out.println("Last element in fruit array: " + fruit[fruit.length - 1]);
		
		// Fruit loops - create a loop that iterates over array and 
		//prints first character of each element in array
		
//		for(int i = 0; i < fruit.length; i++) {
//			System.out.println(fruit[i]);
//			//System.out.println(fruit[i].charAt(0));
//		}
//		
//		for(String fruitName : fruit) {
//			System.out.println(fruitName);
//		}
//		
//		int j = 0;
//		while(j < fruit.length) {
//			System.out.println("While loop: " + Arrays.toString(fruit));
//			System.out.println(j);
//			j++;
//		}
		
		System.out.println("Outside of for loop!");
		
		// test method with return type String
		System.out.println(printArrayElements(fruit));
		
		// test method with void return type
		printEachLetterInArray(fruit);
		
		
	} // end of main method scope
	
	public static String printArrayElements(String[] array) {
		
		String names = "";
		
		for(String name : array) {
			System.out.println(name);
			names += name + " ";
			
		}
		
		return names;
	} // end of printArrayElements method
	
	public static void printEachLetterInArray(String[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "\n");
			System.out.println(array[i].charAt(0));
		}
		
	}

} // end of class scope
