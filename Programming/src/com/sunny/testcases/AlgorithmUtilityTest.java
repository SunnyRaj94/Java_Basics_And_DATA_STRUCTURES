package com.sunny.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.sunny.utility.AlgorithmUtility;

class AlgorithmUtilityTest {

	
	@Test
	void testFindWord() throws IOException
	{
		boolean ex=AlgorithmUtility.findWord("class");
		boolean ac=true;
		assertEquals(ex,ac);
	}
	@Test
	void testAnnagram() throws IOException
	{
		boolean ex=AlgorithmUtility.isAnagramString("dog","god");
		boolean ac=true;
		assertEquals(ex,ac);
	}
	@Test
	void testPalindrom() throws IOException
	{
		boolean ex=AlgorithmUtility.isPalindromeInteger(999);
		boolean ac=true;
		assertEquals(ex,ac);
	}
	@Test
	void testPrime() throws IOException
	{
		boolean ex=AlgorithmUtility.isPrime(5);
		boolean ac=true;
		assertEquals(ex,ac);
	}
	
}
