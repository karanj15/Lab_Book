package com.cg.iter;

import java.util.Scanner;

public class Lab5_Ex_6
{
	static void validateSalary(int salary)throws AgeException{  
	     if(salary<3000)
			try {
				throw new EmployeeException("Not valid");
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else  
	      System.out.println("Valid");  
	   }  
	     
	   public static void main(String args[]){ 
		   Scanner sc=new Scanner(System.in);
	      try{  
	      int salary;
	      System.out.println("Enter Salary");
	      salary=sc.nextInt();
		validateSalary(salary);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
}
}
