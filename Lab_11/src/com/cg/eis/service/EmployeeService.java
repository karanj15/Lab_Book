package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	Employee setDetails(Scanner sc);
	String findInsuranceScheme(int Salary,String Designation);
	void displayDetails(Employee emp);
	
}
