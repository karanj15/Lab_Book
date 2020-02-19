package com.cg.iter.concurr;

public class MyRunnable implements Runnable
{
private int sno;

public MyRunnable(int sno) 
{
	this.sno=sno;
}
public void run()
{
	for(int i=0; i<10; i++)
	{
		System.out.println(i+"<run"+sno+"> ");
		try{Thread.sleep(2);} catch(InterruptedException e) {}
		
	}
	System.out.println("\nThread "+sno+" END");
}
}
