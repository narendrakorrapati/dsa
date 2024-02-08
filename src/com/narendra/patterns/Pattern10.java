package com.narendra.patterns;


public class Pattern10 {

	public static void main(String[] args) {
		pattern10(5);
	}
	
	static void pattern10(int n) {
		
		for (int i = 0; i < n; i++) {
			
			for(int k=0; k<n-i-1; k++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<2*i+1; j++) {
				
				if((j + 1)%2 != 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
