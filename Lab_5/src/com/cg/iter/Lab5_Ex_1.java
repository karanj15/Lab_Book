package com.cg.iter;

import java.util.Scanner;

public class Lab5_Ex_1
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Red Light");
		System.out.println("2.Yellow Light");
		System.out.println("3.Green Light");
		System.out.println("Select any one of the above");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("STOP");
			break;
		case 2:
			System.out.println("READY");
			break;
		case 3:
			System.out.println("GO");
			break;
		default:
			System.out.println("Enter Valid Input");
		}
		
	}

}
