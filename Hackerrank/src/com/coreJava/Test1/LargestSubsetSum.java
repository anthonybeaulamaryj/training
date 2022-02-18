package com.coreJava.Test1;

import java.util.*;

public class LargestSubsetSum {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			list.add(sc.nextInt());
		}
		List<Long> output = maxSubsetSum(list);
		
		for(long l : output) {
			System.out.println(l);
		}
	}
	public static List<Long> maxSubsetSum(List<Integer> k){
		
		List<Long> output = new ArrayList<Long>();
		long sum = 0;
		
		for(int i = 0; i<k.size(); i++) {
			for(int j = 1; j<=k.get(i); j++) {
				if((k.get(i) % j) == 0) {
					sum = sum + j;
				}
			}
			output.add(sum);
			sum = 0;
		}
		
		return output;
	}
}
