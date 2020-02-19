package com.cg.iter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Timer implements Runnable{

	public static void main(String[] args) {
		Runnable rs = new Timer();
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.submit(rs);
		es.shutdown();
	}

	@Override
	public void run() {
		int time=1;
		while(true) {
		try {
			Thread.sleep(1000);
			if(time==11) time=1;
			System.out.println("time : "+time);
			time++;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}			
	}

}
