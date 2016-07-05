package com.walgreens.junit_1.lesson2;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	static Calculator calculator;
	
	@BeforeClass   // MUST BE STATIC - IT RUNS *BEFORE* THE CLASS IS CREATED
	public static void beforeClass() {
		calculator = new Calculator();
	}
	
	@After
	public void afterMethod() {
		calculator.clear();
	}
	
	@Test
	public void addTest_1() {
		calculator.add(1.5, 6.5);
		Assert.assertEquals("ERROR", 8.0, calculator.getCurrentTotal(), 0.01); // message, expected, actual, delta
	}
	
	@Test
	public void test_after() {
		// the total should be 0 because the @After method ran when our @Test completed
		Assert.assertEquals("ERROR", 0.0, calculator.getCurrentTotal(), 0.01); // message, expected, actual, delta
	}
	
	@Test(timeout=1000)
	public void timer_test() {
		int i=0;
		while (true) {
			i++;
		}
	}
}


