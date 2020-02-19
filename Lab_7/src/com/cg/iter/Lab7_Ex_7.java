package com.cg.iter;

import java.util.ArrayList;
import java.util.Collections;

public class Lab7_Ex_7 {

	public static void main(String[] args) {
		int arr[]= {19,5,1,72,3,8,102,61};
		ArrayList<Integer> list = getSorted(arr);



		//print the sorted values List
		System.out.println(list);
	}
	private static ArrayList<Integer> getSorted(int[] arr) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) 
		{
			String s=(String.valueOf(arr[i]));
			String reverse = "";
			int length = s.length();
			for( int j = length - 1 ; j >= 0 ; j-- ) {
				reverse = reverse + s.charAt(j);
				
			}


			arr[i]=Integer.valueOf(reverse);
			list.add(arr[i]);
		}
		Collections.sort(list);
		return list;

	}



}