package com.urloopWebPages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Tring.nbc.utils.Constants;
import com.Tring.nbc.utils.ExcelReader;
import com.Tring.nbc.utils.WebScriptConstants;
import com.excelGetterSetter.UnassignedGS;
import com.urloopWebScripts.UnassignedWebScripts;;

public class UnassignedWebPages {

	private ExcelReader testDataSheet;
	private UnassignedGS unassignedGS;
	private UnassignedWebScripts unassignedWebScripts;
	
	@BeforeTest
	private void configuration() {
		testDataSheet = ExcelReader.getInstance(Constants.PATHTESTDATA);
		unassignedGS = new UnassignedGS();
		unassignedWebScripts = new UnassignedWebScripts();
	}
	
	@Test(priority=1)
	public void login() throws InterruptedException, FileNotFoundException
	{
		LoginWebPages loginWebPages = new LoginWebPages();
		loginWebPages.configuration();
		loginWebPages.validCredentials();
	}
	
/*	@Test(priority=2)*/
	public void Unassignedondemandtimeonly() throws InterruptedException
	{
		
		unassignedGS.setHour(testDataSheet.getCellValue("Unassignedtimechange", "Unassigned", "Hour"));
		unassignedGS.setMinutes(testDataSheet.getCellValue("Unassignedtimechange", "Unassigned", "Minutes"));
		unassignedGS.setAM_PM(testDataSheet.getCellValue("Unassignedtimechange", "Unassigned", "AM_PM"));
		unassignedWebScripts.Unassignedtimeonly(unassignedGS);
		
	}

	@Test(priority=3)
	public void Unassignedondemanddatetimeonly() throws InterruptedException
	{
		unassignedGS.setSelectdate(testDataSheet.getCellValue("Unassignedtimeanddatechange", "Unassigned", "Selectdate"));
		unassignedGS.setHour(testDataSheet.getCellValue("Unassignedtimeanddatechange", "Unassigned", "Hour"));
		unassignedGS.setMinutes(testDataSheet.getCellValue("Unassignedtimeanddatechange", "Unassigned", "Minutes"));
		unassignedGS.setAM_PM(testDataSheet.getCellValue("Unassignedtimeanddatechange", "Unassigned", "AM_PM"));
		unassignedWebScripts.UnassignedDateandtime(unassignedGS);
		
	}

}
	
	

	
	

	


