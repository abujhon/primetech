package tests;

import org.testng.annotations.Test;

import utilities.BrowserUtils;
import utilities.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Selections {
	
	BrowserUtils utils = new BrowserUtils();


	@BeforeMethod
	public void beforeTest() {
		Driver.getDriver().manage().window().maximize();
	}

	@Test
	public void test1() throws InterruptedException {
		Driver.getDriver().get("https://semantic-ui.com/modules/dropdown.html#selection");
		Thread.sleep(1000);

		WebElement genderSelect = Driver.getDriver().findElement(By.xpath("(//div[@class='ui selection dropdown'])[1]"));
		genderSelect.click();
		WebElement genderMale = Driver.getDriver().findElement(By.xpath("(//div[text()='Male'])[1]"));
		utils.waitUntilVisible(genderMale);
		genderMale.click();
		Thread.sleep(1000);
	}

	@Test
	public void test2() throws InterruptedException {
		Driver.getDriver().get("https://semantic-ui.com/modules/dropdown.html#selection");
		Thread.sleep(1000);

		WebElement genderdiv = Driver.getDriver().findElement(By.xpath("(//div[@class='ui dropdown selection'])[1]"));
		genderdiv.click();
		WebElement genderselect = Driver.getDriver().findElement(By.xpath("(//div[text()='Female'])[2]"));
		utils.waitUntilVisible(genderselect);
		genderselect.click();
		Thread.sleep(1000);

	}
	
	@Test
	public void test3() throws InterruptedException {
		Driver.getDriver().get("https://semantic-ui.com/modules/dropdown.html#selection");
		Thread.sleep(1000);

		WebElement genderdiv = Driver.getDriver().findElement(By.xpath("(//div[@class='ui fluid selection dropdown'])[1]"));
		genderdiv.click();
		Thread.sleep(1000);
		WebElement friendselect = Driver.getDriver().findElement(By.xpath("(//div[starts-with(@class, 'ui fluid selection dropdown')])[1]/div[contains(@class, 'menu transition')]"));
		utils.waitUntilVisible(friendselect);
		List<WebElement> list = Driver.getDriver().findElements(By.xpath("(//div[starts-with(@class, 'ui fluid selection dropdown')])[1]/div[contains(@class, 'menu transition')]/div"));
		for (int i = 1; i <= list.size(); i++) {
			WebElement friend = Driver.getDriver().findElement(By.xpath("(//div[starts-with(@class, 'ui fluid selection dropdown')])[1]/div[contains(@class, 'menu transition')]/div["+i+"]"));
			String friendName = friend.getText();
			System.out.println(friendName);
			if (friendName.equals("Matt")) {
				friend.click();
				break;
			}
		}

		Thread.sleep(1000);
		
	}

	@AfterMethod
	public void afterTest() {
		Driver.closeDriver();
	}

}
