package com.narendra.patterns;


public class Pattern13 {

	public static void main(String[] args) {
		pattern13(5);
	}
	
	static void pattern13(int n) {
		
		for (int row = 0; row < n-1; row++) {
			
			int outerSpaces = n - row - 1;
			int columns = 2 * row + 1;
			
			for(int spaces = 0; spaces < outerSpaces; spaces ++) {
				System.out.print(" ");
			}
			
			for(int column = 0; column < columns; column ++) {
				if(column == 0 || column == columns - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
				
		for(int column = 0; column < 2 * n - 1; column ++) {
			System.out.print("*");
		}
	}
}
