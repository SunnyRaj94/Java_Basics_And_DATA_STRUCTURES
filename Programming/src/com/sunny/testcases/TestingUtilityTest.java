package com.sunny.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sunny.utility.TestingUtility;

class TestingUtilityTest {

	@Test
	void testDayOfWeek() {
		int ex=TestingUtility.dayOfWeek(2, 5, 1998);
		int ac=6;
		assertEquals(ex,ac);
	}

	@Test
	void testSqrt() {
		double ex=TestingUtility.sqrt(5.0);
		double ac=2.23606797749979;
		assertEquals(ex,ac,0.00001);
	}

	@Test
	void testMonthlyPayment() {
		double ex=TestingUtility.monthlyPayment(1000.0,5.0,4.0);
		double ac=18.41652205526597;
		assertEquals(ex,ac,0.00001);
	}

}
