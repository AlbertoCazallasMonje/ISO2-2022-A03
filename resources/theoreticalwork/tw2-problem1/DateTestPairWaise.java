package ISOA03_2022.Problem1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTestPairWaise {

	@Test
	public void testPairWaise1() throws DateException {
		Date d = new Date (28,2,2020);
		assertEquals(d.isLeap(),true);
	}
	
	@Test
	public void testPairWaise2() throws DateException {
		Date d = new Date (27,5,1999);
		assertEquals(d.isLeap(),false);
	}
	@Test
	public void testPairWaise3() throws DateException {
		Date d = new Date (31,4,1994);
		assertEquals(d.isLeap(),false);
	}
	@Test
	public void testPairWaise4() throws DateException {
		Date d = new Date (20,11,1975);
		assertEquals(d.isLeap(),false);
	}
	@Test
	public void testPairWaise5() throws DateException {
		Date d = new Date (12,8,1492);
		assertEquals(d.isLeap(),true);
	}
	@Test
	public void testPairWaise6() throws DateException {
		Date d = new Date (29,2,2020);
		assertEquals(d.isLeap(),true);
	}
	@Test
	public void testPairWaise7() throws DateException {
		Date d = new Date (31,4,2017);
		assertEquals(d.isLeap(),false);
	}
	@Test
	public void testPairWaise8() throws DateException {
		Date d = new Date (0,13,2020);
		assertEquals(d.isLeap(),false);
	}
	@Test
	public void testPairWaise9() throws DateException {
		Date d = new Date (14,3,-2020);
		assertEquals(d.isLeap(),false);
	}

}
