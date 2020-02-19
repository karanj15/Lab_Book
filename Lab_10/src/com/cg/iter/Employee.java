package com.cg.iter;
import java.time.LocalDate;

public class Employee {
	String delim = System.getProperty("line.separator");
	private int employeeid;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private LocalDate date;
	private String designation;
	private double salary;
	private int managerId;
	private Department department;
	public Employee(int employeeid, String firstName, String lastName, String email, String phoneNumber, LocalDate date,
			String designation, double salary, int managerId, Department department) {
		
		this.employeeid = employeeid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.date = date;
		this.designation = designation;
		this.salary = salary;
		this.managerId = managerId;
		this.department = department;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return delim+"employeeid=" + employeeid + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", date=" + date + ", designation=" + designation
				+ ", salary=" + salary + ", managerId=" + managerId + ", department=" + department ;
	}
	
}
