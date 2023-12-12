package com.promineotech;

import java.util.Arrays;

public class UserWord {

	public static void main(String[] args) {
		
		/*
		 * Create a program that prints a word 
		 * the number of times it's length
		 * 
		 * How do I print a word the # of characters it is long?
		 */
		
		
		String word = "Hello";
		
		System.out.println(word.length()); // expect print 5
		
		// index count starts at 0 (position of each character in word)
		System.out.println(word.charAt(0));
		
		// Print out the last character in word
		System.out.println(word.charAt(word.length() - 1));
		
		/* Create a loop that iterates through the String characters
		and prints the word appended to itself N number of times */
		
		String appendWord = "";
		
		for(int i = 0; i < word.length(); i++) {
			appendWord += word;
			System.out.println(appendWord);
		}
		
		// Test the method
		System.out.println(appendWordNTimes("Bob ", 12));
		
		// Test void method 
		
		addWordToSelfNTimes("Moon ", 4);
		
		
		// Create an array of names
		
		String[] names = {"Patrick", "Dawson", "Jessica", "K"};
		
		System.out.println("Array below this line! \n");
		System.out.println(Arrays.toString(names));
		
	} // end of main method
	
	/* Create a method that prints the value of word appended to 
	 * itself N number of times
	 */
	
	public static void addWordToSelfNTimes(String word, int numTimes) {
		
		String result2 = "";
		
		for(int i = 0; i <= numTimes; i++) {
			System.out.println(i);
			result2 += word;
			System.out.println(result2);
		}
		
		//System.out.println(result2);
		
	}
	
	/* Create a method that iterates through the String characters
	and prints the word appended to itself N number of times */
	
	public static String appendWordNTimes(String word, int numTimes) {
		
		String result = "";
		
		for(int i = 0; i <= numTimes; i++) {
			result += word;
		}
		
		return result;
	}

}
