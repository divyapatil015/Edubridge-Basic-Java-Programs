package com.edu.String;

public class Palindrome_no1 {
	
	public static boolean checkPalindrome(String str) {
		for(int i=0 ; i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
			{
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		String str = "noon";
	    boolean b = checkPalindrome(str);
		
		if(b) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

}
