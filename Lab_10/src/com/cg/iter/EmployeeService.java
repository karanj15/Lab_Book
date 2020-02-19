package com.cg.iter;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeService {
	private List<Employee> set;
	private List<Department> deptset;
	public EmployeeService(List<Employee> set , List<Department> deptset) {
		this.set = set;
		this.deptset = deptset;
	}
	void sumSalary() {
		double sum = set.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println(sum);
	}
	void noOfEmployeeInEachDepartment() {
		Map<Department, Long> count = set.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		Set<Entry<Department,Long>> entryset = count.entrySet();
		for(Entry<Department,Long> entry :entryset) {
			System.out.println(entry.getKey().getDepartmentName()+" : "+entry.getValue());
		}
	}
	void empWithoutDept() {
		set.stream().filter(emp->emp.getDepartment()==null).forEach(System.out::println);
	}
	void sort(int field) {
		if(field==1) {
			Collections.sort(set,(e1,e2)->e1.getEmployeeid()-e2.getEmployeeid());
			System.out.println(set);
		}
		else if(field==2) {
			//Collections.sort(deptset,(e1,e2)->e1.getDepartmentId()-e2.getDepartmentId());
		}
		else {
			Collections.sort(set,(e1,e2)->e1.getFirstName().compareTo(e2.getFirstName()));
			System.out.println(set);
		}
	}


}
