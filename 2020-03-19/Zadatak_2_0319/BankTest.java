package banka_kod;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BankTest {
	Bank mobi;
	SoftAssert sa;

	@BeforeClass
	public void start() {
		mobi = new Bank();
		sa = new SoftAssert();
	}

	@Test
	public void testAccount() {
		mobi.reset();
		Account[] accounts = new Account[5];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = mobi.openAccount("tamara");
		}
		for (int i = 0; i < accounts.length; i++) {
			sa.assertEquals(accounts[i], mobi.getAccount(accounts[i].getNumber()));
		}
		sa.assertAll();
	}

	
	@Test
	public void dodaj() {
		Bank bank = new Bank();
		Account a1 = bank.openAccount("tamara");
		a1.setAmount(10d);
		
		bank.payInMoney(a1.getNumber(), 30d);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a1.getAmount(), 40d);
		
		sa.assertAll();

	}

	@Test
	public void testPay() {
		mobi.reset();
		Account a = mobi.openAccount("pera");
		mobi.payInMoney(a.getNumber(), 1000d);
		sa.assertEquals(a.getAmount(), 1000d);
		sa.assertAll();
	}
	
	@Test
	public void transfer() {
		Bank bank = new Bank();
		Account a1 = bank.openAccount("tamara");
		Account a2 = bank.openAccount("sanja");
		a1.setAmount(100d);

		bank.transferMoney(a1.getNumber(), a2.getNumber(), 50d);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a1.getAmount(), 50d);
		sa.assertEquals(a2.getAmount(), 50d);

		sa.assertAll(); 
	}
	@Test
	public void sum() {
		
		Bank bank = new Bank();
		Account a1 = bank.openAccount("tamara");
		Account a2 = bank.openAccount("sanja");
		Account a3 = bank.openAccount("nina");
		a1.setAmount(10d);
		a2.setAmount(20d);
		a3.setAmount(30d);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(bank.getSumMoney(), 800d);

		sa.assertAll();
	
}
}