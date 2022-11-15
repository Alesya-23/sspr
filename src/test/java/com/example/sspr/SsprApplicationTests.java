package com.example.sspr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SsprApplicationTests {

	@Test
	public void test(){
		int x = 2;
		int y = 23;
		assertEquals(46, x*y);
	}

	@Test
	public void test2(){
		int x = 3;
		int y = 23;
		assertEquals(26, x+y);
	}

	@Test
	public void test3(){
		int x = 44;
		int y = 11;
		assertEquals(4, x/y);
	}

}
