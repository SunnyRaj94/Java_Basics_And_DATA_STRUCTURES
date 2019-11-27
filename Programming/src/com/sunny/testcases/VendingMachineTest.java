package com.sunny.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sunny.junit_testing.VendingMachine;

class VendingMachineTest {

	@Test
	void testChange() 
	{	
		VendingMachine v = new VendingMachine();
		String line2 = "Thankyou for using our service";
		String exresult=v.change(3000,7);
		assertEquals(line2,v.change(3000, 7));

}
}