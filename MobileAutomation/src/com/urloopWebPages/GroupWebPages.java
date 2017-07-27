package com.urloopWebPages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Tring.nbc.utils.Constants;
import com.Tring.nbc.utils.ExcelReader;
import com.excelGetterSetter.LoginGS;
import com.urloopWeb.ModuleObjects.BookAserviceWeb_Object;
import com.urloopWeb.ModuleObjects.GroupWeb_Object;
import com.urloopWeb.ModuleObjects.LoginWeb_Object;
import com.urloopWebScripts.BookAservicesWebScripts;
import com.urloopWebScripts.GroupWebScripts;
import com.urloopWebScripts.LoginWebScripts;

public class GroupWebPages {

	public static ExcelReader testDataSheet;
    public static GroupWeb_Object groupWeb_Object;
    public static LoginWebScripts loginWebScripts;
	public static ChromeDriver driver;
	public static Browser browser;
	public static GroupWebPages groupWebPages;
    public static LoginGS loginGS;
    public static LoginWebPages loginWebPages;
    public static GroupWebScripts groupWebScripts;
    
    @BeforeTest
	private void configuration(){
    	groupWeb_Object = new GroupWeb_Object();
    	groupWeb_Object=PageFactory.initElements(browser.driver,GroupWeb_Object.class);
		testDataSheet = ExcelReader.getInstance(Constants.PATHTESTDATA);
		groupWebPages = new GroupWebPages();
		loginGS = new LoginGS();
		groupWebScripts = new GroupWebScripts();
		loginWebPages = new LoginWebPages();
		}
    
    @Test(priority = 1)
	public void login() throws InterruptedException{
		loginWebPages.configuration();
		loginWebPages.validCredentials();
	}
	
    
	
	
	@Test(priority = 2)
	public void createGroups() throws InterruptedException{
		/*bookAservicesWebPages.setUserName(testDataSheet.getCellValue("inValidCredentials","Login","Username"));
		bookAservicesWebPages.setPassWord(testDataSheet.getCellValue("inValidCredentials","Login","Password"));*/
		 /*loginWebScripts.login(loginWeb_Object,loginGS);*/
		
		System.out.println("hello1");
		groupWebScripts.createGroups(groupWeb_Object);
	}
			
}
