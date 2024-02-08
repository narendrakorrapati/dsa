package com.narendra.sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

	public static void main(String[] args) {
		List<Integer> result = findDuplicates(new int[] {4,3,2,7,8,2,3,1});
		System.out.println(result);
	}
	
	public static List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> result = new ArrayList<Integer>();

        int index = 0;

        while(index < nums.length) {

            int correctValueAtIndex = index + 1;
            int actualValueAtIndex = nums[index];
            int indexToSwap = actualValueAtIndex - 1;

            if(actualValueAtIndex != correctValueAtIndex) {

                if(actualValueAtIndex == nums[indexToSwap]) {
                    index ++;
                } else {
                    swap(nums, index, indexToSwap);
                }
            } else {
                 index ++;
            }
        }

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != i+1) {
                result.add(nums[i]);
            }
        }

        return result;
    }

    private static void swap(int[] nums, int source, int target) {
        int temp = nums[source];
        nums[source] = nums[target];
        nums[target] = temp;
    }
}
