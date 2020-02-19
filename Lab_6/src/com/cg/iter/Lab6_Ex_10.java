package com.cg.iter;

import java.util.Scanner;

public class Lab6_Ex_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String username=sc.next();
		if(validate(username)) {
			System.out.println("Username Accepted");
		}else {
			System.out.println("Username rejected");
		}

	}

	private static boolean validate(String username) {

		if(!(username.endsWith("_job")))
			return false;

		if(!(username.length()>=12))
			return false;
		
		
		return true;

	}

}
