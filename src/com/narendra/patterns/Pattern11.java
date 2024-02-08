package com.narendra.patterns;


public class Pattern11 {

	public static void main(String[] args) {
		pattern11(5);
	}
	
	static void pattern11(int n) {
		
		for (int i = 0; i < n; i++) {
			
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<2*(n-i)-1; j++) {
				if((j+1) % 2 != 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
