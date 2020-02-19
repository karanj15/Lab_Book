package com.cg.iter;

import java.util.Scanner;

public class TravelMain {
	
	public static void main(String[] args) {
		Vehicle c= new Car(5,1000000, "Swift");//Car object
		System.out.println(c);
		//c.setTyres(5);
		//System.out.println("car tyres= "+ c.getTyres());
		//c.setCost(5000000);
		//System.out.println("Car cost="+ c.getCost);
		//c.setType(SUV);
		//System.out.println("Car type="+ c.getType);
		
		Vehicle b= new Bus(7,900000, "School bus"); //Bus object
		System.out.println(b);
		//b.setTyres(7);
		//System.out.println("bus tyres =" +b.getTyres());
		//b.Cost(70000000000);
		//System.out.println("bus Cost =" +b.getCost());
		//b.setType(7);
		//System.out.println("bus type=" +b.getType());
		Vehicle v=new Car(5,1000000, "Swift");
		Vehicle v1= new Bus(7,900000, "School bus");
		System.out.println(c==v);
		System.out.println(c.equals(v));
		System.out.println(b==v1);
		System.out.println(b.equals(v1));
	Vehicle t= new Truck();
	System.out.println(c.equals(t));
//	Movable c1= new Car();
//	c1.move();
//	Movable b1= new Bus();
//	b1.move();
//	Movable t1= new Truck();
//	t1.move();
	Scanner in= new Scanner(System.in);
	System.out.println("Enter type of vehicle");
	String type=in.nextLine();
		Movable m = MovableFactory.getInstance(type);
		if(m!=null)
		m.move();
		else
			System.out.println(type + " not found");

	}

}
