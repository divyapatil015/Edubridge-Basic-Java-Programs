package com.edu.Array;

import java.util.Arrays;

public class DuplicationElements {
	public static void main(String args[]) {
		
		int[] arr = new int[]{45, 12, 78, 34, 89, 21,45,78};
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate element is :"+arr[i]);
				}
			}
		}
		
		
	} 

}
