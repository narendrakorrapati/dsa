package com.narendra.patterns;

public class Pattern15 {

	public static void main(String[] args) {
		pattern15(5);
	}

	static void pattern15(int n) {
		
		for (int row = 0; row < 2 * n - 1; row++) {

			int spaces = row < n ? n - row - 1 : row -n + 1;
			
			int columns = row < n ? 2 * row + 1 : 2 * ( 2 * n - (row + 1)) - 1;
			
			for(int space=0; space< spaces; space ++) {
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
	}
}
