package com.narendra.recursion;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int array[] = new int[] {4, 3, 1, 2, 7};
		sort(array, 0);
		System.out.println(Arrays.toString(array));
	}

	private static void sort(int[] array, int index) {
		
		if(index == array.length) {
			return;
		}
		
		int minIndex = findMinIndex(array, index);
		swap(array, index, minIndex);
		sort(array, index + 1);
	}

	private static int findMinIndex(int[] array, int index) {
		int minIndex = array.length -1;
		for (int i = index; i < array.length; i++) {
			
			if(array[minIndex] > array[i]) {
				minIndex = i;
			}
		}
		return minIndex;
	}

	private static void swap(int[] array, int col, int i) {
		
		int temp = array[col];
		array[col] = array[i];
		array[i] = temp;
		
	}
}
