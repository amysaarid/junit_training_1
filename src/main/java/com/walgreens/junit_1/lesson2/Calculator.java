
package com.walgreens.junit_1.lesson2;

public class Calculator {
	
	double total;
	
	public void add( double a, double b) {
		total = a + b;
	}
	
	public double getCurrentTotal() {
		return total;
	}
	
	public void clear() {
		total = 0;
	}
}


