package com.edu.Array;

public class BinarySearch1 {

	public static int searchkey(int numbers[],int key) {
		int start = 0;
		int end = numbers.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(numbers[mid]==key) 
			{
				return mid;
			}
			if(numbers[mid]<key){
				start = mid+1;
			
			}
			else {
			  end = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int numbers[]= {10,12,13,17,30,45,50,60};
		int key = 60;
		int index = searchkey(numbers,key);
		if(index==-1) {
			System.out.println("Key is not found ");
		}
		else {
			System.out.println("Key found at index :"+index);
		}

	}

}
