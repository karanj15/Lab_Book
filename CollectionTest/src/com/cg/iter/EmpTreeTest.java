package com.cg.iter;

import java.util.Set;
import java.util.TreeSet;

public class EmpTreeTest  {

	public static void main(String[] args) {
		Set<Employee> empSet = new TreeSet<>();
		empSet.add(
				new Employee(4324,"Sukanya",9012341234L,"Developer"));
		empSet.add(
				new Employee(1498,"Ganesh",9082000234L,"Tester"));
		empSet.add(
				new Employee(5984,"Amit",9010041994L,"Manager"));
		empSet.add(
				new Employee(4124,"Ansuman",9042341234L,"Developer"));
		empSet.add(
				new Employee(2324,"Ashmita",9032300034L,"Ceo"));
		System.out.println(empSet);
	}

}
