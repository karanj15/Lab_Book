package com.cg.iter.service;

import com.cg.iter.dao.BankingDao;
import com.cg.iter.dao.BankingDaoImpl;
import com.cg.iter.exception.BankingException;

public class BankingServiceImpl implements BankingService 
{
	private BankingDao bDao;//Data Access object Interface

	public BankingServiceImpl()
	{
		bDao= new BankingDaoImpl();
		    // new BankingDaoImplFile();
	}

	public boolean deposit(double dep_amount)
	{
		
		return bDao.deposit(dep_amount);
	}

	public double getBalance() {
		// TODO Auto-generated method stub
		return bDao.getBalance();
	}

	public boolean withdraw(double with_amount) throws BankingException {
		return bDao.withdraw(with_amount);
		
	}

}
