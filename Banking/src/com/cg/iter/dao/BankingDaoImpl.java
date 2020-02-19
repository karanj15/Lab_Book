package com.cg.iter.dao;

import org.apache.log4j.Logger;
import com.cg.iter.exception.BankingException;
import com.cg.iter.util.BankingConfig;

public class BankingDaoImpl implements BankingDao {
private double balance= BankingConfig.MIN_BALANCE;//1000;
//Create Logger
private Logger logger= Logger.getLogger(BankingDaoImpl.class);

	public boolean deposit(double dep_amount) 
	{
		logger.info("Deposited amount :" + dep_amount);
		balance= balance + dep_amount;
		return true;
	}

	public boolean withdraw(double with_amount) throws BankingException {
		logger.info("withdrew amount :" + with_amount);
		double temp=balance- with_amount;
		if(temp<BankingConfig.MIN_BALANCE)
			
			throw new BankingException("Insufficient Balance");
		else
			balance=temp;
		return true;
		
	}
	public double getBalance() {
		
		return balance;
	}

}
