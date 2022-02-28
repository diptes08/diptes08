package com.junit.testing.io;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPM {

	@Test
	void test() {
		Employee PM=new Employee();
		String output=PM.addPM("Ganesh");
		assertEquals("Ganesh",output);
		
	}

}
