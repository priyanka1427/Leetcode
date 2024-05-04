package com.solution;

public class BoatToSavePeople881 {

	public static void main(String[] args) {
		int[] people = {1 , 2};
		int limit = 3;
		
		System.out.println(boatToSavePeople(people , limit));
	}

	private static int boatToSavePeople(int[] people, int limit) {
		 int boatCount = 0;
	        // Arrays.sort(people);

	        int[] count = new int[limit + 1];
	        for (int p : people) {
	            count[p]++;
	        }

	        int idx = 0;
	        for (int val = 1; val <= limit; val++) {
	            while (count[val]-- > 0) {
	                people[idx++] = val;
	            }
	        }

	        int left = 0;
	        int right = people.length - 1;

	        while(left <= right) {
	            int sum = people[left] + people[right];

	            if(sum <= limit) {
	                boatCount++;
	                left++;
	                right--;
	            }
	            else {
	                boatCount++;
	                right--;
	            }
	        }
	        return boatCount;		
	}

}
