package com.edu.Array;

public class LinerSearch1 {
	
	public static int findkeyposition(int numbers[],int key) {
		for(int i =0 ; i<numbers.length;i++)
		{
			if(numbers[i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int numbers[] = {3,4,5,8,9,1,6,7,10};
		int key = 10;
		int index = findkeyposition(numbers,key);
		if(index==-1) {
			System.out.println("Key not found");
		}
		else {
		System.out.println("Key is found at index : "+index);
		}
	}

}
