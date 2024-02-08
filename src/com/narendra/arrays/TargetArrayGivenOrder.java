package com.narendra.arrays;

import java.util.Arrays;

public class TargetArrayGivenOrder {

	public static void main(String[] args) {
		
		int target[] = createTargetArray(new int[] {0,1,2,3,4}, new int[] {0,1,2,2,1});
		System.out.println(Arrays.toString(target));
	}
	
	public static int[] createTargetArray(int[] nums, int[] index) {
        
        int[] target = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            
            int valueToInsert = nums[i];
            int indexToInsert = index[i];
            
            if(indexToInsert < i) {
            	insert(target, indexToInsert, valueToInsert);
            } else {
            	target[indexToInsert] = valueToInsert;
            }
            
        }
        return target;
    }

    private static void insert(int[] target, int indexToInsert, int valueToInsert) {

       for(int i=target.length-1; i>=indexToInsert; i--) {
            
            if(i == indexToInsert) {
                target[indexToInsert] = valueToInsert;
            } else {
                swap(target, i, i-1);
            }
        }
    }

    private static void swap(int[] target, int source, int dest) {
        int temp = target[source];
        target[source] = target[dest];
        target[dest] = temp;
    }
}
