package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
///Second
	@Before("@Netbanking")
	public void netBankingSetup() {
		System.out.println("**************************");
		System.out.println("setup entries in the netbanking database");
	}
	@After
	public void tearDown() {
		System.out.println("Clear The Entries");
	}
	@Before("@Mortgage")
	public void mortgageSetup() {
		System.out.println("**************************");
		System.out.println("setup entries in the mortgage database");
	}
}
