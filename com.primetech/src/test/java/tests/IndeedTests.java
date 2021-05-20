package tests;

import org.testng.annotations.Test;

import utilities.Driver;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class IndeedTests {
	String url = "https://indeed.com";
	

	@BeforeMethod
	public void beforeMethod() {
		Driver.getDriver().manage().window().maximize();
		
	}

	@Test
	public void test1() {
		Driver.getDriver().get(url);
		
	}
	
	@Test
	public void test2() {
		Driver.getDriver().get("https://amazon.com");
		
	}
	
	@Test
	public void test3() {
		Driver.getDriver().get("https://etsy.com");
		
	}
	
	@Test
	public void test4() {
		Driver.getDriver().get("https://saucedemo.com");
		
	}

	@AfterMethod
	public void afterMethod() {
		Driver.closeDriver();
	}

}
