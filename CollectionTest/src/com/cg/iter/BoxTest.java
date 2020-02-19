package com.cg.iter;

public class BoxTest {

	public static void main(String[] args) {

Box<Integer> b1= new Box<Integer>();
b1.setData(20);
System.out.println("Box data: " + b1.getData());
Box<String> b2= new Box<String>();
b2.setData("ITER");
System.out.println("Box data: " + b2.getData());


	}

}
