package com.cg.iter.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.iter.exception.BankingException;
import com.cg.iter.service.BankingService;
import com.cg.iter.service.BankingServiceImpl;

public class BankingMain 
{
	private BankingService bService;
	public BankingMain(BankingService bService) 
	{
		Scanner in= new Scanner(System.in);
		this.bService= bService;
		int choice=0;
		while(true)
		{
			//infinite loop
			System.out.println("WELCOME TO BANKING SYSTEM");
			choice = getChoice(in);

			switch (choice)
			{
			case 1:
				boolean inCorrect=true;
				do{
				System.out.println("Deposit Amount");
				System.out.println("Enter the amount");
				try{
				double dep_amount= in.nextDouble();
				if(dep_amount<=0)
				{
					System.out.println("Amount cannot be zero or negative");
				}
				else{
				
				inCorrect=false;//stops while loop
				boolean success = bService.deposit(dep_amount);
				if(success)
				{
					System.out.println("Amount deposited");
				}
				else
				{
					System.out.println("Could not deposit amount");
				}
				}
				System.out.println("amount :" +dep_amount);//remove after test
				}catch(InputMismatchException e)
				{
					System.out.println("Amount should be number");
					in.nextLine();//consume keyboard chars
				}
				}while(inCorrect);
				double balance=bService.getBalance();
				System.out.println("Available balance " + balance);
				break;
	case 2:
		boolean isCorrect=true;
		do{
		System.out.println("Withdraw Amount");
		System.out.println("Enter the amount");
		try{
		double with_amount= in.nextDouble();
		if(with_amount<=0)
		{
			System.out.println("Amount cannot be zero or negative");
		}
		else{
			isCorrect=false;//stops while loop
			boolean success = bService.withdraw(with_amount);
			
			
		if(success)
		
			System.out.println("Amount withdrawn");
	
		else
			System.out.println("Could not withdraw amount");
		}
		System.out.println("Amount has withdrawn: " +with_amount);
		}
		
		//1System.out.println("amount :" +amount);//remove after test
		catch(InputMismatchException e)
		{
			System.out.println("Amount should be number");
			in.nextLine();//consume keyboard chars
		}catch(BankingException e)
		{
			System.out.println(e.getMessage());
		}
		}while(isCorrect);
		 balance=bService.getBalance();
		System.out.println("Available Balance " +balance);
		break;
				
			
	case 3:
		System.out.println("Available balance");
		balance= bService.getBalance();
		System.out.println("Balance : " + balance);
		break;
	case 4:
		System.out.println("Exiting System. Thank you");
		System.exit(0);//normal termination
		break;

			default:
				System.out.println("Please enter 1 to 4 only");
				break;
			}
		}
	}

	private int getChoice(Scanner in) 
	{
		int choice=0;
		System.out.println("1. Deposit amount");
		System.out.println("2. Withdraw amount");
		System.out.println("3. Check Balance ");
		System.out.println("4. Exit System");
		System.out.println("Enter your choice");
		try{
		choice= in.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter numbers only");
			in.nextLine();//CONSUME THE KEYBOARD VALUE
		}
		
	
		return choice;
	}

	public static void main(String[] args) 
	{
	BankingService bService= new BankingServiceImpl();
	BankingMain bm= new BankingMain(bService);
	

	}

}
