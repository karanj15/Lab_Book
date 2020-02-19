package com.cg.iter;

import java.util.Scanner;

class Lab1Ex_4 {

	static boolean checkNumber(int n) {
		if (n == 0)
			return false;

		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n");
		int n= in.nextInt();
		if (checkNumber(n))
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
