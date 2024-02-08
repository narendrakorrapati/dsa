package com.narendra.patterns;


public class Pattern9 {

	public static void main(String[] args) {
		pattern9(5);
	}
	
	static void pattern9(int n) {
		
		for (int i = 0; i < n; i++) {
			
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<2*(n-i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
