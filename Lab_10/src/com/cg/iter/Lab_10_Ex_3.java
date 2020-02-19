package com.cg.iter;

import java.util.Scanner;
import java.util.function.*;

public class Lab_10_Ex_3 {

	public static void main(String[] args) {
		new Lab_10_Ex_3();
	}

	public Lab_10_Ex_3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name:");
		String user = sc.nextLine();
		System.out.println("Enter Password:");
		String pass = sc.nextLine();
		BiFunction<String,String,Boolean> fn = (a,b) -> a.equals("iter") && b.equals("iter") ? true:false;
		if(fn.apply(user,pass))System.out.println("Welcome");
		else
		System.out.println("Incorrect Id or Password");
	}

}
