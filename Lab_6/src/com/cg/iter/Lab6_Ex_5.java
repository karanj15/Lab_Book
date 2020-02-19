package com.cg.iter;

import java.util.Scanner;

public class Lab6_Ex_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int modifiedNumber=modifyNumber(n);
		System.out.println(modifiedNumber);
	}

	private static int modifyNumber(int n) {
		String str=String.valueOf(n);
		StringBuffer s=new StringBuffer();
		str=str+"0";
		for (int i = 0; i < str.length()-1; i++) {
			char ch=str.charAt(i);
			int digit=Character.getNumericValue(ch);
			char chnext=str.charAt(i+1);
			int digitnext=Character.getNumericValue(chnext);
			
			int diff=Math.abs(digit-digitnext);
			//System.out.println(diff);
			s.append(diff);
			
			
		}
		int modified=Integer.parseInt(s.toString());
		return modified;
	}

}
