package com.cg.iter;

public class Cubes {

	public static int Cubes(int n) {
		int z =(n * (n + 1) )/ 2;

		return z * z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(Cubes(n));
	}

}
