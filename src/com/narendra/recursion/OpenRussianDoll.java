package com.narendra.recursion;

public class OpenRussianDoll {

	public static void main(String[] args) {
		openRussianDoll(10);
	}

	private static void openRussianDoll(int i) {
		
		if(i == 1) {
			System.out.println("Opend Doll Number:" + i);
			System.out.println("All Dalls are opened");
		} else {
			System.out.println("Opend Doll Number:" + i);
			openRussianDoll(i-1);
		}
		
	}
}
