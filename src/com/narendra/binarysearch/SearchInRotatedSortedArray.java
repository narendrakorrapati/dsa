package com.narendra.binarysearch;

/**
 * Search an element in Rotated sorted array with no duplicates
 * [4, 5, 6, 7, 0, 1, 2, 3]
 * Find Piot first
 */
public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int[] array = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
		int index = search(array, 8);
		System.out.println(index);
	}
	
	
	public static int search(int[] array, int target) {
		
		int indexOfPiot = findPiot(array);
		
		if(indexOfPiot == -1)
			return indexOfPiot;
		
		if(array[indexOfPiot] == target) {
			return indexOfPiot;
		}
		
		int index = binarySearch(array, 0, indexOfPiot, target);
		
		if(index == -1) {
			index = binarySearch(array, indexOfPiot + 1, array.length-1, target);
		}
		
		return index;
	}
	
	
	private static int binarySearch(int array[], int start, int end, int target) {
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(target == array[mid]) {
				return mid;
			}
			
			if(target < array[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
	

	private static int findPiot(int[] array) {
		
		int start = 0;
		int end = array.length-1;
		int mid = 0;
		
		while(start <= end) {
			mid = start + (end - start)/2;
			
			if(mid < end && array[mid] > array[mid+1]) {
				return mid;
			} else if(mid > 0 && array[mid] < array[mid-1]) {
				return mid - 1;
			} else if(array[start] > array[mid]) {
				end = mid -1;
			} else if(array[start] <= array[mid]) { //here <= is needed to break the loop (to move the start ahead of end for start > end to happen) when start = mid = end = last index and none of the above conditions didn't match.
				start = mid + 1;
			}
		}
		
		return array.length-1;
	}
}
