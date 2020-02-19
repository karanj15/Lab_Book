package com.cg.iter;

import java.util.Scanner;

public class Lab5_Ex_2
{
	int a=1,b=1,sum=0;
	int nthFibonacci(int n)
	{
		if(n==1 || n==2)
		{
			return 1;
		}
		else
		{
			for(int i=0;i<n-2;i++)
			{
				sum=a+b;
				a=b;
				b=sum;
			}
			return sum;
			}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Lab5_Ex_2 obj = new Lab5_Ex_2();
		System.out.println("Enter the value of n to find nth Fibonacci");
		int n=sc.nextInt();
		System.out.println(obj.nthFibonacci(n));
		
	}

}
