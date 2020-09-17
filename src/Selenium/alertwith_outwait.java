package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class alertwith_outwait {

	/*
	 * Alert with wait Alert without wait
	 * 
	 */

	@Test
	public void alertPop() throws InterruptedException {
		String exePath = "F:\\jar\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumframework.com/Practiceform");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("alert")).click();

		System.out.println(driver.switchTo().alert().getText());
		// There is OK button so accept and dismiss will work
		driver.switchTo().alert().dismiss();

		driver.findElement(By.id("timingAlert")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent()); // accept can be use with command as well
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}
}