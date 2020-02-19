package com.cg.iter;

public class MovableFactory {

	public static Movable getInstance(String type)
	{
		Movable m = null;
		final int age=18;
if("car".equalsIgnoreCase(type))
{
	m = new Car();
}
else if("bus".equalsIgnoreCase(type))
{
	m = new Bus();
}	
else if("truck".equalsIgnoreCase(type))
{
	m = new Truck();
}
else{
	//m= new UnknownVehicle();
	//local, inner, anonymous class
	m= new Movable(){

		public void move() {
			System.out.println(age);
			System.out.println("Anon vehicle moving..");
			
		}
		
	};
}
		return m;
	}
	private static class UnknownVehicle implements Movable
	{

		public void move() {

System.out.println("UnknownVehicle moving...");
			
		}
	}
}
