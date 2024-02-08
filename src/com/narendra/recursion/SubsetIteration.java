package com.narendra.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetIteration {

	public static void main(String[] args) {
		List<List<Integer>> subsets = getSubsets(new int[] {1, 2, 3});
		System.out.println(subsets);
		
		System.out.println(getSubsetsWhileDuplicates(new int[] {1, 2, 2}));
	}

	private static List<List<Integer>> getSubsets(int[] array) {
		
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		
		for (int i = 0; i < array.length; i++) {
			
			List<List<Integer>> innerList = new ArrayList<>();
			
			for(List<Integer> item: outer) {
				List<Integer> newItem = new ArrayList<>(item);
				newItem.add(array[i]);
				innerList.add(newItem);
			}
			outer.addAll(innerList);
		}
		//return outer.subList(1, outer.size()-1);
		return outer;
	}
	/*
	 * Not completed
	 * TODO
	 */
	private static List<List<Integer>> getSubsetsWhileDuplicates(int[] array) {
		
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		
		int start = 0;
		int end = outer.size() - 1;
		
		for (int i = 0; i < array.length; i++) {
			start = 0;
			List<List<Integer>> innerList = new ArrayList<>();
			
			if(i>0 && array[i] == array[i-1]) {
				start = end + 1;
			} 
			
			for(int j=start; j<outer.size(); j++) {
				List<Integer> newItem = new ArrayList<>(outer.get(j));
				newItem.add(array[i]);
				innerList.add(newItem);
			}
			outer.addAll(innerList);
			
		}
		//return outer.subList(1, outer.size()-1);
		return outer;
	}
}
