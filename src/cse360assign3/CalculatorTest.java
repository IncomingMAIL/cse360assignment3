package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}

	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		calc.add(10);
		assertEquals(10, calc.getTotal());
		calc.add(-10);
		assertEquals(0, calc.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		calc.subtract(10);
		assertEquals(-10, calc.getTotal());
		calc.subtract(-10);
		assertEquals(0, calc.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		calc.multiply(10);
		assertEquals(0, calc.getTotal());
		calc.add(1);
		assertEquals(1, calc.getTotal());
		calc.multiply(10);
		assertEquals(10, calc.getTotal());
		calc.multiply(-10);
		assertEquals(-100, calc.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		calc.divide(10);
		assertEquals(0, calc.getTotal());
		calc.add(10);
		assertEquals(10, calc.getTotal());
		calc.divide(10);
		assertEquals(1, calc.getTotal());
		calc.divide(0);
		assertEquals(0, calc.getTotal());
	}

	@Test
	public void testGetHistory() {
		Calculator calc = new Calculator();
		assertEquals("0", calc.getHistory());
		calc.add(4);
		calc.subtract(2);
		calc.multiply(2);
		calc.divide(1);
		calc.add(10);
		assertEquals("0 + 4 - 2 * 2 / 1 + 10", calc.getHistory());
	}

}