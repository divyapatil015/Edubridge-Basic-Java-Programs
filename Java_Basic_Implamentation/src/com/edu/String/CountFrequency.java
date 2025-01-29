package com.edu.String;

public class CountFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Moon";
		char ch ='o';
		int count =0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("Count of given "+ch +" char is "+count);

	}

}
