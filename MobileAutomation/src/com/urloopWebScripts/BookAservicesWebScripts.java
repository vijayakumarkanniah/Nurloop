package com.urloopWebScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Tring.nbc.utils.WebScriptConstants;
import com.excelGetterSetter.BookAservicesGS;
import com.urloopWeb.ModuleObjects.BookAserviceWeb_Object;
import com.urloopWebPages.Browser;

public class BookAservicesWebScripts {

	// public static Browser browser;
	String date = "25";

	public void bookAservices(BookAserviceWeb_Object bookAserviceWeb_Object, BookAservicesGS bookAservicesGS)
			throws InterruptedException {

		Thread.sleep(15000);
		Browser.findElementByPath(WebScriptConstants.CARE_ASSESMENT_BUTTON).click();
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.CATEGORY_INPUT).click();
		Thread.sleep(10000);
		Browser.findElementByPath(
				String.format(WebScriptConstants.SERVICE_CATEGORY, bookAservicesGS.getServiceCategory())).click();
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.SERVICE_INPUT).click();
		Thread.sleep(5000);
		Browser.findElementByPath(String.format(WebScriptConstants.SERVICE_NAME, bookAservicesGS.getServiceName()))
				.click();
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.EVENT_DATE).click();
		Thread.sleep(5000);

		WebElement datePicker = Browser.findElementById(WebScriptConstants.DATE_PICKER);
		List<WebElement> noOfColumns = datePicker.findElements(By.tagName(WebScriptConstants.TD));
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
		Browser.findElementByPath(WebScriptConstants.TIME_PICKER).click();
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.INPUT_2_1).clear();
		Browser.findElementByPath(WebScriptConstants.INPUT_2_1).sendKeys(bookAservicesGS.getSelectHours());
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.INPUT_2_3).clear();
		Browser.findElementByPath(WebScriptConstants.INPUT_2_3).sendKeys(bookAservicesGS.getSelectMinutes());
		Thread.sleep(5000);

		/* Am or Pm Click */
		/*
		 * Browser.driver.findElement(By.xpath(
		 * "html/body/div[6]/table/tbody/tr[3]/td[5]/a")).click();
		 */
		/* Am or Pm Click */

		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.RESIDENT_DIV).click();
		Thread.sleep(5000);
		// ".//*[@class='selectBox-values']/div[text()='" +
		// bookAservicesGS.getSelectResident() + "']"
		Browser.findElementByPath(String.format(WebScriptConstants.SELECT_BOX, bookAservicesGS.getSelectResident()))
				.click();
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.STAFF_INPUT).click();
		Thread.sleep(5000);
		Browser.findElementByPath(String.format(WebScriptConstants.SELECTED_STAFF, bookAservicesGS.getSelectStaff()))
				.click();
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.DESCRIPTION).sendKeys(bookAservicesGS.getNote());
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.SAVE_MODAL).click();

	}

}
