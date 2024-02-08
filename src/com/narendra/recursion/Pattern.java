package com.narendra.recursion;

public class Pattern {

	public static void main(String[] args) {
		
		print(4, 0);
	}

	private static void print(int row, int col) {
		
		if(row == 0) {
			return;
		}
		
		if(col < row) {
			System.out.print("*");
			print(row, col+1);
		} else {
			System.out.println();
			print(row-1, 0);
		}
		
	}
}
