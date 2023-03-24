package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	void testCharAt() {
		assertEquals('h', "hello".charAt(0));
		assertEquals('o', "hello".charAt(4));

	}
	@Disabled
	@Test
	void testIndexOutOfBoundsException() {  		
		assertEquals("", "hello".charAt(-1));
	}
	
	@Test
	void testCompareTo() {
		assertFalse("combo".compareTo("Combo") == 0);
		assertTrue("combo".compareTo("comics") < 0);
		
	}

	
	@Test
	void testCompareToIgnoreCase() {
		assertEquals(0, "Remote".compareToIgnoreCase("remote"));
		assertTrue("Remote".compareToIgnoreCase("remote") == 0);
		assertFalse("remote".compareTo("tv") == 0);
		assertEquals(0, "hello".compareToIgnoreCase("hello"));
	}

	
	@Test
	void testConcat() {
		assertEquals("Element", "Ele".concat("ment"));
		assertEquals("Element", "Element".concat(""));
	}

	
	@Test
	void testStartWith() {
		assertFalse("element".startsWith("Ele"));
		assertTrue("Element".startsWith(""));
		assertTrue("Element".startsWith("El"));
	}

	
	@Test
	void testEndWith() {
		assertFalse("element".endsWith("one"));
		assertTrue("Element".endsWith(""));
		assertTrue("Element".endsWith("ent"));
	}

	
	@Test
	void testContains() {
		assertTrue("Element".contains("Ele"));
		assertTrue("element".contains("e"));
		assertFalse("element".contains("z"));;
		assertTrue("element".contains(""));
	}

	
	@Test
	void testIndexOf() {
		assertEquals(0, "Element".indexOf("Ele"));
		assertEquals(0, "element".indexOf("e"));
		assertEquals(2, "element".indexOf("e", 1));
		assertEquals(-1, "element".indexOf("za"));
	}

	
	@Test
	void testLastIndexOf() {
		assertEquals(0, "Element".lastIndexOf("Ele"));
		assertEquals(4, "element".lastIndexOf("e"));
	}


}
