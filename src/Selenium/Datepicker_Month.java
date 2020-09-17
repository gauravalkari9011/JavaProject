package Selenium;


import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Datepicker_Month {

	/*
	 * Datepicker select date from a current month calendar Change calendar
	 * 
	 */

	@Test
	public void alertPop() throws InterruptedException {
		String exePath = "F:\\jar\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		WebDriver driver = new FirefoxDriver();
		// driver.get("https://www.globalsqa.com/demo-site/datepicker");
		// driver.get("https://jqueryui.com/datepicker/");
		// driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		WebElement calclik = driver.findElement(By.xpath("//*[@id='datepicker']"));
		calclik.click();

		LocalDate today = LocalDate.now();
		System.out.println((today.getDayOfMonth()));
		int i = today.getDayOfMonth();
		int j = today.getMonthValue();
		System.out.println((today.getMonthValue()));
		WebElement caldate1 = null;
		for (int m = 1; m <= 4; m++) {
			for (int n = 2; n <= 7; n++) {
				caldate1 = driver.findElement(
						By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[" + m + "]/td[" + n + "]/a"));
				System.out.println(" CalDate " + caldate1.getText());
				String new1 = caldate1.getText().trim();
				if (new1.isEmpty()) {
					System.out.println("value is null");
				} else {
					System.out.println("Before convert " + new1);
					int s = Integer.parseInt(new1);
					System.out.println("After Convert" + s);
					if (i == s) {
						caldate1.click();
						System.out.println("Got today's date");
					} else {
						System.out.println("Not got today's date");
					}
				}
			}

		}

		calclik.click();
		WebElement prev = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[1]"));
		// prev.click();

//	WebElement prev1=driver.findElement(By.xpath());

		WebElement next = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span"));
		// next.click();

		WebElement monYr = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/span[1]"));

		String mon = monYr.getText();
		System.out.println("Cal Text" + monYr.getText());

		prev.click();
		for (int g = 1; g <= 12; g++) {
			// Thread.sleep(10000);
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//a[@class='ui-datepicker-prev ui-corner-all ui-state-hover ui-datepicker-prev-hover']")))
					.click();
			// Thread.sleep(10000);
			calclik.click();
			Thread.sleep(5000);
			WebElement monYr1 = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/span[1]"));
			String t1 = monYr1.getText();
			System.out.println("t1" + t1);
			if (t1.equals("January")) {
				System.out.println("Found Month");
				// caldate1.click();
				break;
			} else {
				System.out.println("Still Jan month not found");
			}
		}

	}

}
