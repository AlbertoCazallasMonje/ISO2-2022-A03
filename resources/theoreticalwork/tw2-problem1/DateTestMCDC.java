package ISOA03_2022.Problem1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTestMCDC {

	@Test
	public void testMCDC_1() throws DateException {
		Date d = new Date (28,2,2020);
		assertEquals(d.isLeap(),true);
		
		d.setYear(0);
		assertNotEquals(d.isLeap(),false);
		
		d.setYear(1492);
		assertNotEquals(d.isLeap(),false);
		
		d.setYear(2022);
		assertNotEquals(d.isLeap(),true);
		
	}
	
	@Test
	public void testMCDC_2() throws DateException {
		Date d = new Date (27,5,1999);
		assertEquals(d.isLeap(),false);
		
		d.setYear(0);
		assertNotEquals(d.isLeap(),false);
		
		d.setYear(1492);
		assertNotEquals(d.isLeap(),false);
		
		d.setYear(2022);
		assertNotEquals(d.isLeap(),true);
		
	}
	
	

}
