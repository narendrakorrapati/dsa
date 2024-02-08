package com.narendra.arrays;

public class Shuffle {

	public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7};
		shuffle(nums, 3);
	}
	
	public static int[] shuffle(int[] nums, int n) {
        
        int[] result = new int[nums.length];
        int i = 0;
        int j = n;
        int index = 0;

        while(i<n && j<n) {
            result[index] = nums[i];
            result[index+1] = nums[j];
            index = index + 2;
            i++;
            j++;
        }
        return result;
    }
}
