package com.sunny.junit_testing.testcases;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.sunny.junit_testing.Programm.VendingMachine;
import com.sunny.utility.LogicalUtility;

class VendingMachineTest {

	@Test
	void testChange() 
	{	
		VendingMachine v = new VendingMachine();
		int count = LogicalUtility.inputInteger();
		int notes = LogicalUtility.inputInteger();
		//String line1 = "you got  "+count+"  "+notes+"rupee notes";
		String line2 = "Thankyou for using our service";
		//String result = line1 + "\n" + line2;
		int amount= LogicalUtility.inputInteger();
		String exresult=v.change(amount,7);
		
		//System.out.println(exresult);
		//System.out.println(result);
		//assertEquals("message",result, result.equals(exresult));
		//String s1="ram";
		//String s2="ram";
		assertTrue(line2,exresult.equals(line2));

}
}