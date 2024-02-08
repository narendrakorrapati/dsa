package com.narendra.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int array[] = new int[] {3, 5, 4, 2, 1};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}

	private static void bubbleSort(int[] array) {
		
		for(int i=0; i<array.length;i++) {
			for(int j=1; j<array.length-i; j++) {
				if(array[j] < array[j-1]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		
	}
}
