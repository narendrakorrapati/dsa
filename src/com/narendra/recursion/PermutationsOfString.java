package com.narendra.recursion;

public class PermutationsOfString {

	public static void main(String[] args) {
		printPermutations("", "abc");
	}

	private static void printPermutations(String processed, String unProcessed) {
		
		if(unProcessed.isEmpty()) {
			System.out.println(processed);
			return;
		}
		char ch = unProcessed.charAt(0);
		
		for(int i=0; i<=processed.length(); i++) {
			StringBuilder builder = new StringBuilder(processed);
			printPermutations(builder.insert(i, ch).toString(), unProcessed.substring(1));
		}
		
	}
}
