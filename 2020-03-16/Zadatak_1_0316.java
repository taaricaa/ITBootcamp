package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Zadatak_1_0316 {
  @Test
  public void f() {
  }
  
  WebDriver wd = new ChromeDriver();
	@BeforeClass
	public void beforeClass() {
		wd.get("https://receptizatorte.rs/");
		wd.manage().window().maximize();
	}
	@Test
	public void verifyTitle() {
		String expectedTitle = "Torte recepti sa slikama - Recepti za torte";
		String actualTitle = wd.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@AfterClass
	public void afterClass() {
		wd.close();
	}
  
  
}
