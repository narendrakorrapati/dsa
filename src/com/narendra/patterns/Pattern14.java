package com.narendra.patterns;

public class Pattern14 {

	public static void main(String[] args) {
		pattern14(5);
	}

	static void pattern14(int n) {

		for (int column = 0; column < 2 * n - 1; column++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		for (int row = 1; row <= n - 1; row++) {

			int spaces = row;
			int columns = 2 * (n - row) - 1;
			
			for (int space = 0; space < spaces; space++) {
				System.out.print(" ");
			}
			
			for (int column = 0; column < columns; column++) {
				if(column == 0 || column == columns - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
