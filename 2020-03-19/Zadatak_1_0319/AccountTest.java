package banka_kod;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AccountTest {
 
  
  SoftAssert sa = new SoftAssert();

	  	@Test
	  	public void testKontruktor() {
	  		
	  		String ime = "Tamara";
	  		String broj = "434-12-32";
	  		Account racun = new Account(ime, broj);
	  		
	  		sa.assertEquals(racun.getName(), ime);
	  		sa.assertEquals(racun.getNumber(), broj);
	  		sa.assertEquals(racun.getAmount(), 0d);
	  		
	  		sa.assertAll();
	  		
	  	}
	  	
	  	@Test
	  	public void test_b_SetGet() {
			
			SoftAssert sa = new SoftAssert();
			String ime = "tamara";
			String broj = "434-12-32";
			Account racun = new Account(ime, broj);
			double amount = 100.00;

			racun.setAmount(amount);
			sa.assertEquals(racun.getAmount(), amount);

			sa.assertAll();

		}

	  	
	  	@Test
	  	public void ispis() {
	  		Account racun;
	  		racun = new Account("tamara", "434-12-32");
	  		String ispis = racun.toString();
	  		sa.assertEquals(ispis, "434-12-32 tamara 0.00");
	  		System.out.println(ispis);
	  		sa.assertAll();

	  	}

	  	@Test
	  	public void testNumber() {
	  		Account[] racuni = new Account[100000];
	  		for (int i = 0; i < racuni.length; i++) {
	  			racuni[i] = new Account("tamara");
	  		}

	  		for (int i = 0; i < racuni.length; i++) {
	  			String broj = racuni[i].getNumber();
	  			for (int j = i + 1; j < racuni.length; j++) {
	  				sa.assertNotEquals(broj, racuni[j].getNumber());
	  			}
	  		}
	  		sa.assertAll();

	  	    
	    }
	  
  }

