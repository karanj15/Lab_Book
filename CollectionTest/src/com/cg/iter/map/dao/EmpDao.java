package com.cg.iter.map.dao;

import com.cg.iter.Employee;

public interface EmpDao {

	boolean addEmp(Employee emp);

	Employee getEmp(int id);

}