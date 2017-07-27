package com.urloopWebScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.urloopWeb.ModuleObjects.BookAserviceWeb_Object;
import com.urloopWebPages.Browser;

public class BookAservicesWebScripts {

	public static Browser browser;
	String date = "25";

	public void bookAservices(BookAserviceWeb_Object bookAserviceWeb_Object) throws InterruptedException {
		System.out.println("hello2");

		Thread.sleep(15000);
		browser.driver.findElement(By.xpath(".//*[@id='careAssessment']/div/div[1]/div[2]/div/button")).click();

		Thread.sleep(5000);
		browser.driver.findElement(By.xpath(".//*[@id='category']/div/input")).click();
		Thread.sleep(5000);
		browser.driver.findElement(By.xpath(".//*[@class='selectBox-values']/div[text()='Recreation']")).click();

		Thread.sleep(5000);
		browser.driver.findElement(By.xpath(".//*[@id='service']/div/input")).click();
		Thread.sleep(5000);
		browser.driver.findElement(By.xpath(".//*[@class='selectBox-values']/div[text()='Painting Class']")).click();
		Thread.sleep(5000);
		Browser.driver.findElement(By.xpath(".//*[@id='eventDate']")).click();
		Thread.sleep(5000);
		WebElement datePicker = browser.driver.findElement(By.id("ui-datepicker-div"));
		List<WebElement> noOfColumns = datePicker.findElements(By.tagName("td"));
		// Loop will rotate till expected date not found.
		for (WebElement cell : noOfColumns) {
			// Select the date from date picker when condition match.
			if (cell.getText().equals(date)) {
				cell.findElement(By.linkText(date)).click();
				break;
			}
		}

		Thread.sleep(5000);
		Browser.driver.findElement(By.xpath(".//*[@id='timepicker']")).click();

		Thread.sleep(5000);
		Browser.driver.findElement(By.xpath("html/body/div[6]/table/tbody/tr[2]/td[1]/input")).clear();
		Browser.driver.findElement(By.xpath("html/body/div[6]/table/tbody/tr[2]/td[1]/input")).sendKeys("10");
		Thread.sleep(5000);
		Browser.driver.findElement(By.xpath("html/body/div[6]/table/tbody/tr[2]/td[3]/input")).clear();
		Browser.driver.findElement(By.xpath("html/body/div[6]/table/tbody/tr[2]/td[3]/input")).sendKeys("30");
		Thread.sleep(5000);
		Browser.driver.findElement(By.xpath("html/body/div[6]/table/tbody/tr[3]/td[5]/a")).click();
		Thread.sleep(5000);
		Browser.driver.findElement(By.xpath(".//*[@id='resident']/div")).click();

		Thread.sleep(5000);
		Browser.driver.findElement(By.xpath(".//*[@class='selectBox-values']/div[text()='Ganesh Janakiraman']"))
				.click();

		Thread.sleep(5000);

		Browser.driver.findElement(By.xpath(".//*[@id='staff']/div/input")).click();
		Thread.sleep(5000);

		Browser.driver.findElement(By.xpath(".//*[@class='selectBox-values']/div[text()='James']")).click();
		Thread.sleep(5000);

		Thread.sleep(5000);
		Browser.driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("Kindly check the Booking");

		Thread.sleep(5000);
		Browser.driver
				.findElement(By
						.xpath(".//*[@id='modal-box']/div[2]/md-content/form/div[7]/div[2]/a[2]/button/span[text()='Save']"))
				.click();

	}

}
