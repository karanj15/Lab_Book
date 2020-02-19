package com.cg.iter;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



public class CalculatorTest {
	private static ICalculator calc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new CalculatorImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testAdd() {
		int sum= calc.add(22,33);
		assertEquals(55,sum);
		
	}

	@Test
	public void testSubtract() {
		int diff= calc.subtract(88,33);
		assertEquals(55,diff);

	}

	

	@Test
	public void testMultiply() {
		int prod= calc.multiply(33,3);
		assertEquals(99,prod);
		
	}


	@Test
	public void testDivide() {
		int quotient= calc.divide(100,10);
		assertEquals(10,quotient);
	}

}
