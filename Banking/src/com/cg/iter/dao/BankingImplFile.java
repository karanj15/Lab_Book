package com.cg.iter.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.cg.iter.exception.BankingException;
import com.cg.iter.util.BankingConfig;

public class BankingImplFile implements BankingDao {
	private double minBalance;
	private double balance;
	private String configFile="bank.config";
	private String balanceFile="balance.config";
	private BufferedReader reader;
	private BufferedWriter writer;
	
	public BankingImplFile()
	{
		try{
			reader= new BufferedReader(new FileReader(balanceFile));
			writer= new BufferedWriter(new FileWriter(balanceFile,true));
		
			BufferedReader br= new BufferedReader(new FileReader(configFile));
			String[] bal= br.readLine().split("=");
			minBalance = Double.parseDouble(bal[1]);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean deposit(double dep_amount) {

openWriter();
   balance += dep_amount;
   try {
writer.write("BALANCE = " +balance);
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
		return false;
	}

	public double getBalance() {
		try{
			String line = reader.readLine();
			System.out.println("line: " +line);
		String[] bal= reader.readLine().split("=");
		return Double.parseDouble(bal[1]);
	}catch(IOException e){
		e.printStackTrace();
	}
		return 0;
	}

	public boolean withdraw(double with_amount) throws BankingException {
	double temp= balance-with_amount;
	if(temp<minBalance){
		throw new BankingException(BankingConfig.INSUFFICIENT_BALANCE);
	}
	else
	{
		balance=temp;
		try{
			openWriter();
			writer.write("BALANCE="+balance);
			closeWriter();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
		return true;
	}

	private void closeWriter() {
		// TODO Auto-generated method stub
		
	}

	private void openWriter() {
		// TODO Auto-generated method stub
		
	}

}
