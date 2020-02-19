package com.cg.iter;

import java.util.HashMap;

public class Lab7_Ex_2 {
	static final int MAX_CHAR = 256; 

	static HashMap<Character, Integer> countCharacter(char[] c) 
	{ 
		// Create an array of size 256 i.e. ASCII_SIZE 
		int count[] = new int[MAX_CHAR]; 
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		int len = c.length; 

		// Initialize count array index 
		for (int i = 0; i < len; i++) 
			count[c[i]]++; 
		System.out.println(count[c[len-3]]);
		// Create an array of given String size 
		char ch[] = new char[c.length]; 
		for (int i = 0; i < len; i++) { 
			ch[i] = c[i]; 
			int find = 0; 
			for (int j = 0; j <= i; j++) { 

				// If any matches found 
				if (c[i] == ch[j])  
					find++;                 
			} 

			if (find == 1)  {
				System.out.println("Number of Occurrence of " + 
						c[i] + " is:" + count[c[i]]);    
				hMap.put(c[i],count[c[i]]);
			}     
		}
		return hMap; 
	} 
	public static void main(String[] args) 
	{ 
		char c[]= {'A','P','P','L','E'};
		HashMap<Character, Integer> hMap=countCharacter(c); 
		System.out.println(hMap);
		
	}
}
