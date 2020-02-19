package com.cg.iter;

import java.util.*;
import java.io.*;

public class Lab6_Ex_6 {
	public static void main(String args[]) throws IOException {
		int nl = 1, nw = 0;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter File name: ");
		String str = sc.nextLine();
		FileInputStream f = new FileInputStream(str);
		int n = f.available();
		for (int i = 0; i < n; i++) {
			ch = (char) f.read();
			if (ch == '\n')
				nl++;
			else if (ch == ' ')
				nw++;

		}
		System.out.println("\nNumber of lines : " + nl);
		System.out.println("\nNumber of words : " + (nl + nw));
		System.out.println("\nNumber of characters : " + n);

	}
}