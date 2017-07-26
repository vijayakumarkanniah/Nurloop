package com.urloopWebPages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Tring.nbc.ModuleObjects.Mobile_Object;
import com.Tring.nbc.utils.Constants;
import com.Tring.nbc.utils.ExcelReader;
import com.Tring.nbc.utils.SeleniumCore;
import com.Tring.nbc.utils.SeleniumUtil;
import com.excelGetterSetter.LoginGS;
import com.urloopWeb.ModuleObjects.*;
import org.openqa.selenium.chrome.ChromeDriver;
import com.urloopWebScripts.*;
import com.Tring.nbc.utils.*;

public class LoginWebPages {
	
	public static ExcelReader testDataSheet;
    public static LoginWeb_Object loginWeb_Object;
    public static LoginWebScripts loginWebScripts;
	public static Browser browser;
	public static ChromeDriver driver;
	public static LoginWebPages loginWebPages;
    public static LoginGS loginGS;
	
	
	
	@BeforeTest
	public void configuration(){
		browser.browserDriver("Chrome");
		loginWeb_Object = new LoginWeb_Object();
		loginWeb_Object=PageFactory.initElements(browser.driver,LoginWeb_Object.class);
		testDataSheet = ExcelReader.getInstance(Constants.PATHTESTDATA);
		loginWebPages = new LoginWebPages();
		loginGS = new LoginGS();
		}
	
	
	
	@Test(priority = 1)
	public void inValidCredentials() throws InterruptedException{
		loginGS.setUserName(testDataSheet.getCellValue("inValidCredentials","Login","Username"));
		loginGS.setPassWord(testDataSheet.getCellValue("inValidCredentials","Login","Password"));
		   loginWebScripts.login(loginWeb_Object,loginGS);
			}
	
	@Test(priority = 2)
	public void validCredentials() throws InterruptedException{
		loginGS.setUserName(testDataSheet.getCellValue("ValidCredentials","Login","Username"));
		loginGS.setPassWord(testDataSheet.getCellValue("ValidCredentials","Login","Password"));
	   loginWebScripts.login(loginWeb_Object,loginGS);
		}

}
