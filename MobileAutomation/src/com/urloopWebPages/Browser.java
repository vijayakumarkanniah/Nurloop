package com.urloopWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static ChromeDriver driver;

	public static void /* ChromeDriver */ browserDriver(String browser) {

		if (browser == "Chrome") {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\VIJAY KUMAR\\workspace_new\\MobileAutomation\\MobileAutomation\\resources\\browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			/* driver.manage().window().maximize(); */
			driver.manage().window().maximize();
			driver.get("http://urloop-testing.appspot.com/");

		}
		/* return driver; */
	}

	public static WebElement findElementByPath(String path) {
		return Browser.driver.findElement(By.xpath(path));
	}

	public static WebElement findElementById(String id) {
		return Browser.driver.findElement(By.id(id));
	}

}
