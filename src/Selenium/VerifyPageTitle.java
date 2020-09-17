package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyPageTitle {

	/*
	 * Test Case 2 - Automate all the Menu links of techlistic.com
	 * 
	 * Steps to Automate: 1. Launch browser of your choice say., firefox, chrome
	 * etc. 2. Open this URL - https://www.techlistic.com/ 3. Maximize or set size
	 * of browser window. 4. Click on 'Java Tutorial' link and validate page title.
	 * 5. Navigate back to Home Page. 6. Click on 'Selenium Tutorial' link and
	 * validate page title. 7. Navigate back to Home Page. 8. 11. Close the browser.
	 * 
	 */

	@Test
	public void browse() {

		String exePath = "F:\\jar\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.techlistic.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div[@class='overflowable-contents']//li/a[text()='Java']")).click();

		String page = driver.getTitle();
		Assert.assertEquals(page, "Free Java Tutorial - Techlistic");
		driver.navigate().back();

		driver.findElement(By.xpath("//div[@class='overflowable-contents']//li/a[text()='Selenium']")).click();

		String page1 = driver.getTitle();
		System.out.println(page1);
		Assert.assertEquals(page1, "Selenium Webdriver Tutorial - Techlistic");
		driver.navigate().back();
	}
}
