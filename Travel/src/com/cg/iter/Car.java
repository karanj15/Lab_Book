package com.cg.iter;
/**
 * 
 * @author Karan
 * @see Vehicle
 *This class represents a Car and inherits from Vehicle
 */
public class Car extends Vehicle implements Movable
{

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
public Car(int tyres, double cost, String type){
	super(tyres,cost,type);
//		System.out.println("Car tyres: "+tyres);
//		System.out.println("Car cost: "+cost);
//		System.out.println("Car type: "+type);
//	
}

public String toString() {
	return "Car []" + super.toString();
}

public void move() {
	System.out.println("Car is moving");
	// TODO Auto-generated method stub
	
}
}
