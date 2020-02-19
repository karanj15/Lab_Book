package com.cg.iter;

import java.util.Arrays;
import java.util.Scanner;

public class caseStringSort{
	public static String[] Sorting(String[] arr, int n)
	{  
		String result[]=new String[n];
		Arrays.sort(arr);
		int y=n/2;
		if(n%2==0)
		{
			for (int i = 0; i < y; i++) result[i]=arr[i].toUpperCase();
			for (int i = y; i <n; i++) result[i]=arr[i].toLowerCase();
		}
		else 
		{
			for (int i = 0; i < (y)+1; i++) result[i]=arr[i].toUpperCase();
			for (int i = (y)+1; i <n; i++) result[i]=arr[i].toLowerCase();
		}
		return result;  
	}  
	
	public static void main(String args[])
	{   
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int n=sc.nextInt();
		String arr[]=new String[n]; 
		System.out.println("Enter strings");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		System.out.println(Arrays.toString(Sorting(arr,n)));  
	}
}