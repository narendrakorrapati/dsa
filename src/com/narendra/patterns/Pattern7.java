package com.narendra.patterns;


public class Pattern7 {

	public static void main(String[] args) {
		
		pattern7(5);
		
	}
	
	static void pattern7(int n) {
		
		for (int i = 0; i < n; i++) {
			
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
