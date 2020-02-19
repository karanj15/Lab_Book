package com.cg.iter.map.dao;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.iter.Employee;

public class EmpDaoTest {
	private static EmpDaoImpl eDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		eDao = new EmpDaoImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testAddEmp() {
		boolean success = eDao.addEmp( new Employee(1234,"Amit", 90112341234L, "Manager"));
		assertTrue(success);
		
	}

	@Test
	public void testGetEmp() {
		Employee emp= eDao.getEmp(9988);
		assertNotNull(emp);
		
	}

}
