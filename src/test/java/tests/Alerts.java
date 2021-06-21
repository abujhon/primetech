package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.BrowserUtils;
import utilities.Driver;

public class Alerts {
	BrowserUtils utils = new BrowserUtils();
	
	@BeforeMethod
	public void beforeMethod() {
		Driver.getDriver();
		Driver.getDriver().manage().window().maximize();
		
	}
	
	@AfterMethod
	public void afterMethod() {
		Driver.closeDriver();
	}
	
	
  @Test
  public void test() throws InterruptedException {
	  Driver.getDriver().get("https://demoqa.com/alerts");
	  WebElement clickMe1 = Driver.getDriver().findElement(By.id("alertButton"));
	  clickMe1.click();
	  Thread.sleep(1000);
	  utils.waitUntilAlertIsPresent();
	  
	  Alert handleAlert = Driver.getDriver().switchTo().alert();
	  System.out.println("Alert message is: " + handleAlert.getText());
	  handleAlert.accept();
	  Thread.sleep(3000);
	  System.out.println("Alert is accepted.");
	  
  }
  
  @Test
  public void test2() throws InterruptedException {
	  Driver.getDriver().get("https://demoqa.com/alerts");
	  WebElement clickMe1 = Driver.getDriver().findElement(By.id("timerAlertButton"));
	  clickMe1.click();
	 
	  utils.waitUntilAlertIsPresent();
	  
	  Alert handleAlert = Driver.getDriver().switchTo().alert();
	  System.out.println("Alert message is: " + handleAlert.getText());
	  handleAlert.accept();
	  Thread.sleep(3000);
	  System.out.println("Alert is accepted.");
	  
  }
  
  @Test
  public void test3() throws InterruptedException {
	  Driver.getDriver().get("https://demoqa.com/alerts");
	  WebElement clickMe1 = Driver.getDriver().findElement(By.id("confirmButton"));
	  clickMe1.click();
	 
	  utils.waitUntilAlertIsPresent();
	  
	  Alert handleAlert = Driver.getDriver().switchTo().alert();
	  System.out.println("Alert message is: " + handleAlert.getText());
	  handleAlert.dismiss();
	  Thread.sleep(3000);
	  System.out.println("Alert is canceled.");
	  
  }
  
  @Test
  public void test4() throws InterruptedException {
	  Driver.getDriver().get("https://demoqa.com/alerts");
	  WebElement clickMe1 = Driver.getDriver().findElement(By.id("promtButton"));
	  clickMe1.click();
	 
	  utils.waitUntilAlertIsPresent();
	  
	  Alert handleAlert = Driver.getDriver().switchTo().alert();
	  System.out.println("Alert message is: " + handleAlert.getText());
	  handleAlert.sendKeys("My Name");
	  handleAlert.accept();
	  Thread.sleep(3000);
	  System.out.println("Alert is accepted with a text.");
	  
  }
  
}
