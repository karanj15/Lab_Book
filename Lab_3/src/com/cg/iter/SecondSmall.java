package com.cg.iter;

import java.util.*;  
public class SecondSmall
{  
	public static int getSecondSmallest(int[] arr)
	{  
		Arrays.sort(arr);
		return arr[1];  
	}  
	public static void main(String args[])
	{   
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=sc.nextInt();
		int arr[]=new int[n]; 
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Second Smallest: "+getSecondSmallest(arr));  
	}
}  