package com.promineotech;

public class Loops {

	public static void main(String[] args) {
		
		// Write a loop that iterates from 100 to 0 and prints even numbers only
		
		// traditional for loop that starts at 100 and ends at 0
		// i == index or position
		for(int i = 0; i > 0; i--) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			//System.out.println("I is: " + i);
		}
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
		
		int sum = 100;
		for(int i = 100; i >= 10; i--) {
			
			System.out.println("value of i " + i);
			sum -= i;
			System.out.println(sum);
		
			
		}
		
		

	}

}