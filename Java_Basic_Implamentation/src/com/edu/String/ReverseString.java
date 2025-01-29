package com.edu.String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Divya";
		String s2= "";
		
		char ch;
		for(int i=0;i<s1.length();i++) {
			ch = s1.charAt(i);
			s2 = ch + s2;
		}
		System.out.println(s2);

	}

}
