package com.narendra.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstMissingPositive {

	public static void main(String[] args) {
		int index = firstMissingPositive(new int[] {1, 2, 0});
		System.out.println(index);
	}
	
	public static int firstMissingPositive(int[] nums) {
        
        int index = 0;

        while(index < nums.length) {
            if(nums[index] == index +1 || (nums[index]) <= 0 || (nums[index]) > nums.length
            		|| index == nums[index-1]) {
                index ++;
            } else {
                swap(nums, index, nums[index] -1 );
            }
        }
        
        System.out.println(Arrays.toString(nums));
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != i + 1) {
               return i + 1;
            }
        }
        return nums.length + 1;
    }

    private static void swap(int[] nums, int source, int target) {
        int temp = nums[source];
        nums[source] = nums[target];
        nums[target] = temp;
    }
}
