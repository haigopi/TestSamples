package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase_One {

	@Test
	public void test() {
		
		Addition a = new Addition();
		int c = a.m1(2, 3);
		
		assertEquals(c, 5);
		
	}
	
	@Test
	public void test1() {
		
		Addition a = new Addition();
		int c = a.m2(2, 3);
		
		assertEquals(c, 0);
		
	}

}
