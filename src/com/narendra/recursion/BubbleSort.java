package com.narendra.recursion;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int array[] = new int[] {4, 3, 1, 2, 7};
		sort(array, 0, 0);
		System.out.println(Arrays.toString(array));
	}

	private static void sort(int[] array, int row, int col) {
		
		if(row == array.length) {
			return;
		}
		
		if(col < (array.length - row - 1)) {
			if(array[col] > array[col + 1]) {
				swap(array, col, col + 1);	
			}
			sort(array, row, col + 1);
		} else {
			sort(array, row + 1, 0);
		}
	}

	private static void swap(int[] array, int col, int i) {
		
		int temp = array[col];
		array[col] = array[i];
		array[i] = temp;
		
	}
}
