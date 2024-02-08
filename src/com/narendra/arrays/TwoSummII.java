package com.narendra.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSummII {

	public static void main(String[] args) {
		int[] result = twoSum(new int[] {2,3,4}, 6);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] twoSum(int[] nums, int target) {
        
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int i=0; i<nums.length; i++) {

            List<List<Integer>> innerList = new ArrayList<>();

            for(List<Integer> element : outer) {

                if(element.size() < 2) {

                    if(element.size() == 0) {
                        List<Integer> newElement = new ArrayList<>(element);
                        newElement.add(i);
                        innerList.add(newElement);
                    } else {

                        if((nums[element.get(0)] + nums[i]) == target) { 
                            return new int[]{element.get(0) + 1, i + 1};
                        }
                        element.add(i);
                    }
                }
                
            }

            outer.addAll(innerList);
        }
        return new int[]{};
    }
}
