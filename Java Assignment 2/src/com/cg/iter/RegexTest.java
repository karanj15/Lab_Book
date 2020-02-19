package com.cg.iter;

import java.util.Scanner;

public class RegexTest {

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Scanner in= new Scanner(System.in);
System.out.println("Enter a 5 digit number");
String s=in.nextLine();
boolean valid = s.matches("\\d{5}");
System.out.println("Input valid: " + valid);
}
}