package com.narendra.sorting;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int array[] = new int[] {4, 0, 1, 2};
		missingNumber(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void missingNumber(int[] nums) {
        int index = 0;

        while(index < nums.length) { //If the index for a value is not found we are ignoring it so need to run the loop for all elements
            if(nums[index] == index || nums[index] == nums.length) { //nums[index] == nums.length It is the largest in array. But the array length is one less than so ignoring it.
                index ++;
            } else {
                swap(nums, index, nums[index]);
            }
        }
    }

    private static void swap(int[] nums, int source, int target) {
        int temp = nums[source];
        nums[source] = nums[target];
        nums[target] = temp;
    }
}
