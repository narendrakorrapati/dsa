package com.narendra.patterns;


public class Pattern5 {

	public static void main(String[] args) {
		
		pattern5(5);
		
	}
	
	static void pattern5(int n) {
		
		for (int i = 0; i < 2 * n - 1; i++) {
			
			int column = 0;
			
			if(i<n) {
				column = i+1;
			} else {
				column = 2*n-i-1;
			}
			
			for (int j = 0; j < column; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
