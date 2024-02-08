package com.narendra.sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int array[] = new int[] {1, 2, 3, 4, 5};
		insertionSort(array);
		System.out.println(Arrays.toString(array));
	}

	private static void insertionSort(int[] array) {
		
		for(int i=0; i<array.length-1; i++) {
			for (int j=i+1; j>0; j--) {
				if(array[j] < array[j-1]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				} else {
					break;
				}
			}
		}
		
	}
}
