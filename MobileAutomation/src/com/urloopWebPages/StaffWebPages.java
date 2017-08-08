package com.urloopWebPages;

import java.awt.AWTException;
import java.io.FileNotFoundException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Tring.nbc.utils.Constants;
import com.Tring.nbc.utils.ExcelReader;
import com.excelGetterSetter.ResidentGS;
import com.excelGetterSetter.StaffGS;
import com.urloopWebScripts.LoginWebScripts;
import com.urloopWebScripts.ResidentWebScripts;
import com.urloopWebScripts.StaffWebScripts;

public class StaffWebPages {
	
	public static ExcelReader testDataSheet;
	public static LoginWebScripts LoginWebScripts;
	public static ChromeDriver driver;
	public static LoginWebPages loginWebPages;
	public static StaffGS staffGS;
	public static StaffWebPages staffWebPages;
	public static StaffWebScripts staffWebScripts;
	
	@BeforeTest
	private void configuration() {
		
		testDataSheet = ExcelReader.getInstance(Constants.PATHTESTDATA);
		staffWebPages = new StaffWebPages();
		staffGS = new StaffGS();
		staffWebScripts = new StaffWebScripts();
		loginWebPages = new LoginWebPages();
	}
	
	@Test(priority = 1)
	public void login() throws InterruptedException, FileNotFoundException {
		loginWebPages.configuration();
		loginWebPages.validCredentials();
	}
	@Test(priority = 2)
	public void staffCreation() throws InterruptedException, AWTException{
		
		staffGS.setFirstName(
				testDataSheet.getCellValue("StaffCreation", "Staff", "FIRSTNAME"));
		staffGS.setLastName(
				testDataSheet.getCellValue("StaffCreation", "Staff", "LASTNAME"));
		staffGS.setGender(
				testDataSheet.getCellValue("StaffCreation", "Staff", "GENDER"));
		staffGS.setEmail(
				testDataSheet.getCellValue("StaffCreation", "Staff", "EMAIL"));
		staffGS.setCountryCode(
				testDataSheet.getCellValue("StaffCreation", "Staff", "COUNTRY"));
		staffGS.setCellPhone(
				testDataSheet.getCellValue("StaffCreation", "Staff", "CELLPHONE"));
		staffGS.setStaffBio(
				testDataSheet.getCellValue("StaffCreation", "Staff", "BIO"));
		staffGS.setStaffBio(
				testDataSheet.getCellValue("StaffCreation", "Staff", "BIO"));
		
		
		staffWebScripts.staffCreation(staffGS);
		
	}

}
