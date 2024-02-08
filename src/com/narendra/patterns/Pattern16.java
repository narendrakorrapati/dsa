package com.narendra.patterns;

public class Pattern16 {

	public static void main(String[] args) {
		pattern16(5);
	}

	static void pattern16(int n) {
		
		for (int row = 0; row < n; row++) {
			
			int spaces = n - row - 1;
			int columns = row;
			
			for (int space = 0; space < spaces; space++) {
				System.out.print(" ");
			}
			
			for (int column = 0; column <= columns; column++) {
				System.out.print(column + 1 + " ");
			}
			
			System.out.println();
		}
	}
}
