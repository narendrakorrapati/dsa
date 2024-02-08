package com.narendra.recursion;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int array[] = new int[] {4, 3, 1, 2, 7};
		sort(array, 0, 1);
		System.out.println(Arrays.toString(array));
	}

	private static void sort(int[] array, int row, int col) {
		
		if(row == array.length - 1) {
			return;
		}
		if(col > 0) {
			if(array[col] < array[col-1]) {
				swap(array, col, col-1);
				sort(array, row, col-1);
			} else {
				return;
			}
		} else {
			sort(array, row+1, row+2);
		}
		
	}

	private static void swap(int[] array, int col, int i) {
		
		int temp = array[col];
		array[col] = array[i];
		array[i] = temp;
		
	}
}
