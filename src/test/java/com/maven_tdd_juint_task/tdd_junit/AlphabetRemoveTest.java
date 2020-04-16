package com.maven_tdd_juint_task.tdd_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class AlphabetRemoveTest {
	
	AlphabetRemove alphabetremove;
	
	@BeforeEach
	void setUp() {
		alphabetremove = new AlphabetRemove();
	}

	@Test
	void testRemove4() {
		assertEquals("BCD",alphabetremove.remove("ABCD"));
	}
	
	@Test
	void testRemove1() {
		assertEquals("CD",alphabetremove.remove("AACD"));
	}
	
	@Test
	void testRemove2() {
		assertEquals("BCD",alphabetremove.remove("BACD"));
	}
	
	@Test
	void testRemove3() {
		assertEquals("",alphabetremove.remove(""));
	}
	
	@Test
	void testRemove5() {
		assertEquals("",alphabetremove.remove("A"));
	}
	
	@Test
	void testRemove6() {
		assertEquals("B",alphabetremove.remove("B"));
	}
	
	@Test
	void testRemove7() {
		assertEquals("",alphabetremove.remove("AA"));
	}
	
	@Test
	void testRemove8() {
		assertEquals("B",alphabetremove.remove("BA"));
	}
	
	@Test
	void testRemove9() {
		assertEquals("B",alphabetremove.remove("AB"));
	}
	
	@Test
	void testRemove10() {
		assertEquals("BC",alphabetremove.remove("BC"));
	}
	
	@Test
	void testRemove11() {
		assertEquals("BAA",alphabetremove.remove("AABAA"));
	}
	
	@Test
	void testRemove12() {
		assertEquals("BBAA",alphabetremove.remove("BBAA"));
	}
	

}
