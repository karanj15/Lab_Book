package com.cg.iter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpListTest {
	public static void main(String[] args) {
		List<Employee> empList= new ArrayList<Employee>();
		empList.add(
				new Employee(4324,"Sukanya",9012341234L,"Developer"));
		empList.add(
				new Employee(1498,"Ganesh",9082000234L,"Tester"));
		empList.add(
				new Employee(5984,"Amit",9010041994L,"Manager"));
		empList.add(
				new Employee(4124,"Ansuman",9042341234L,"Developer"));
		empList.add(
				new Employee(2324,"Ashmita",9032300034L,"Ceo"));
		System.out.println(empList);
		System.out.println("Sorted by ID:");
		//Collections.sort(empList, new EmpComparator("SortField.ID"));
		Collections.sort(empList,(e1,e2) -> e1.getId()-e2.getId());
		System.out.println(empList);
		System.out.println("Sorted by Name:");
		Collections.sort(empList, new EmpComparator("SortField.NAME"));
		System.out.println(empList);
		System.out.println("Sorted by Mobile:");
		Collections.sort(empList, new EmpComparator("SortField.MOBILE"));
		System.out.println(empList);
		empList.stream().filter(e->e.getDesignation().equals("Developer"))
		.forEach(System.out::print);
		empList.hashCode();
		System.out.println(empList);
	}

}
