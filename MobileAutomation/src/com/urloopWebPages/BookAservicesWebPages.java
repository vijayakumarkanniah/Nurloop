package com.urloopWebPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Tring.nbc.utils.Constants;
import com.Tring.nbc.utils.ExcelReader;
import com.excelGetterSetter.LoginGS;
import com.urloopWeb.ModuleObjects.BookAserviceWeb_Object;
import com.urloopWeb.ModuleObjects.LoginWeb_Object;

import org.openqa.selenium.chrome.ChromeDriver;
import com.urloopWebScripts.*;


public class BookAservicesWebPages {
	
	public static ExcelReader testDataSheet;
    public static BookAserviceWeb_Object bookAserviceWeb_Object;
    public static LoginWebScripts loginWebScripts;
	public static ChromeDriver driver;
	public static Browser browser;
	public static BookAservicesWebPages bookAservicesWebPages;
    public static LoginGS loginGS;
    public static LoginWebPages loginWebPages;
    public static BookAservicesWebScripts bookAservicesWebScripts;
	
	@BeforeTest
	private void configuration(){
		bookAserviceWeb_Object = new BookAserviceWeb_Object();
		bookAserviceWeb_Object=PageFactory.initElements(browser.driver,BookAserviceWeb_Object.class);
		testDataSheet = ExcelReader.getInstance(Constants.PATHTESTDATA);
		bookAservicesWebPages = new BookAservicesWebPages();
		loginGS = new LoginGS();
		bookAservicesWebScripts = new BookAservicesWebScripts();
		loginWebPages = new LoginWebPages();
		}
	
	@Test(priority = 1)
	public void login() throws InterruptedException{
		loginWebPages.configuration();
		loginWebPages.validCredentials();
	}
	
	@Test(priority = 2)
	public void bookAServices() throws InterruptedException{
		/*bookAservicesWebPages.setUserName(testDataSheet.getCellValue("inValidCredentials","Login","Username"));
		bookAservicesWebPages.setPassWord(testDataSheet.getCellValue("inValidCredentials","Login","Password"));*/
		 /*loginWebScripts.login(loginWeb_Object,loginGS);*/
		
		System.out.println("hello1");
		 bookAservicesWebScripts.bookAservices(bookAserviceWeb_Object);
	}
			

}
