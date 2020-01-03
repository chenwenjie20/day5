package com.chenwenjie.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength("");
		System.out.println(b);
	}

	@Test
	public void testHasTest() {
		boolean b = StringUtil.hasTest(".");
		System.out.println(b);
	}
	
	@Test
	public void testRandomChineseString2() {
		String name = StringUtil.randomChineseString();
		System.out.println(name);
	}
	
	@Test
	public void testRandomChineseString() {
		String name = StringUtil.randomChineseString(1000);
		System.out.println(name);
	}
	
	
	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
		
	}
	
	@Test
	public void testIsPhoneNumber() {
		
		boolean b = StringUtil.isPhoneNumBer("13661304697");
		System.out.println(b);
		
	}
	
	@Test
	public void testlsEMail() {
		boolean b = StringUtil.isEMail("762942105@qq.com");
		System.out.println(b);
	}
	
}
