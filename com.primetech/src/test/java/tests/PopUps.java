package tests;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.BrowserUtils;
import utilities.Driver;

public class PopUps {

	BrowserUtils utils = new BrowserUtils();

	@BeforeMethod
	public void beforeMethod() {
		Driver.getDriver().manage().window().maximize();

	}

	@AfterMethod
	public void afterMethod() {
		Driver.closeDriver();
	}

	@Test
	public void test1() throws InterruptedException {
		Driver.getDriver().get("https://demoqa.com/browser-windows");
		String mainWindowTitle = Driver.getDriver().getTitle();
		String mainWindow = Driver.getDriver().getWindowHandle();
		System.out.println("Main window ID: " + mainWindow);
		WebElement newTab = Driver.getDriver().findElement(By.id("tabButton"));
		newTab.click();
		Thread.sleep(3000);
		Set<String> windows = Driver.getDriver().getWindowHandles();
		Iterator<String> iterate = windows.iterator();
		String parentWindowId = iterate.next();
		System.out.println("parent window ID: " + parentWindowId);
		String childWindowId = iterate.next();
		System.out.println("child window ID: " + childWindowId);
		Driver.getDriver().switchTo().window(childWindowId);
		Thread.sleep(2000);
		String childWindowTitle = Driver.getDriver().getTitle();
		System.out.println(childWindowTitle);
		utils.waitUntilVisible(Driver.getDriver().findElement(By.xpath("//h1[@id='sampleHeading']")));
		WebElement nextWindow = Driver.getDriver().findElement(By.xpath("//h1[@id='sampleHeading']"));
		String nextWindowtext = nextWindow.getText();
		System.out.println("next window text: " + nextWindowtext);
		
		Driver.getDriver().switchTo().window(parentWindowId);
		Assert.assertEquals(Driver.getDriver().getTitle(), mainWindowTitle);
	}
}
