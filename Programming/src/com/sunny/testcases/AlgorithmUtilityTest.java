package com.sunny.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.sunny.utility.AlgorithmUtility;
/*
* created by:SunnyRaj
* Date 26/11/2019
* Purpose: this programm is used to test the outputs in Algorithm utility Class
**/
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
	@Test
	void testInsertionSort()
	{
		String[] array= {"sunny","ramu","bamu","chalu"};int f=array.length;
		String[] expected= {"bamu","chalu","ramu","sunny"};
		String[] output=AlgorithmUtility.insertionSort(array, f);
		assertArrayEquals(expected, output);
		
	}
	
}
