package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {

	/*
	 * Drag and Drop using Actions[Need to check Drag / Drop]
	 * 
	 */

	@Test
	public void alertPop() throws InterruptedException {
		String exePath = "F:\\jar\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumframework.com/Practiceform");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement source = driver.findElement(By.id("draga"));
		WebElement target = driver.findElement(By.id("dragb"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
	}
}