package org.java.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcolatriceTest {
	
	private Calcolatrice c;
	
	@BeforeEach
	public void init() {
		final float num1 = 40;
		final float num2 = 10;
		
		c = new Calcolatrice(num1, num2);
	}
	
	@Test
	public void getAddTest() {
		
		final float attRes = c.getNum1() + c.getNum2();
		
		final float res = c.add();
		
		assertEquals(attRes, res, "Addizione tra interi");
	}
	
	@Test
	public void getSubtractTest() {
		
		final float attRes = c.getNum1() - c.getNum2();
		
		final float res = c.subtract();
		
		assertEquals(attRes, res, "Differenza tra interi");
	}
	
	@Test
	public void getDivideTest() {
		
		final float attRes = c.getNum1() / c.getNum2();
		
		final float res = c.divide();
		
		assertEquals(attRes, res, "divisione tra interi");
	}
	
	@Test
	public void getMultiplyTest() {
		
		final float attRes = c.getNum1() * c.getNum2();
		
		final float res = c.multiply();
		
		assertEquals(attRes, res, "divisione tra interi");
	}
	
}
