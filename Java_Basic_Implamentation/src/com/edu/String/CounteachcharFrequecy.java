package com.edu.String;

import java.util.HashMap;
import java.util.Map;

public class CounteachcharFrequecy {
	public static void charCount(String name) {
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		char[] charArray = name.toCharArray();
		
		for(char c : charArray) {
			if(charMap.containsKey(c)) {
				
				charMap.put(c, charMap.get(c)+1);
			}
			else {
				charMap.put(c, 1);
			}
		}
		System.out.println(name+":"+charMap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Divya";
		charCount(name);

	}

}
