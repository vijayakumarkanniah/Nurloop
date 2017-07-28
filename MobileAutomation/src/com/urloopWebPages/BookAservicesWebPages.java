package com.urloopWebPages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Tring.nbc.utils.Constants;
import com.Tring.nbc.utils.ExcelReader;
import com.excelGetterSetter.BookAservicesGS;
import com.urloopWeb.ModuleObjects.BookAserviceWeb_Object;
import com.urloopWebScripts.BookAservicesWebScripts;
import com.urloopWebScripts.LoginWebScripts;

public class BookAservicesWebPages {

	public static ExcelReader testDataSheet;
	public static BookAserviceWeb_Object bookAserviceWeb_Object;
	public static LoginWebScripts loginWebScripts;
	public static ChromeDriver driver;
	public static BookAservicesWebPages bookAservicesWebPages;
	public static BookAservicesGS bookAservicesGS;
	public static LoginWebPages loginWebPages;
	public static BookAservicesWebScripts bookAservicesWebScripts;

	@BeforeTest
	private void configuration() {
		bookAserviceWeb_Object = new BookAserviceWeb_Object();
		bookAserviceWeb_Object = PageFactory.initElements(Browser.driver, BookAserviceWeb_Object.class);
		testDataSheet = ExcelReader.getInstance(Constants.PATHTESTDATA);
		bookAservicesWebPages = new BookAservicesWebPages();
		bookAservicesGS = new BookAservicesGS();
		bookAservicesWebScripts = new BookAservicesWebScripts();
		loginWebPages = new LoginWebPages();
	}

	@Test(priority = 1)
	public void login() throws InterruptedException {
		loginWebPages.configuration();
		loginWebPages.validCredentials();
	}

	@Test(priority = 2)
	public void bookAServices() throws InterruptedException {
		/*
		 * bookAservicesWebPages.setUserName(testDataSheet.getCellValue(
		 * "inValidCredentials","Login","Username"));
		 * bookAservicesWebPages.setPassWord(testDataSheet.getCellValue(
		 * "inValidCredentials","Login","Password"));
		 */
		/* loginWebScripts.login(loginWeb_Object,loginGS); */

		bookAservicesGS.setServiceCategory(
				testDataSheet.getCellValue("validBootAServices", "BookAservices", "serviceCategory"));
		bookAservicesGS
				.setServiceName(testDataSheet.getCellValue("validBootAServices", "BookAservices", "serviceName"));
		bookAservicesGS.setSelectDate(testDataSheet.getCellValue("validBootAServices", "BookAservices", "selectDate"));
		bookAservicesGS
				.setSelectHours(testDataSheet.getCellValue("validBootAServices", "BookAservices", "selectHours"));
		bookAservicesGS
				.setSelectMinutes(testDataSheet.getCellValue("validBootAServices", "BookAservices", "selectMinutes"));
		bookAservicesGS
				.setSelectResident(testDataSheet.getCellValue("validBootAServices", "BookAservices", "selectResident"));
		bookAservicesGS
				.setSelectStaff(testDataSheet.getCellValue("validBootAServices", "BookAservices", "selectStaff"));
		bookAservicesGS.setNote(testDataSheet.getCellValue("validBootAServices", "BookAservices", "notes"));

		System.out.println("hello1");
		bookAservicesWebScripts.bookAservices(bookAserviceWeb_Object, bookAservicesGS);
	}

}
