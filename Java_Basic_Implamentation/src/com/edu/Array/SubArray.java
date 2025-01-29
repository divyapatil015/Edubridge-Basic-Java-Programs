package com.edu.Array;

public class SubArray {
	public static void subarray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
			System.out.println();

		}
	}

	public static void subarraySum(int arr[]) {

		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {
			currentSum = 0;
			for (int j = i; j < arr.length; j++) {
				for (int k = i; k <= j; k++) {
					currentSum += arr[k];

				}

				System.out.println("Current sum is:" + currentSum);
				if (currentSum > maxSum) {
					maxSum = currentSum;
				}
			}
		}
		System.out.println("Maximun Subarray sum is :" + maxSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 4, 6, 8, 10 };
		subarray(arr);
		subarraySum(arr);
	}

}
