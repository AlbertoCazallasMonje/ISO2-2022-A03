package banco;

import org.junit.Test;

public class BankLogicTest {
	//***********
	//Tests
	//***********
	@Test //  Test suit 1
	public void testDetermineAccountTypeYoungCustomer6() {
             	BirthDate birth = new BirthDate(1995,5,5);
            	Customer c = new Customer(birth, false, true,false);
            	BankAccountType tipo = BankLogic.determineAccountTypeYoungCustomer(c);
            	org.junit.Assert.assertEquals(BankAccountType.WelcomeToAdultLife, tipo );
	}
	@Test // Test suit 2
	public void testDetermineAccountTypeYoungCustomer4() {
	           BirthDate birth = new BirthDate(2002,5,5);
	           Customer c = new Customer(birth, false, true, false);
	           BankAccountType tipo = BankLogic.determineAccountTypeYoungCustomer(c);
             org.junit.Assert.assertEquals(BankAccountType.JumpOutOfTheNest, tipo );
	}
	

	@Test // Test suit 3
	public void testDetermineAccountTypeYoungCustomer3() {
          	  BirthDate birth = new BirthDate(2002,5,5);
	            Customer c = new Customer(birth, false, true,true);
            	BankAccountType tipo = BankLogic.determineAccountTypeYoungCustomer(c);
             	org.junit.Assert.assertEquals(BankAccountType.SaveNowWhileYouCan, tipo );
	}
	
	@Test//  Test suit 4
	public void testDetermineAccountTypeYoungCustomer5() {
            	BirthDate birth = new BirthDate(1995,5,5);
            	Customer c = new Customer(birth, false, true,true);
            	BankAccountType tipo = BankLogic.determineAccountTypeYoungCustomer(c);
             	org.junit.Assert.assertEquals(BankAccountType.BecomeIndependentItsAboutTime, tipo );
	}
	@Test //  Test suit 5
	public void testDetermineAccountTypeYoungCustomer2() {
            	BirthDate birth = new BirthDate(2002,5,5);
             	Customer c = new Customer(birth, true, false,false);
            	BankAccountType tipo = BankLogic.determineAccountTypeYoungCustomer(c);
             	org.junit.Assert.assertEquals(BankAccountType.ComeOnYouCan, tipo );
	}
	@Test // Test suit 6
	public void testDetermineAccountTypeYoungCustomer() {	
             	BirthDate birth = new BirthDate(2005,5,5);
             	Customer c = new Customer(birth, true, false,true);
             	BankAccountType tipo = BankLogic.determineAccountTypeYoungCustomer(c);
            	org.junit.Assert.assertEquals(BankAccountType.Comfort, tipo );
	}
}
