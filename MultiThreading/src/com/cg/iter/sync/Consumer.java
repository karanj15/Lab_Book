package com.cg.iter.sync;

public class Consumer implements Runnable {
private SharedInterface so;
	public Consumer(SharedInterface so) {
		this.so= so;
	}

	@Override
	public void run() {
		for(int i=0; i< 10; i++)
		{
			int data= so.getData();
	}

}
}
