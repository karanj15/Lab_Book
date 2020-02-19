package com.cg.iter.map;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.iter.Employee;
import com.cg.iter.map.dao.EmpDaoImpl;

public class MapTest {
	EmpDaoImpl eDao;
	public MapTest() {
		eDao = new EmpDaoImpl();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		while (true) {
			choice = getChoice(scan);
			switch (choice) {
			case 1:
				System.out.println(" Add Employee");
				Employee emp = null;
				System.out.println("Enter <id> <name> <mobile> <designation>");
				emp = new Employee(scan.nextInt(), scan.next(),
						  scan.nextLong(), scan.next());
				boolean success = eDao.addEmp(emp);
				if(success)
				    System.out.println("Added emp");
				else
					System.out.println("Failed to add");
				break;
			case 2:
				System.out.println(" Find Employee");
				System.out.println("Enter id of Employee");
				int id = scan.nextInt();
				Employee em = eDao.getEmp(id);
				System.out.println(em);
				break;
			case 3:
				System.out.println(" Delete Employee");
				break;
			case 4:
				System.out.println("Exiting system. Thank you");
				System.exit(0);
				break;

			default:
				System.out.println("Choose 1 to 4 only");
				break;
			}
		}
	}

	private int getChoice(Scanner scan) {
		int choice = 0;
		System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
		System.out.println("1. Add Employee");
		System.out.println("2. Find Employee");
		System.out.println("3. Delete Employee");
		System.out.println("4. Exit system");
		System.out.println("Enter your choice");
		try {
		choice = scan.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("Please enter a number");
		}
		return choice;
	}

	public static void main(String[] args) {
		new MapTest();
	}

}