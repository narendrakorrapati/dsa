package com.narendra.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;

public class InterSectionOfTwoArrays {

	public static void main(String[] args) {
		int[] result = intersection(new int[] {4,9,5}, new int[] {9,4,9,8,4});
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<nums1.length; i++) {
            if(!arrayList.contains(nums1[i]) && binarySearch(nums2, nums1[i]) != -1) {
                arrayList.add(nums1[i]);
            }
        }

        int[] result = new int[arrayList.size()];

        for(int i=0; i<arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }

        return result;
    }

    private static int binarySearch(int[] array, int target) {

        int start = 0; 
        int end = array.length -1;
        int mid = 0;

        while(start <= end) {
            mid = start + (end - start) /2;

            if(target == array[mid]) {
                return array[mid];
            }
            if(target < array[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
