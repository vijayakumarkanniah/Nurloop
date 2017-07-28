package com.urloopWebPages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Tring.nbc.utils.Constants;
import com.Tring.nbc.utils.ExcelReader;
import com.excelGetterSetter.GroupGS;
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
    public static GroupGS groupGS;
    public static LoginWebPages loginWebPages;
    public static GroupWebScripts groupWebScripts;
    
    @BeforeTest
	private void configuration(){
    	groupWeb_Object = new GroupWeb_Object();
    	groupWeb_Object=PageFactory.initElements(browser.driver,GroupWeb_Object.class);
		testDataSheet = ExcelReader.getInstance(Constants.PATHTESTDATA);
		groupWebPages = new GroupWebPages();
		groupGS = new GroupGS();
		groupWebScripts = new GroupWebScripts();
		loginWebPages = new LoginWebPages();
		}
    
    @Test(priority = 1)
	public void login() throws InterruptedException{
		loginWebPages.configuration();
		loginWebPages.validCredentials();
	}
    
    
    
   @Test(priority = 2)
	public void createGroupsStaff() throws InterruptedException{
		groupGS.setGroupName(testDataSheet.getCellValue("ValidGroupStaff","Groups","GroupName"));
		groupGS.setOnly_Staff(testDataSheet.getCellValue("ValidGroupStaff","Groups","Staff"));
		groupGS.setDescription(testDataSheet.getCellValue("ValidGroupStaff","Groups","Description"));
		groupWebScripts.createGroups(groupWeb_Object,groupGS);
	}
	
   
   
   
	@Test(priority = 3)
	public void createGroupsResident() throws InterruptedException{
		groupGS.setGroupName(testDataSheet.getCellValue("ValidGroupResident","Groups","GroupName"));
		groupGS.setOnly_Residents(testDataSheet.getCellValue("ValidGroupResident","Groups","Resident"));
		groupGS.setDescription(testDataSheet.getCellValue("ValidGroupResident","Groups","Description"));
		groupWebScripts.createGroups(groupWeb_Object,groupGS);
	}
	
	
	@Test(priority = 4)
	public void createGroupsEveryOne() throws InterruptedException{
		groupGS.setGroupName(testDataSheet.getCellValue("ValidGroupEveryOne","Groups","GroupName"));
		groupGS.setEveryone(testDataSheet.getCellValue("ValidGroupEveryOne","Groups","Everyone"));
		groupGS.setDescription(testDataSheet.getCellValue("ValidGroupEveryOne","Groups","Description"));
		groupWebScripts.createGroups(groupWeb_Object,groupGS);
	}
	
	@Test(priority = 5)
	public void createGroupsClickingResident() throws InterruptedException{
		groupGS.setGroupName(testDataSheet.getCellValue("ValidGroupResident","Groups","GroupName"));
		groupGS.setOnly_Residents(testDataSheet.getCellValue("ValidGroupResident","Groups","Resident"));
		groupGS.setDescription(testDataSheet.getCellValue("ValidGroupResident","Groups","Description"));
		groupWebScripts.scroll(groupGS);
	}
			
}
