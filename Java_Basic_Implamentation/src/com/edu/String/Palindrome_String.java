package com.edu.String;

public class Palindrome_String {

	public  static void palindrome1(String str) {
		//String input ="noon";
		StringBuilder input1 = new StringBuilder();
		input1.append(str);
		input1.reverse();
		System.out.println(input1);
		
	}
	public static void main(String[] args) {
		
		String str ="noon";
		String s2="";
		palindrome1(str);
		
		for(int i=str.length()-1;i>=0;i--) {
			s2 = s2+str.charAt(i);
		}
		//System.out.println(s2);
		if(str.equalsIgnoreCase(s2)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

}
}