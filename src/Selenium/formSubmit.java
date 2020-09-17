package Selenium;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class formSubmit {

	@Test
	public void browse() {

		String exePath = "F:\\jar\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("Qutub");
		driver.findElement(By.name("lastname")).sendKeys("Minar");
		driver.findElement(By.xpath("//input[@value='Male']")).click();

		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		driver.findElement(By.xpath("//input[@name='tool'][@type='checkbox'][3]")).click();

		Random rand = new Random();
		Select slt = new Select(driver.findElement(By.id("continents")));
		List<WebElement> opt = slt.getOptions();

		// Get all the values from a dropdown
		for (WebElement item : opt) {
			String t1 = item.getText();
			System.out.println("Dropdown values are " + t1);
		}

		// select any random option from the dropdown
		slt.selectByIndex(rand.nextInt(opt.size()));

		// Get all the values from a dropdown - multiple values from a dropdown
		Select slts = new Select(driver.findElement(By.id("selenium_commands")));
		List<WebElement> opts = slts.getOptions();

		// Get all the values from a dropdown
		for (WebElement item1 : opts) {
			String t2 = item1.getText();
			System.out.println("Dropdown1 values1 are " + t2);
		}
		// select any random option from the dropdown
		slts.selectByIndex(rand.nextInt(opts.size()));

		// Select Multiple options from dropdown
		for (WebElement item1 : opts) {
			item1.click();
			// System.out.println("Dropdown1 values1 are "+ t2);
		}
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\Gourav A\\Desktop\\download.jpg");

		driver.findElement(By.id("submit")).click();
	}

}
