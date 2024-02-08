package com.narendra.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int array[] = new int[] {5, 4, 3, 2, 1 };
		selectionSortMax(array);
		System.out.println(Arrays.toString(array));
		
		int array2[] = new int[] {5, 4, 3, 2, 1 };
		selectionSortMin(array2);
		System.out.println(Arrays.toString(array2));
		
	}
	
	private static void selectionSortMin(int[] array) {

		for(int i=0; i<array.length; i++) {
			int start = i;
			int end = array.length - 1;
			int min = findMin(array, start, end);
			swap(array, start, min);
		}
	}
	
	private static int findMin(int[] array, int start, int end) {
		
		int minIndex = start;
		
		for(int i=start; i<=end; i++) {
			if(array[i] < array[minIndex]) {
				minIndex = i;
			}
		}
		
		return minIndex;
	}

	private static void selectionSortMax(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int start = 0;
			int end = array.length-1-i;
			int max = findMax(array, start, end);
			swap(array, max, end);
		}
	}

	private static void swap(int[] array, int max, int end) {
		int temp = array[max];
		array[max] = array[end];
		array[end] = temp;
	}

	private static int findMax(int[] array, int start, int end) {
		int maxIndex = 0;
		
		for(int i=0; i<= end; i++) {
			if(array[i] > array[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
