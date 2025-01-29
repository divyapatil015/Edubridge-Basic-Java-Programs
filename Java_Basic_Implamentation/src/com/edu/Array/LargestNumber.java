package com.edu.Array;
import java.util.*;

public class LargestNumber {

	public static int getLargest(int numbers[]) {
		int largest = Integer.MIN_VALUE;
		
		for(int i = 0 ;i<numbers.length;i++) {
			if(largest<numbers[i]) {
				largest = numbers[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largest[] = {1,2,3,4,5,6,7,8,9,11,23,56};
		System.out.println("Largest number is :"+ getLargest(largest));

	}

}
