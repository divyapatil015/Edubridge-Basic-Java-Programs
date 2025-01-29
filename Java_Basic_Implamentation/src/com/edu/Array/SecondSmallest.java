package com.edu.Array;

public class SecondSmallest {

	public static void secondSmallest(int arr[]) {
		int smallest = Integer.MAX_VALUE;
		int secondS = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondS = smallest;
				smallest = arr[i];
			}
				else if(arr[i]>smallest && arr[i]<secondS){
					
					secondS = arr[i];
				
			}
			
			
			
		}
		System.out.println("Smallest no is :"+smallest);
		System.out.println("Second smallest is :"+secondS);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,5,7,9,10};
		secondSmallest(arr1);

	}

}
