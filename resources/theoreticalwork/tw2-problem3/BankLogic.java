package banco;

enum BankAccountType {
	   Comfort, ComeOnYouCan, SaveNowWhileYouCan, JumpOutOfTheNest,
	   BecomeIndependentItsAboutTime, WelcomeToAdultLife
	}

public class BankLogic {

	   public static BankAccountType determineAccountTypeYoungCustomer(Customer c) {
	       // (1) is minor, studying, residency with parents -> Comfort account
	       if (c.getBirthDate().getAge() < 18 &&
	               c.isStudent() &&
	               c.isPermanentResidencyWithParents())
	           return BankAccountType.Comfort;


	       // (2) under 25, studying, residency not with parents -> ComeOnYouCan account
	       else if (c.getBirthDate().getAge() < 25 &&
	               c.isStudent() &&
	               !c.isPermanentResidencyWithParents())
	           return BankAccountType.ComeOnYouCan;

	       // (3.1) 18 and above, working, residency with parents -> SaveNowWhileYouCan account
	       else if (c.getBirthDate().getAge() >= 18 &&
	               c.getBirthDate().getAge() < 25 &&
	               c.isWorking() &&
	               c.isPermanentResidencyWithParents())
	           return BankAccountType.SaveNowWhileYouCan;

	       // (3.2) 18 and above, working, residency not with parents -> SaveNowWhileYouCan account
	       else if (c.getBirthDate().getAge() >= 18 &&
	               c.getBirthDate().getAge() < 25 &&
	               c.isWorking() &&
	               !c.isPermanentResidencyWithParents())
	           return BankAccountType.JumpOutOfTheNest;

	       // (4) 25 and above, working, residency with parents -> BecomeIndependentItsAboutTime account
	       else if (c.getBirthDate().getAge() >= 25 &&
	               c.isWorking() &&
	               c.isPermanentResidencyWithParents())
	           return BankAccountType.BecomeIndependentItsAboutTime;

	       // (5) 25 and above, working, residency not with parents -> WelcomeToAdultLife account
	       else if (c.getBirthDate().getAge() >= 25 &&
	               c.isWorking() &&
	               !c.isPermanentResidencyWithParents())
	           return BankAccountType.WelcomeToAdultLife;

	       // This code is only executed, if the customer is NOT applicable for a Young Account
	       throw new IllegalArgumentException("Account is not applicable for a young account.");
	   }

	}

