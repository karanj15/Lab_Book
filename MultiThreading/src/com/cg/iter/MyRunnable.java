package com.cg.iter;

public class MyRunnable implements Runnable{

	
	@Override
	public void run() 
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("### run: " + i);
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) 
	{
		Thread t= new Thread(new MyRunnable());
		t.start();// will spawn a new thread and call run() of the Runnable object	
		for(int i=0; i<10; i++)
		{
			System.out.println("main" + i);
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		}

}
