package com.narendra.binarysearch;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SumArray {

	public static void main(String[] args) {
		System.out.println(addToArrayForm(new int[] {9,9,9,9,9,9,9,9,9,9}, 1));
	}
	public static List<Double> addToArrayForm(int[] num, int k) {
        
        BigInteger sum = BigInteger.ZERO;
        List<Double> result = new ArrayList<Double>();
        
        for(int i=0; i<num.length; i++) {
            sum.add(new BigInteger(String.valueOf(num[i] * Math.pow(10, num.length-1-i))));
        }
        //sum = sum + k;
        System.out.println(sum);
        /*
        while(sum > 0) {
            result.add(0, sum%10);
            sum = sum / 10;
        }*/
        

        return result;
    }
}
