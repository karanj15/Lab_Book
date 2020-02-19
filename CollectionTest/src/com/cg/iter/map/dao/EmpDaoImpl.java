package com.cg.iter.map.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.iter.Employee;

public class EmpDaoImpl implements EmpDao {
    private Map<Integer, Employee> empMap = new HashMap<>();
    
    public EmpDaoImpl()
    {
    	empMap.put(9988, new Employee(9988, "Vikash", 9012121212L, "Manager"));
    }

	@Override
	public boolean addEmp(Employee emp) {
		Employee e = empMap.put(emp.getId(), emp);
		System.out.println(e);// null if not present earlier
		return true;
	}

	@Override
	public Employee getEmp(int id) {
		return empMap.get(id);
	}
    
}