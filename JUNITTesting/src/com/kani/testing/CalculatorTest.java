package com.kani.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addShouldReturnValue() {
		Calculator c1=new Calculator();
		assertEquals(5,c1.add(3, 2));
		
	}

	
}
