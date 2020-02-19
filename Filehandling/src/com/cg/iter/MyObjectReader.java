package com.cg.iter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MyObjectReader {

	
	public static void main(String[] args) {
		Employee emp= null;
		FileInputStream fis=null;
		ObjectInputStream  ois= null;
		try
		{
			fis = new FileInputStream("emp.ser");
			ois= new ObjectInputStream(fis);
			emp = (Employee) ois.readObject();
			System.out.println(emp);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		

	}

}
