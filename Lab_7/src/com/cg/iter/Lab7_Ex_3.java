package com.cg.iter;

import java.util.HashMap;

public class Lab7_Ex_3 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
        HashMap<Integer, Integer> hMap =getSquares(arr);
        
        
     
        //print the sorted values List
        System.out.println(hMap);
    }
	private static HashMap<Integer, Integer> getSquares(int[] arr) {
		
		HashMap<Integer, Integer> hMap= new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			hMap.put(arr[i], arr[i]*arr[i]);
		}
		return hMap;
		
	}
	
    
}