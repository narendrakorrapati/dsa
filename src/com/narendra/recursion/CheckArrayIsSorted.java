package com.narendra.recursion;

public class CheckArrayIsSorted {

	public static void main(String[] args) {
		boolean status = isSorted(new int[] {1, 2, 3, 5, 5, 6, 10, 9}, 0);
		System.out.println(status);
	}

	private static boolean isSorted(int[] array, int index) {
		
		
		if(index == array.length-1) {
			return true;
		}
		
		if(array[index] <= array[index + 1]) {
			return isSorted(array, index +1);
		} else {
			return false;
		}
	}
}
