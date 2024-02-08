package com.narendra.recursion;

import java.util.HashSet;

public class StepsToZero {

	public static void main(String[] args) {
		
		System.out.println(containsDuplicate(new int[] {1,2,3,1}));
	}
	
	public static boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0; i< nums.length; i++) {
            if(!set.add(nums[i])) {
                return false;
            }
        }
        return true;
    }
}
