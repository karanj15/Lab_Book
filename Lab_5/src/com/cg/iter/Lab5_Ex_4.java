package com.cg.iter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab5_Ex_4 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String fname="";
		
		String lname="";
		try
		{ 
			System.out.println("enter first name");
			fname=sc.next();
			System.out.println("enter last name");
			lname=sc.next();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Name Input");
		}
		if(fname.equals(" ") && lname.equals(" "))
		{
			System.out.println("Invalid Input");
		}
		else
		{
			System.out.println("Valid Input");
		}
	}

}
