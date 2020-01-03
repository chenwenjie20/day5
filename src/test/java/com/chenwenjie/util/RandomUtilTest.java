package com.chenwenjie.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		
		for (int i = 0; i < 50; i++) {
			int j = RandomUtil.random(1, 3);
			
		}
		
	}

	
	@Test
	public void testSubRandom() {
		RandomUtil.subRandom(1, 10, 5);
	}
	
	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}
	
	@Test 
	public void testRandomString() {
		
		String string = RandomUtil.randomString(4);
		System.out.println(string);
	}
	
}
