package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase_Two {

	@Test
	public void test() {
		Addition a = new Addition();
		int c = a.m3(5, 3);
		
		assertEquals(c, 2);
	}

}
