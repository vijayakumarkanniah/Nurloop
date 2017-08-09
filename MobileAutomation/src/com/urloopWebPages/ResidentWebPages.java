package com.urloopWebPages;

import java.awt.AWTException;
import java.io.FileNotFoundException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Tring.nbc.utils.Constants;
import com.Tring.nbc.utils.ExcelReader;
import com.excelGetterSetter.ResidentGS;
import com.excelGetterSetter.ServicesGS;
import com.urloopWebScripts.LoginWebScripts;
import com.urloopWebScripts.ResidentWebScripts;
import com.urloopWebScripts.ServicesWebScripts;

public class ResidentWebPages {

	public static ExcelReader testDataSheet;
	public static ResidentWebScripts residentWebScripts;
	public static ChromeDriver driver;
	public static LoginWebPages loginWebPages;
	public static ResidentGS residentGS;
	public static ResidentWebPages residentWebPages;
	public static LoginWebScripts loginWebScripts;
	
	@BeforeTest
	private void configuration() {
		
		testDataSheet = ExcelReader.getInstance(Constants.PATHTESTDATA);
		residentWebPages = new ResidentWebPages();
		residentGS = new ResidentGS();
		residentWebScripts = new ResidentWebScripts();
		loginWebPages = new LoginWebPages();
	}
	
	@Test(priority = 1)
	public void login() throws InterruptedException, FileNotFoundException {
		loginWebPages.configuration();
		loginWebPages.validCredentials();
	}
	
	@Test(priority = 2)
	public void residentCreate() throws InterruptedException, AWTException{
		residentGS.setFirstName(
				testDataSheet.getCellValue("ResidentCreate", "Resident", "FirstName"));
		residentGS.setLastName(
				testDataSheet.getCellValue("ResidentCreate", "Resident", "LastName"));
		residentGS.setGender(
				testDataSheet.getCellValue("ResidentCreate", "Resident", "Gender"));
		residentGS.setBirthYear(
				testDataSheet.getCellValue("ResidentCreate", "Resident", "BirthYear"));
		residentGS.setEmail(
				testDataSheet.getCellValue("ResidentCreate", "Resident", "Email"));
		residentGS.setCountryCode(
				testDataSheet.getCellValue("ResidentCreate", "Resident", "CountryCode"));
		residentGS.setCellPhone(
				testDataSheet.getCellValue("ResidentCreate", "Resident", "CellPhone"));
		
		residentGS.setResidentBio(
				testDataSheet.getCellValue("ResidentCreate", "Resident", "ResidentBio"));
		residentGS.setAdderssLine_1(
				testDataSheet.getCellValue("ResidentCreate", "Resident", "AddressLine1"));
		residentGS.setAdderssLine_2(
				testDataSheet.getCellValue("ResidentCreate", "Resident", "AddressLine1"));
		
		residentWebScripts.createResident(residentGS);
	}
	
}
