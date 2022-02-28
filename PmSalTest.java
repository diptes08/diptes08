package com.junit.testing.io;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PmSalTest {

	@Test
	void test() {
		Employee PM=new Employee();
		double output=PM.Salary(33000);
		assertEquals(41000,output);
	}

}
