package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {
	
	
	WebDriverWait wait;
	public void waitUntilVisible(WebElement element) {
		wait = new WebDriverWait(Driver.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitUntilElementClickable(WebElement element) {
		wait = new WebDriverWait(Driver.getDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitUntilAlertIsPresent() {
		wait = new WebDriverWait(Driver.getDriver(), 10);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public boolean isElementPresent(WebElement element) {
		boolean temp = false;
		 
		return temp;
	}

}
