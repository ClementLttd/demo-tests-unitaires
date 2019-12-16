package dev.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testStringUtils1() {
		int d;
		
		d=StringUtils.levenshteinDistance("jva", "java");
		assertEquals(1, d);
	}
	@Test
	public void testStringUtils2() {
		int d;
		
		d=StringUtils.levenshteinDistance("lod", "java");
		assertEquals(4, d);
	}
	@Test
	public void testStringUtilsNull() {
		int d;
		
		d=StringUtils.levenshteinDistance(null, "java");
		assertEquals(0, d);
	}

}
