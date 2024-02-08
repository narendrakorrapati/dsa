package com.narendra.patterns;


public class Pattern8 {

	public static void main(String[] args) {
		
		pattern8(5);
		
	}
	
	static void pattern8(int n) {
		
		for (int i = 0; i < n; i++) {
			
			for(int k=0; k<n-i-1; k++) {
				System.out.print(" ");
			}
			
			for(int j=0; j< 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
