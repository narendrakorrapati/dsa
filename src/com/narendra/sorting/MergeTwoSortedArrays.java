package com.narendra.sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,0,0,0}; 
		int m = 3;
		int[] nums2 = {1, 2, 3};
		int n = 3;
		
		merge(nums1, m, nums2, n);
		
		System.out.println(Arrays.toString(nums1));
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		for (int i = 0; i < nums2.length; i++) {
			nums1[m + i] = nums2[i];
		}
		
		for(int i=m-1; i<nums1.length-1; i++) {
			for(int j = i+1; j>0; j--) {
				if(nums1[j] < nums1[j-1]) {
					int temp = nums1[j];
					nums1[j] = nums1[j-1];
					nums1[j-1] = temp;
				} else {
					break;
				}
			}
		}
	}
}
