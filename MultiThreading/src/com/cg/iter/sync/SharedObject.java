package com.cg.iter.sync;

public class SharedObject implements SharedInterface {
	private int data;

	 synchronized public int getData() {
		 notify();
		 int temp= data;
		System.out.println(" got: " + temp);
		try {
			wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	synchronized public void setData(int data) {
		notify();
		this.data= data;
		System.out.println("set: "+data);
		try {
			wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.data = data;
	}

}
