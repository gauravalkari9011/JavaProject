package Selenium;

import org.testng.annotations.Test;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Iterator;

public class HandleMultipleWindows {

	/*
	 * Multiple Windows Handle
	 * 
	 */
	@Test
	public void frame() throws InterruptedException {

		String exePath = "F:\\jar\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumframework.com/Practiceform");
		String parentwin = driver.getWindowHandle();
		System.out.println("Main Win" + parentwin);
		driver.manage().window().maximize();

		WebElement clickElement = driver.findElement(By.id("button1"));

		// to launch multiple windows
		for (int i = 0; i < 3; i++) {
			clickElement.click();
			Thread.sleep(3000);
		}

		// Take all handles
		Set<String> allWindowHandles = driver.getWindowHandles();

		// Print all handles
		for (String handle : allWindowHandles) {
			System.out.println("Window handle - > " + handle);
		}

		// Using iterator go to next handle
		Iterator<String> itr = allWindowHandles.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			// Compare whether the main windows is not equal to child window. If not equal,
			// we will close.
			if (!parentwin.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
			}

			while (itr.hasNext()) {
				String childWindowclose = itr.next();
				driver.switchTo().window(childWindowclose);
				driver.close();
			}
		}
	}
}
