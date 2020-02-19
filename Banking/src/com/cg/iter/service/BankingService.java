package com.cg.iter.service;

import com.cg.iter.exception.BankingException;

public interface BankingService {

	boolean deposit(double dep_amount);

	double getBalance();

	boolean withdraw(double with_amount) throws BankingException;

	
	
}
