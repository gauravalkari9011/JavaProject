package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyDatafromTable {

	/*
	 * Assignment 1: Verify that there are only 4 structure values present. Read the
	 * 'Structure' column and find out the total number of structures present. Read
	 * the value of 'Total' column and match with the previous step. Solution Hint:
	 * Use list to store the structure values. Find the length of the list and match
	 * with the expected value.
	 * 
	 * Assignment 2: Read All the Values from the table row-wise and print them all
	 * 
	 * Solution Hint: Use for loop to read all the values of the table.
	 */

	@Test
	public void table() {

		String exePath = "F:\\jar\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();

		List<WebElement> lst = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody/tr/th[1]"));

		int s = lst.size();
		String sz = Integer.toString(s);
		System.out.println(sz);

		for (WebElement t1 : lst) {

			String t2 = t1.getText();
			System.out.println(t2);
		}

		WebElement total = driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tfoot/tr/td"));
		String total1 = total.getText().replaceAll("buildings", " ").replaceAll(" ", "");
		// System.out.println(total1);
		// System.out.println(total1.length());
		Assert.assertEquals(sz, total1);

		// Assignment 2

		List<WebElement> lst2 = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody/tr"));
		for (WebElement newlst : lst2) {
			System.out.println(newlst.getText());
			System.out.println("\r\n");
		}
		System.out.println(lst2.size());

		// Assignment 3 - Verify that Burj Khalifa has a height of 829m (similar for
		// other structures)

		String recValue = driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tbody/tr[1]/td[3]")).getText();
		Assert.assertEquals(recValue, "829m", "The record is not found");

		// Assignment 4: Verify that 6th row (Last Row) has only two columns.

		List<WebElement> lastRow = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tfoot/tr"));
		for (WebElement lstr : lastRow) {
			lstr.getText();
		}
		System.out.println(lastRow.size());
	}
}
