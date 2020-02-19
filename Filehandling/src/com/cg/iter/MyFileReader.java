package com.cg.iter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file= new File("output.txt");
		FileReader fr= null;
		BufferedReader br= null;
		try{
			fr = new FileReader(file);
			br= new BufferedReader(fr);
			String line= br.readLine();
			System.out.println(line);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		}

	}


