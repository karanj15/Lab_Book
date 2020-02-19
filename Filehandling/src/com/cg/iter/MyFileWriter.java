package com.cg.iter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFileWriter 
{
	public static void main(String[] args) 
	{
		Scanner in= new Scanner (System.in);
		System.out.println("Enter a sentence");
		String line= in.nextLine();
	    File file= new File("output.txt"); 
	    System.out.println(file.exists());
	    FileWriter fw= null; 
	    BufferedWriter bw= null;
	    try {
			fw= new FileWriter(file);
			bw= new BufferedWriter(fw);
			bw.write(line);
			System.out.println("Written to file");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			if(bw!=null)
				try {
					bw.close();
				} catch (IOException e) {
				
				}
		}
		}
	} 


