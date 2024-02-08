package com.narendra.recursion;

import java.util.ArrayList;
import java.util.List;

public class StringSubSets {

	public static void main(String[] args) {
		printSubSets("abc", "");
		
		List<String> subsets = new ArrayList<>();
		
		fillSubSets("abc", "", subsets);
		System.out.println(subsets);
		
		List<String> getSubSets = getSubSets("abc", "");
		System.out.println(getSubSets);
		
	}

	private static List<String> getSubSets(String string, String subset) {
		
		if(string.length() == 0) {
			List<String> subsetItem = new ArrayList<>();
			if(subset.length() > 0) {
				subsetItem.add(subset);
			}
			return subsetItem;
		}
		
		//Take it.
		List<String> subsetItemLeft = getSubSets(string.substring(1), subset + string.charAt(0));
		//Ignore it.
		List<String> subsetItemRight = getSubSets(string.substring(1), subset);
		
		subsetItemLeft.addAll(subsetItemRight);
		
		return subsetItemLeft;
	}

	private static void printSubSets(String string, String subset) {
		
		if(string.length() == 0) {
			if(subset.length() > 0)
			System.out.println(subset);
			return;
		}
		
		//Take it.
		printSubSets(string.substring(1), subset + string.charAt(0));
		//Ignore it.
		printSubSets(string.substring(1), subset);
		
	}
	
	private static void fillSubSets(String string, String subset, List<String> subsetList) {
		
		if(string.length() == 0) {
			if(subset.length() > 0)
			subsetList.add(subset);
			return;
		}
		
		//Take it.
		fillSubSets(string.substring(1), subset + string.charAt(0), subsetList);
		//Ignore it.
		fillSubSets(string.substring(1), subset, subsetList);
		
	}
}
