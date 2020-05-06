package com.intiformation.sonar.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		assertEquals("L'addition est-elle correcte", 10, calculator.add(5, 5));
	}

	@Test
	public void testMul() {
		Calculator calculator = new Calculator();
		assertEquals("La multiplication est-elle correcte", 25, calculator.mul(5, 5));
	}

}
