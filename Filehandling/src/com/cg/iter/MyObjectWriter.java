package com.cg.iter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyObjectWriter {
	public static void main(String[] args)
	{
		Employee emp= new Employee(1234, "Bishal",9012341234L,"Manager");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos= new FileOutputStream("emp.ser");
			oos= new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("Employee object written to file");
		} catch (FileNotFoundException e) {
						e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(oos!=null)oos.close();
				}
			catch(IOException e){};
		}
	}

}
 