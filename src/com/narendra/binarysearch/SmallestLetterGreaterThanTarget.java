package com.narendra.binarysearch;

/**
 * Find smallest letter greater than target. Array can contain duplicate elements.
 * If it found in more than once place, return the first occurrence.
 * Example: Search for 'h' it should return 'i' from index 6
 * ['a', 'c', 'e', 'e', 'h', 'h', 'i', 'i', 'j']
 */
public class SmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		
		System.out.println(nextGreatestLetter(new char[] {'x', 'x', 'y', 'y'}, 'z'));
	}
	
	public static char nextGreatestLetter(char[] letters, char target) {
        
        if(letters[letters.length-1] <= target) {
            return letters[0];
        }

        int start = 0;
        int end = letters.length - 1;
        int mid = 0;

        while(start<=end) {
            mid = start + (end - start)/2;

            if(target == letters[mid]) {
                start = mid + 1;
            } else if(target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start];
    }
	
}
