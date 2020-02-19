package com.cg.iter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookingException {

	public BookingException()
	{
		Scanner in = new Scanner(System.in);
		try{
		System.out.println("enter numerator");
		int num= in.nextInt();
		System.out.println("enter denominator");
		int dem= in.nextInt();
		int quotient= divide(num,dem);
		System.out.println(num +" / "+dem +" = "+quotient);
			
	}
	catch (ArithmeticException e) 
	{
				System.out.println("Denominator cannot be zero");
				// TODO: handle exception
			}
	catch (InputMismatchException e) {
		System.out.println("Please enter numbers only");
		// TODO: handle exception
	}
finally{
	System.out.println("End of program");
}
	}
	private int divide(int num, int dem) 
	{
		// TODO Auto-generated method stub
		return num/dem;
	}


	public static void main(String[] args) {
		new ExceptionTest();
	}
}
