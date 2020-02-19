//Java program that reads on file name from the user, 
//then displays information about whether the file exists, 
//whether the file is readable, whether the file is writable, 
//the type of file and the length of the file in bytes
package com.cg.iter;

import java.util.Scanner;
import java.io.File;

public class Lab6_Ex_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name-");
		String s = sc.nextLine();
		File f1 = new File(s);
		System.out.println("File Name:" + f1.getName());
		System.out.println("This file:" + (f1.exists() ? "Exists" : "Does not exists"));
		System.out.println("Is Readable:" + f1.canRead());
		System.out.println("Is Writable:" + f1.canWrite());
		System.out.println("File type:" +  getFileExtension(f1));
		System.out.println("File Size:" + f1.length() + "bytes");
	}

	private static String getFileExtension(File f1) {
		String fileName = f1.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
	}
}