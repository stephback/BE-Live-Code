package com.promineotech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodingBat {

	public static void main(String[] args) {

		/*
		 * Return an array that contains exactly the same numbers as the given array,
		 * but rearranged so that every 3 is immediately followed by a 4. Do not move
		 * the 3's, but every other number may move. The array contains the same number
		 * of 3's and 4's, every 3 has a number after it that is not a 3, and a 3
		 * appears in the array before any 4.
		 */

		int[] nums = {3, 1, 1, 3, 4, 4};

		fix34(nums);
		
	}
// # of constraints: 2 conditionals 
	// Does the #  = 3?
	// Is it followed by a 4?
// What are our actionables?	
	// if nums[i] == 3 it needs to be followed by a 4
	
	public static int[] fix34(int[] nums) {
		// create new data structure to hold the location 
		// of the int we are swapping with a 4 
		
		Map<Integer, Integer> newMap = new HashMap<>();
		List<Integer> secondMap = new ArrayList<>();
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				if(nums[i + 1] != 4) {
					newMap.put(i + 1, nums[i + 1]);
				}
				
			}
			if(nums[i] == 4) {
				secondMap.add(i);
			}
		
		}
		if(!newMap.isEmpty()){
			newMap.forEach((key, value) -> nums[key] = 4);
			
			
		//newMap.forEach((key, value) -> nums[key] = 4);
		
		List<Integer> newList = new ArrayList<Integer>(newMap.values());
		System.out.println(newList);
		
		for(int j : secondMap) {
			//newList.get(0);
			 nums[j] = newList.get(0);
			 newList.remove(0);
			 System.out.println(j);
		}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}

}
