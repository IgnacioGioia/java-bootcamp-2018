package com.igioia.topic1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MyTest {
	
	@Test
    public void appTest() {
		MyClass tester = new MyClass();
		
		
        assertEquals(true, tester.getFlag());
    }
}
