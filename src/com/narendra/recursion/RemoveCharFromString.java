package com.narendra.recursion;

public class RemoveCharFromString {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		//String newString = removeChar("baccad", 'a');
		//System.out.println(newString);
		
		removeChar("baccad", 'a', builder);
		System.out.println(builder);
	}

	private static String removeChar(String string, char c) {
		
		if(string.length() == 0) {
			return "";
		}
		
		if(string.charAt(0) == c) {
			return removeChar(string.substring(1), c);
		} else {
			return string.charAt(0) + removeChar(string.substring(1), c);
		}
	}
	
	private static void removeChar(String string, char c, StringBuilder builder) {
		
		if(string.length() == 0) {
			return;
		}
		
		if(string.charAt(0) == c) {
			removeChar(string.substring(1), c, builder);
		} else {
			builder.append(string.charAt(0));
			removeChar(string.substring(1), c, builder);
		}
	}
}
