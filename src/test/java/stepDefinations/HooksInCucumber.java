package stepDefinations;

import cucumber.api.java.Before;

public class HooksInCucumber {
	@Before
	public void netBankingApplication() {
		System.out.println("Net banking applications");
	}
	public void mortageApplication() {
		System.out.println("Mortage applications ");
	}
}
