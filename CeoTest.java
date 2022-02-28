package com.junit.testing.io;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeoTest {

	@Test
	void test() {
		Employee CEO=new Employee();
		String output=CEO.addCEO("Deepak Chahar");
		assertEquals("Deepak Chahaar",output);
	}

}
