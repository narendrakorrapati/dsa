package com.narendra.patterns;


public class Pattern4 {

	public static void main(String[] args) {
		
		pattern4(5);
		
	}
	
	static void pattern4(int n) {
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j< i + 1; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}
}
