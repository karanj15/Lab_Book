package com.cg.iter;

public class Test {
	public static void main(String[] args) {
		int arr[]= new int[50];
	
		for (int i = 0; i < arr.length; i++) {
			 arr[i]=i+1;// or i+10;
			
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%3==0 && arr[i]%5==0)
				System.out.print(" abcxyz ");
			else if(arr[i]%3==0)
				System.out.print(" abc ");
			else if(arr[i]%5==0)
				System.out.print(" xyz ");
			else
				System.out.print(arr[i]+" ");
			
			
		}
	}

}
