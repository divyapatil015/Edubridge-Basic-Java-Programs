package com.edu.String;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Hello guys my name is Divya";
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("Total number of character in given sentance is "+count);

	}

}
