package com.solution;

import java.util.HashSet;

public class LargestPositiveNumber2441 {
	
	public static void main(String[] args) {
        int[] nums = {-1,10,6,7,-7,1};
        int result = largestNegativePositivePair(nums);
        System.out.println("Largest positive integer k: " + result); // Output: 3
    }

	private static int largestNegativePositivePair(int[] nums) {
		HashSet<Integer> hs = new HashSet<>();
		int result = -1;
		for(int num : nums) {
			hs.add(num);
			int negation = num * (-1);
			if(hs.contains(negation)) {
			  result = Math.max(result, Math.abs(num));
			}
		}
		return result;
	}

}
/*	
 * Question :
 * 
 * Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.

Return the positive integer k. If there is no such integer, return -1.

 * */
