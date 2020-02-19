package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

public class employeeInsuranceSystem implements EmployeeService{
	//employeeInsuranceSystem empService;
	public employeeInsuranceSystem() {
		Scanner sc = new Scanner(System.in);
		Employee newEmp = setDetails(sc);
		String insuranceScheme = findInsuranceScheme(newEmp.getSalary(), newEmp.getDesignation());
		System.out.println("Your insurance scheme for salary rupees "+newEmp.getSalary()+" and designation "+newEmp.getDesignation()+" is "+insuranceScheme);
		newEmp.setInsuranceScheme(insuranceScheme);
		displayDetails(newEmp);
	}

	public static void main(String[] args) {
		new employeeInsuranceSystem();
	}

	@Override
	public Employee setDetails(Scanner sc) {
		System.out.println("Enter <id> <name> <salary> <designation> ");
		int id = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		int salary = sc.nextInt();
		sc.nextLine();
		String designation = sc.nextLine();
		Employee emp = new Employee();
		emp.setDesignation(designation);
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		
		return emp;
	}


	@Override
	public void displayDetails(Employee emp) {
		System.out.println(emp);
	}

	@Override
	public String findInsuranceScheme(int Salary, String Designation) {
		
		if(Designation.equals("System Associate") && Salary>5000 && Salary<20000)return "Scheme C";
		else if(Designation.equals("Programmer") && Salary>=20000 && Salary<40000)return "Scheme B";
		else if(Designation.equals("Manager") && Salary>=40000)return "Scheme A";	
		return "No Scheme";
		
	}

}
