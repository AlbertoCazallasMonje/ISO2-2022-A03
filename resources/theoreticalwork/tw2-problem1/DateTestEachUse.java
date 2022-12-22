package ISOA03_2022.Problem1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTestEachUse {

	@Test
	public void testEachUse1() throws DateException {
		Date d = new Date (28,2,2020);
		assertEquals(d.isLeap(),true);
		
	}
	@Test
	public void testEachUse2() throws DateException {
		Date d = new Date (27,5,1999);
		assertEquals(d.isLeap(),false);
		
	}

}
