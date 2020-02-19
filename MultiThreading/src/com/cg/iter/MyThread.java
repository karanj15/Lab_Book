package com.cg.iter;
// project: MultiThreading
public class MyThread extends Thread {
	@Override
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("*** run: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args)  
	{
		MyThread mt = new MyThread();
		mt.start(); //this will call run() in anew thread
		for(int i=0; i<10; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("main" + i);
		}

	}

}
