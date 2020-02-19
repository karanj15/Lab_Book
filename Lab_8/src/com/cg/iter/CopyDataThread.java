package com.cg.iter;


import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;


public class CopyDataThread extends Thread {
	
	FileReader fr ;

	FileWriter fw ;

	CopyDataThread(FileReader fr ,FileWriter fw )
	
	{
		
	this.fr=fr;

		this.fw=fw;
	
	}
	
	@Override

	public void run() {

	
	try {
	
		int i=1;

		int c=fr.read();

		while(c!=-1) {
	
		//System.out.println(Character.toChars(c));

		i++;
			
	        if(i==10) 
		{
		
		System.out.println("10 characters are copied");
	
		Thread.sleep(5000);
	
		i=1;
			
	}
				
	fw.write(Character.toChars(c));
	
		c=fr.read();

		}
	
		fw.close();
	
		fr.close();
	
		System.out.println("file copied");

		}catch (FileNotFoundException e) 
		{
		e.printStackTrace();
	
		} 
		
		catch (IOException e)
		 {
			
		e.printStackTrace();
		
		} 
		catch (InterruptedException e) {
			
		e.printStackTrace();
	
	}
	
}

}


