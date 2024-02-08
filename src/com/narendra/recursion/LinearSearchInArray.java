package com.narendra.recursion;

public class LinearSearchInArray {

	public static void main(String[] args) {
		int index = search(new int[] {4, 5, 2, 3, 7}, 3, 0);
		System.out.println(index);
	}

	private static int search(int[] array, int target, int index) {
		
		if(index == array.length) {
			return -1;
		}
		
		if(target == array[index]) {
			return index;
		} else {
			return search(array, target, index + 1);
		}
	}
}
