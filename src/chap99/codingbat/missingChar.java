package chap99.codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class missingChar {

	@Test
	void test() {
		assertEquals("ktten",missingChar("kitten",1));
		assertEquals("itten",missingChar("kitten", 0));
	}
	
	public String missingChar(String str, int n) {
		  String front = str.substring(0,n);
		  String back = str.substring(n+1, str.length());
		  return front + back;
		}

}
