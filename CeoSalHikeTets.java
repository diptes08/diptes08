package com.junit.testing.io;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeoSalHike{

	@Test
	void test() {
		Employee CEO=new Employee();
		double output=CEO.Salary(25000);
		assertEquals(30000,output);
	}

}
