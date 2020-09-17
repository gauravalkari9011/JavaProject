package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class formSubmit2 {

	/*
	 * Test Case 1 - Automate first Menu link of amazon.in and print page title
	 * 
	 * Steps to Automate: 1. Launch browser of your choice say., firefox, chrome
	 * etc. 2. Open this URL - www.amazon.in 3. Maximize or set size of browser
	 * window. 4. Get the page title and print it. 5. Now, click on first menu link
	 * say 'Amazon Pay' (or choose any other link from the menu list) 6. Get the
	 * page title and print it. 7. Navigate back to Home Page. 8. Get the page title
	 * and print it. Verify that value matches with output of point no. 4 9. Close
	 * the browser.
	 * 
	 * 
	 * Test Case 3 - Automate all the Menu links of amazon.in and Verify page titles
	 * 
	 * Steps to Automate: 1. Launch browser of your choice say., firefox, chrome
	 * etc. 2. Open this URL - www.amazon.in 3. Maximize or set size of browser
	 * window. 4. Get the page title and print it. 5. Click on first menu link, say
	 * 'Amazon Pay'. 6. Get Page title and verify it with expected value. 7.
	 * Navigate back to Home Page. 8. Get Page title and verify it with expected
	 * value. 9. Repeat steps 5 to 8 for other menu links. 10. Close the browser.
	 */
	@Test
	public void browse() {
		String exePath = "F:\\jar\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		driver.findElement(By.xpath("//div[@id='nav-xshop']//a[5]")).click();
		String pageTitle1 = driver.getTitle();
		System.out.println(pageTitle1);

		driver.navigate().back();
		Assert.assertEquals(pageTitle, driver.getTitle());
	}
}
