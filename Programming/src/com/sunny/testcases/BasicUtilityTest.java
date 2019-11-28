package com.sunny.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sunny.utility.BasicUtility;

class BasicUtilityTest {

	@Test
	void testHarmonic() {
		double ex=BasicUtility.harmonicValue(5.0);
		double ac=2.283333333333333;
		assertEquals(ex,ac,0.0001);
	}
	@Test
	void testisPrime() {
		boolean ex=BasicUtility.isPrime(13);
		boolean ac=true;
		assertEquals(ex,ac);
	}
}
