package com.cg.iter.dao;

import com.cg.iter.exception.BankingException;

public interface BankingDao {

	boolean deposit(double dep_amount);

	double getBalance();

	boolean withdraw(double with_amount) throws BankingException;

	

}
