package com.cg.iter;

import java.util.Scanner;

class Lab5_Ex_5{  
	  
	   static void validate(int age)throws AgeException{  
	     if(age<18)  
	      throw new AgeException("Not valid");  
	     else  
	      System.out.println("Valid");  
	   }  
	     
	   public static void main(String args[]){ 
		   Scanner sc=new Scanner(System.in);
	      try{ 
	    	  System.out.println("Enter age");
	      int age;
	      age=sc.nextInt();
		validate(age);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	  }  
	}