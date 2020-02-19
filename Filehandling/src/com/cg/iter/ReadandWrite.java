package com.cg.iter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadandWrite 
{
	

 public static void main(String[] args) {
	 
	 	
	 File file1= new File("read.txt");
		FileReader fr= null;
		BufferedReader br= null;
		File file2= new File("write.txt");
		FileWriter fw= null;
		BufferedWriter bw= null;
		try{
			fr = new FileReader(file1);
			br= new BufferedReader(fr);
			fw = new FileWriter(file2);
			bw= new BufferedWriter(fw);
			try{
				String line=null;
				while((line=br.readLine())!=null)
				{
			
			bw.write(line);
			bw.newLine();
			System.out.println(line);
		}
			}
			finally
			{
				br.close();
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		finally
		{
			try {
				if(bw!=null)
				bw.flush();// bw.close(); flush will first flush then close
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	
 }
}