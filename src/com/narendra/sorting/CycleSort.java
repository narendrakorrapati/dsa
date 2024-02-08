package com.narendra.sorting;

import java.util.Arrays;

public class CycleSort {

	public static void main(String[] args) {
		int array[] = new int[] {5, 1, 3, 2 , 4, 6};
		cycleSort(array);
		System.out.println(Arrays.toString(array));
	}

	private static void cycleSort(int[] array) {
		
		int index = 0;
		
		while(index < array.length-1) { //No need to check the last element because all previous elements will be in their indexes by this iteration
			if(array[index] == index + 1) {
				index ++;
			} else {
				swap(array, index, array[index] - 1);
			}
		}
		
	}

	private static void swap(int[] array, int source, int target) {
		int temp = array[source];
		array[source] = array[target];
		array[target] = temp;
	}
}
