package com.cg.iter;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab7_Ex_8 {

	public static void main(String[] args) {
		int arr[]= {11,22,22,3,3,3,4,5,6,8};
		int arr2[] = modifyArray(arr);



		//print the sorted values List
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
	private static int[] modifyArray(int[] arr) {
		// TODO Auto-generated method stub
		Set<Integer> mySet = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			mySet.add(arr[i]);
		}
		int i=0;
		int arr2[]=new int[mySet.size()];
		Iterator<Integer> iter = mySet.iterator();
		while (iter.hasNext()) {
			
			
			arr2[i]=(int) iter.next();
			
			i=i+1;
		}
		return arr2;
	}
	



}