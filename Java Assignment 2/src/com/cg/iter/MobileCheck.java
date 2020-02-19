package com.cg.iter;

import java.util.Scanner;

public class MobileCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a mobile number");
		String s=in.nextLine();
		boolean valid = s.matches("[6-9][0-9]{9}");
		System.out.println("Input valid: " + valid);
		}
	}


