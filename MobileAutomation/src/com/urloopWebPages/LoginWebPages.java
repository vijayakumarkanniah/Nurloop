package com.urloopWebPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Tring.nbc.utils.Constants;
import com.Tring.nbc.utils.ExcelReader;
import com.excelGetterSetter.LoginGS;
import com.urloopWeb.ModuleObjects.LoginWeb_Object;
import com.urloopWebScripts.LoginWebScripts;

public class LoginWebPages {

	private ExcelReader testDataSheet;
	private LoginWeb_Object loginWeb_Object;
	private LoginGS loginGS;

	@BeforeTest
	public void configuration() {
		Browser.browserDriver("Chrome");
		loginWeb_Object = new LoginWeb_Object();
		loginWeb_Object = PageFactory.initElements(Browser.driver, LoginWeb_Object.class);
		testDataSheet = ExcelReader.getInstance(Constants.PATHTESTDATA);
		loginGS = new LoginGS();
	}

	@Test(priority = 1)
	public void inValidCredentials() throws InterruptedException {
		loginGS.setUserName(testDataSheet.getCellValue("inValidCredentials", "Login", "Username"));
		loginGS.setPassWord(testDataSheet.getCellValue("inValidCredentials", "Login", "Password"));
		LoginWebScripts.login(loginWeb_Object, loginGS);
	}

	@Test(priority = 2)
	public void validCredentials() throws InterruptedException {
		loginGS.setUserName(testDataSheet.getCellValue("ValidCredentials", "Login", "Username"));
		loginGS.setPassWord(testDataSheet.getCellValue("ValidCredentials", "Login", "Password"));
		LoginWebScripts.login(loginWeb_Object, loginGS);
	}

}
