package com.narendra.arrays;

import java.util.Arrays;

public class DeleteElementInArray {

	public static void main(String[] args) {
		int[] array = {1, 1, 2, 3};
		deleteElementAtIndex(array, 1);
		
		System.out.println(Arrays.toString(array));
	}

	private static void deleteElementAtIndex(int[] array, int indexToDelete) {

		int temp1 = array[array.length-1];
		int temp2 = 0;
		int value = array[indexToDelete];
		
		for(int i=array.length-1; i>indexToDelete; i--) {
			temp2 = array[i-1];
			array[i-1] = temp1;
			temp1 = temp2;
		}
		
		array[array.length-1] = value;
		
	}
}
