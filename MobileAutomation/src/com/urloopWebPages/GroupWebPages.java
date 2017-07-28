package com.urloopWebPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Tring.nbc.utils.Constants;
import com.Tring.nbc.utils.ExcelReader;
import com.excelGetterSetter.GroupGS;
import com.urloopWeb.ModuleObjects.GroupWeb_Object;
import com.urloopWebScripts.GroupWebScripts;

public class GroupWebPages {

	private ExcelReader testDataSheet;
	private GroupWeb_Object groupWeb_Object;
	private GroupGS groupGS;
	private GroupWebScripts groupWebScripts;

	@BeforeTest
	private void configuration() {
		groupWeb_Object = new GroupWeb_Object();
		groupWeb_Object = PageFactory.initElements(Browser.driver, GroupWeb_Object.class);
		testDataSheet = ExcelReader.getInstance(Constants.PATHTESTDATA);
		groupGS = new GroupGS();
		groupWebScripts = new GroupWebScripts();

	}

	@Test(priority = 1)
	public void login() throws InterruptedException {
		LoginWebPages loginWebPages = new LoginWebPages();
		loginWebPages.configuration();
		loginWebPages.validCredentials();
	}

	/*@Test(priority = 2)*/
	public void createGroupsStaff() throws InterruptedException {
		groupGS.setGroupName(testDataSheet.getCellValue("ValidGroupStaff", "Groups", "GroupName"));
		groupGS.setOnly_Staff(testDataSheet.getCellValue("ValidGroupStaff", "Groups", "Staff"));
		groupGS.setDescription(testDataSheet.getCellValue("ValidGroupStaff", "Groups", "Description"));
		groupWebScripts.createGroups(groupWeb_Object, groupGS);
	}

	/*@Test(priority = 3)*/
	public void createGroupsResident() throws InterruptedException {
		groupGS.setGroupName(testDataSheet.getCellValue("ValidGroupResident", "Groups", "GroupName"));
		groupGS.setOnly_Residents(testDataSheet.getCellValue("ValidGroupResident", "Groups", "Resident"));
		groupGS.setDescription(testDataSheet.getCellValue("ValidGroupResident", "Groups", "Description"));
		groupWebScripts.createGroups(groupWeb_Object, groupGS);
	}

	/*@Test(priority = 4)*/
	public void createGroupsEveryOne() throws InterruptedException {
		groupGS.setGroupName(testDataSheet.getCellValue("ValidGroupEveryOne", "Groups", "GroupName"));
		groupGS.setEveryone(testDataSheet.getCellValue("ValidGroupEveryOne", "Groups", "Everyone"));
		groupGS.setDescription(testDataSheet.getCellValue("ValidGroupEveryOne", "Groups", "Description"));
		groupWebScripts.createGroups(groupWeb_Object, groupGS);
	}

	@Test(priority = 5)
	public void createGroupsClickingResident() throws InterruptedException {
		groupGS.setGroupName(testDataSheet.getCellValue("ValidGroupResident", "Groups", "GroupName"));
		groupGS.setOnly_Residents(testDataSheet.getCellValue("ValidGroupResident", "Groups", "Resident"));
		groupGS.setDescription(testDataSheet.getCellValue("ValidGroupResident", "Groups", "Description"));
		groupWebScripts.scroll(groupGS);
	}

}
