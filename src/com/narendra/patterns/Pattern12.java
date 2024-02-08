package com.narendra.patterns;


public class Pattern12 {

	public static void main(String[] args) {
		pattern12(5);
	}
	
	static void pattern12(int n) {
		
		for (int row = 0; row < 2 * n; row++) {
			
			int spaces = row < n ? row : 2*n-row-1;
			int columns = row < n ? 2 * (n-row) - 1 : 2 * (row-n)+1;
			
			for (int space = 0; space < spaces; space++) {
				System.out.print(" ");
			}
			
			for (int column = 0; column < columns; column++) {
				
				if((column + 1) %2 !=0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}
	}
}
