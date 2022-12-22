package ISOA03_2022.Problem1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTestDecision {

	@Test
	public void testIsLeap1() throws DateException {
		Date d = new Date (28,2,2020);
		assertEquals(d.isLeap(),true);
		d.setYear(1999);
		assertNotEquals(d.isLeap(),true);
	}
	
	@Test
	public void testIsLeap2() throws DateException {
		Date d = new Date (27,5,1999);
		assertEquals(d.isLeap(),false);
		d.setYear(2020);
		assertNotEquals(d.isLeap(),false);
	}
	
	@Test
	public void testIsLeap3() throws DateException {
		Date d = new Date (30,6,2001);
		assertEquals(d.isLeap(),false);
		d.setYear(2022);
		assertNotEquals(d.isLeap(),true);
	}

}
