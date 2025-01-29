package com.edu.Array;

import java.util.HashMap;
import java.util.Map;

public class ArrayFrequncy {

	public static void countFrquency(int arr[]) {
		
		HashMap<Integer, Integer> arrcount = new HashMap<Integer,Integer>();
		for(int i = 0;i<arr.length;i++) {
			if(arrcount.containsKey(arr[i])) {
				arrcount.put(arr[i], arrcount.get(arr[i])+1);
			}
			else {
				arrcount.put(arr[i],1);
			}
		}
		for(Map.Entry<Integer,Integer> i: arrcount.entrySet()) {
		System.out.println(i.getKey()+" "+i.getValue());
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,6,9,3,1,3,6,9,9,7};
		
		countFrquency(arr);
		

	}
	

}
