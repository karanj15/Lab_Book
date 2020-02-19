package com.cg.iter.sync;

public class SyncTest {

	public static void main(String[] args) {
		SharedInterface so = new SharedObject();
		Runnable prod = new Producer(so);
		Runnable cons = new Consumer(so);
		new Thread(prod).start();
		new Thread(cons).start();
	}

}
