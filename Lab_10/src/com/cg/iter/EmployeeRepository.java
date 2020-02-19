package com.cg.iter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.time.LocalDate;

public class EmployeeRepository {

	public static void main(String[] args) {
		Department buss = new Department(0000, "Sales And Transport", 1111);
		Department fin = new Department(5952, "Finance", 2222);
		Department it = new Department(2453, "Product Development", 3333);
		Department comm = new Department(3356, "Infrastructure",4444 );
		
		List<Department> deptSet = new ArrayList<>();
		deptSet.add(buss);
		deptSet.add(fin);
		deptSet.add(it);
		deptSet.add(comm);
		
		List<Employee> set = new ArrayList<>();
		set.add(new Employee(1234, "Sachiket", "Behera", "skb@gmail.com", "9956456525", LocalDate.now(), "Manager", 126000.0, 1111,buss));
		set.add(new Employee(2234, "Silan", "Panda", "silan@gmail.com", "9922222525", LocalDate.now(), "Analyst", 30000.0, 2222, fin));
		set.add(new Employee(5234, "Sunil", "Pradhan", "sunil@gmail.com", "8250456525", LocalDate.now(), "SDE", 80000.0, 3333, it));
		set.add(new Employee(7234, "Nayan", "S", "n@gmail.com", "6055456525", LocalDate.now(), "SDE2", 160000.0, 4444, it));
		set.add(new Employee(9204, "Somya", "Prakash", "sompk@gmail.com", "8852456525", LocalDate.now(), "Tester", 20000.0, 6666, it));
		set.add(new Employee(6804, "snk", "Prakash", "snk@gmail.com", "9955556525", LocalDate.now(), "Typer", 4000.0, 0, it));
		
		EmployeeService es = new EmployeeService(set,deptSet);
		//es.sumSalary();
		es.noOfEmployeeInEachDepartment();
		//es.empWithoutDept();
		es.sort(3);
	
	}

}
