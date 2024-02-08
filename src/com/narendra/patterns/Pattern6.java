package com.narendra.patterns;


public class Pattern6 {

	public static void main(String[] args) {
		
		pattern6(5);
		
	}
	
	static void pattern6(int n) {
		
		for (int i = 0; i < n; i++) {
			
			for(int k=0; k < n-i-1; k++) {
				System.out.print(" ");
			}
			
			for(int j=0; j< i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
