package com.edu.Array;

public class MaxSubArraySumKadans {

	public static void MaxSum(int arr[]){
		int maxsum = 0;
		int currsum = 0;
		for(int i =0;i< arr.length;i++) {
			currsum += arr[i];
			if(currsum<0) {
				currsum =0;
			}
			maxsum = Math.max(maxsum, currsum);
			
		}
		System.out.println("Maximum subarry sum is:"+maxsum);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1,-2,4,5,-3,7,-4,9};
		MaxSum(arr);

	}

}
