package com.edu.String;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sen = "India is my country";
		String revsen = "";
		String word ="";
		
		for(int i=0;i<sen.length();i++) {
			char ch = sen.charAt(i);
			if(ch!=' ') {
			word =word+ch;
		}
			else {
				revsen = word +" "+revsen;
				word ="";
			}
			 
		}
		 revsen = word + " "+revsen ;
		System.out.println(revsen);
	}
	

}
