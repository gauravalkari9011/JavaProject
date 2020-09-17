package Selenium;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MessageWindowsHandle {

	/*
	 * Message Windows Handle
	 * 
	 */
	@Test
	public void messageWin() {

		String exePath = "F:\\jar\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumframework.com/Practiceform");
		// String parentwin= driver.getWindowHandle();
		// System.out.println("Main Win"+parentwin);
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath("//button[@onclick='newMsgWin()']"));
		ele.click();
		String parentwin = driver.getWindowHandle();

		Set<String> allHand = driver.getWindowHandles();

		for (String hand : allHand) {
			System.out.println("Handle info" + hand);
		}

		Iterator<String> itr = allHand.iterator();
		while (itr.hasNext()) {
			String childnew = (String) itr.next();
			if (!parentwin.equals(childnew)) {
				//
				System.out.println("ChildName " + driver.switchTo().window(childnew));
				System.out.println(driver.findElement(By.xpath("//body")).getText());
				driver.manage().window().maximize();
				driver.close();
			}
		}
	}
}
