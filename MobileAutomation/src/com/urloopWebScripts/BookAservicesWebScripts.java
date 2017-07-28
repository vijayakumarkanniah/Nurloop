package com.urloopWebScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.excelGetterSetter.BookAservicesGS;
import com.urloopWeb.ModuleObjects.BookAserviceWeb_Object;
import com.urloopWebPages.Browser;

public class BookAservicesWebScripts {

	public static Browser browser;
	String date = "25";

	public void bookAservices(BookAserviceWeb_Object bookAserviceWeb_Object, BookAservicesGS bookAservicesGS)
			throws InterruptedException {

		Thread.sleep(15000);
		browser.driver.findElement(By.xpath(".//*[@id='careAssessment']/div/div[1]/div[2]/div/button")).click();
		Thread.sleep(5000);
		browser.driver.findElement(By.xpath(".//*[@id='category']/div/input")).click();
		Thread.sleep(10000);
		browser.driver
				.findElement(By.xpath(
						".//*[@class='selectBox-values']/div[text()='" + bookAservicesGS.getServiceCategory() + "']"))
				.click();
		Thread.sleep(5000);
		browser.driver.findElement(By.xpath(".//*[@id='service']/div/input")).click();
		Thread.sleep(5000);
		browser.driver
				.findElement(By.xpath(
						".//*[@class='selectBox-values']/div[text()='" + bookAservicesGS.getServiceName() + "']"))
				.click();
		Thread.sleep(5000);
		Browser.driver.findElement(By.xpath(".//*[@id='eventDate']")).click();
		Thread.sleep(5000);

		WebElement datePicker = browser.driver.findElement(By.id("ui-datepicker-div"));
		List<WebElement> noOfColumns = datePicker.findElements(By.tagName("td"));
		// Loop will rotate till expected date not found.
		for (WebElement cell : noOfColumns) {
			// Select the date from date picker when condition match.
			// "+"Recreation"+"
			if (cell.getText().equals(bookAservicesGS.getSelectDate())) {
				cell.findElement(By.linkText(bookAservicesGS.getSelectDate())).click();
				break;
			}
		}

		Thread.sleep(5000);
		Browser.driver.findElement(By.xpath(".//*[@id='timepicker']")).click();
		Thread.sleep(5000);
		Browser.driver.findElement(By.xpath("html/body/div[6]/table/tbody/tr[2]/td[1]/input")).clear();
		Browser.driver.findElement(By.xpath("html/body/div[6]/table/tbody/tr[2]/td[1]/input"))
				.sendKeys(bookAservicesGS.getSelectHours());
		Thread.sleep(5000);
		Browser.driver.findElement(By.xpath("html/body/div[6]/table/tbody/tr[2]/td[3]/input")).clear();
		Browser.driver.findElement(By.xpath("html/body/div[6]/table/tbody/tr[2]/td[3]/input"))
				.sendKeys(bookAservicesGS.getSelectMinutes());
		Thread.sleep(5000);
		
		/*Am or Pm Click*/
		/*Browser.driver.findElement(By.xpath("html/body/div[6]/table/tbody/tr[3]/td[5]/a")).click();*/
		/*Am or Pm Click*/
		
		Thread.sleep(5000);
		Browser.driver.findElement(By.xpath(".//*[@id='resident']/div")).click();
		Thread.sleep(5000);
		Browser.driver
				.findElement(By.xpath(
						".//*[@class='selectBox-values']/div[text()='" + bookAservicesGS.getSelectResident() + "']"))
				.click();
		Thread.sleep(5000);
		Browser.driver.findElement(By.xpath(".//*[@id='staff']/div/input")).click();
		Thread.sleep(5000);
		Browser.driver
				.findElement(By.xpath(
						".//*[@class='selectBox-values']/div[text()='" + bookAservicesGS.getSelectStaff() + "']"))
				.click();
		Thread.sleep(5000);
		Browser.driver.findElement(By.xpath(".//*[@id='description']")).sendKeys(bookAservicesGS.getNote());
		Thread.sleep(5000);
		Browser.driver
				.findElement(By
						.xpath(".//*[@id='modal-box']/div[2]/md-content/form/div[7]/div[2]/a[2]/button/span[text()='Save']"))
				.click();

	}

}
