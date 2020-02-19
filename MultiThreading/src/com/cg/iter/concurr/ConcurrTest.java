package com.cg.iter.concurr;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrTest {

	public static void main(String[] args) {
	Runnable mr1= new MyRunnable(1);
	Runnable mr2= new MyRunnable(2);
	ExecutorService es = Executors.newFixedThreadPool(2);
	es.submit(mr1);
	es.submit(mr2);
	System.out.println("\nthreads submitted");
	//try {Thread.sleep(5000);} catch(InterruptedException e) {}
	es.shutdown();
	for(int i=0; i<10; i++)
	{
System.out.println(i+"[main]");		
	}

}
}
