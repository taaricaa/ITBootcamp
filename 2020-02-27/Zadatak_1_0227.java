package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_1_0227 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();

		wd.get("https://itbootcamp.rs/");

		Dimension dimenzije = wd.manage().window().getSize();
		System.out.println(dimenzije);

		wd.manage().window().maximize();
		System.out.println(wd.manage().window().getSize());
		
		wd.navigate().refresh();

		wd.manage().window().setSize(dimenzije);
		
		System.out.println(wd.manage().window().getSize());

		wd.navigate().to("https://www.w3schools.com/");

		String url = wd.getCurrentUrl();
		System.out.println(url);

		wd.navigate().back();

		wd.navigate().forward();

		String naslov = wd.getTitle();
		System.out.println(naslov);
		
		  int PageLength= naslov.length();
	      System.out.println(PageLength);

		wd.close();

	}

}
