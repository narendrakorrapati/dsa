package com.narendra.sorting;

import java.util.Arrays;

public class ClassMergeSort {

	public static void main(String[] args) {
		int[] sortedArray = mergeSort(new int[] {7, 6, 5, 4, 3, 2, 1, -10, 0});
		System.out.println(Arrays.toString(sortedArray));
	}

	private static int[] mergeSort(int[] array) {
		
		if(array.length == 1) {
			return array;
		}
		
		int start = 0;
		int end = array.length - 1;
		int mid = start + (end - start) / 2;
		
		int[] firstSortedHalf = mergeSort(copyArray(array, 0, mid+1)); //Last index will not be included in new array
		int[] secondSortedHalf = mergeSort(copyArray(array, mid + 1, array.length));
		
		int[] result = new int[array.length];
		
		int i = 0, j=0; 
		int mixIndex = 0;
		
		while(i<firstSortedHalf.length && j<secondSortedHalf.length) {
			if(firstSortedHalf[i] < secondSortedHalf[j]) {
				result[mixIndex] = firstSortedHalf[i];
				i ++;
			} else {
				result[mixIndex] = secondSortedHalf[j];
				j++;
			}
			mixIndex++;
		}
		
		if(i<firstSortedHalf.length) {
			for(int k=i; k<firstSortedHalf.length; k++) {
				result[mixIndex] = firstSortedHalf[k];
				mixIndex++;
			}
		}
		
		if(j<secondSortedHalf.length) {
			for(int k=j; k<secondSortedHalf.length; k++) {
				result[mixIndex] = secondSortedHalf[k];
				mixIndex++;
			}
		}
		return result;
	}

	private static int[] copyArray(int[] array, int i, int j) {
		
		int[] copyArray = new int[j - i];
		int index = 0;
		for(int k=i; k<j; k++) {
			copyArray[index] = array[k];
			index ++;
		}
		return copyArray;
	}
}
