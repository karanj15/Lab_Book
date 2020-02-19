package com.cg.iter;

import java.util.Scanner;

public class Lab5_Ex_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int count;
		for(int i=1;i<=n;i++)
		{	count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
				count=0;
			}
		}
		
	}

}
