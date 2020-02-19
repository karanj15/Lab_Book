package com.cg.iter;

public class Bus extends Vehicle implements Movable {

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(int tyres, double cost, String type){
		super(tyres,cost,type);
//		System.out.println("Car tyres: "+tyres);
//		System.out.println("Car cost: "+cost);
//		System.out.println("Car type: "+type);
//	
}
	public String toString() {
		return "Bus []" + super.toString();
	}
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bus is moving");
	}
	
	
	}
 
	

