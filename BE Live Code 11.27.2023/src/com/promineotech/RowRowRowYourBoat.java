package com.promineotech;

public class RowRowRowYourBoat {
	
	public static void main(String[] args) {
		
		/*
		 * Write a program that prints out the String
		 * "Row Row Row Your Boat"!
		 *  4 times
		 */
		
		//String[] lyrics = {"Row", "Row","Row", "Your", "Boat"};
		String firstVerse = "Mike: Row Row Row Your Boat";
		String secondVerse = "John: Row Row Row Your Boat";
		
		for(int i = 0; i < 4; i++) {
			
			System.out.println(firstVerse); 
			
			for(int j = 0; (j % 4 == 0 && j < 4); j++) {
				System.out.println(secondVerse);
			}
			
			
		}

		
		
		
	} //end of main method scope
	

} // end of class scope
