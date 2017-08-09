package com.urloopWebScripts;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Tring.nbc.utils.CommonUtils;
import webScriptsConstants.*;
import com.excelGetterSetter.StaffGS;
import com.urloopWebPages.Browser;

public class StaffWebScripts {
	
	public static void staffCreation(StaffGS staffGS) throws InterruptedException, AWTException{
		
		Thread.sleep(15000);
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_MAINMENU).click();
		
		Thread.sleep(10000);
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_CREATEBUTTON).click();
		
		Thread.sleep(10000);
		CommonUtils.attachment(".//*[@id='fileinfo']/a[text()='Add Image']","Group.jpg");
	
		Thread.sleep(10000);
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_FIRSTNAME).sendKeys(staffGS.getFirstName());
			
	
		Thread.sleep(5000);
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_LASTNAME).sendKeys(staffGS.getLastName());
	
		
Thread.sleep(5000);
		
		WebElement sTAFF_GENDER = Browser
				.findElementByPath(String.format(StaffWebScriptsConstants.STAFF_GENDER, staffGS.getGender()));
		JavascriptExecutor sTAFF_GENDERexecutor = (JavascriptExecutor)Browser.driver;
		sTAFF_GENDERexecutor.executeScript("arguments[0].click();", sTAFF_GENDER);
		
Thread.sleep(5000);


Thread.sleep(5000);

WebElement bOARDINGGLOBALHTML = Browser
		.findElementByPath(StaffWebScriptsConstants.STAFFGLOBALHTML);
JavascriptExecutor bOARDINGGLOBALHTMLexecutor = (JavascriptExecutor)Browser.driver;
bOARDINGGLOBALHTMLexecutor.executeScript("arguments[0].click();", bOARDINGGLOBALHTML);
		


		/*WebElement c = Browser.findElementByPath(StaffWebScriptsConstants.SERVICE_BREAD_CRUMS);  BOARDINGGLOBALHTML
		((JavascriptExecutor)Browser.driver).executeScript("arguments[0].scrollIntoView();", c);*/


		Thread.sleep(5000);
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_EMAIL).sendKeys(staffGS.getEmail());
	
Thread.sleep(5000);
		

System.out.println("Country :"+String.format(StaffWebScriptsConstants.STAFF_COUNTRYCODE, staffGS.getCountryCode()));

		WebElement sTAFF_CountryCode = Browser
				.findElementByPath(String.format(StaffWebScriptsConstants.STAFF_COUNTRYCODE, staffGS.getCountryCode()));
		JavascriptExecutor sTAFF_CountryCodeexecutor = (JavascriptExecutor)Browser.driver;
		sTAFF_CountryCodeexecutor.executeScript("arguments[0].click();", sTAFF_CountryCode);
		
		
Thread.sleep(5000);
		
Thread.sleep(5000);

WebElement bOARDINGGLOBALHTMLs = Browser
		.findElementByPath(StaffWebScriptsConstants.STAFFGLOBALHTML);
JavascriptExecutor bOARDINGGLOBALHTMLsexecutor = (JavascriptExecutor)Browser.driver;
bOARDINGGLOBALHTMLsexecutor.executeScript("arguments[0].click();", bOARDINGGLOBALHTMLs);
		
		Thread.sleep(5000);
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_CELLPHONE).sendKeys(staffGS.getCellPhone());
	
		Thread.sleep(5000);
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_BIO).sendKeys(staffGS.getStaffBio());
	
Thread.sleep(5000);
		
		WebElement sTAFF_ServiceTeam = Browser
				.findElementByPath(String.format(StaffWebScriptsConstants.STAFF_SERVICETEAM, staffGS.getServiceTeam()));
		JavascriptExecutor sTAFF_ServiceTeamexecutor = (JavascriptExecutor)Browser.driver;
		sTAFF_ServiceTeamexecutor.executeScript("arguments[0].click();", sTAFF_ServiceTeam);
		
		
		Thread.sleep(5000);

		WebElement bOARDINGGLOBALHTMLsz = Browser
				.findElementByPath(StaffWebScriptsConstants.STAFFGLOBALHTML);
		JavascriptExecutor bOARDINGGLOBALHTMLszexecutor = (JavascriptExecutor)Browser.driver;
		bOARDINGGLOBALHTMLszexecutor.executeScript("arguments[0].click();", bOARDINGGLOBALHTMLsz);
		
		Thread.sleep(5000);
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_WORKINGHOURS_SUNDAY_STARTTIME).click();
		
		Thread.sleep(5000);
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_INPUT_2_1).clear();
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_INPUT_2_1).sendKeys("7");
		Thread.sleep(5000);
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_INPUT_2_3).clear();
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_INPUT_2_3).sendKeys("20");
		Thread.sleep(5000);
	
		
		Thread.sleep(5000);
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_WORKINGHOURS_SUNDAY_ENDTIME).click();
		
		Thread.sleep(5000);
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_INPUT_2_1).clear();
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_INPUT_2_1).sendKeys("9");
		Thread.sleep(5000);
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_INPUT_2_3).clear();
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_INPUT_2_3).sendKeys("20");
		Thread.sleep(5000);
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_PASSWORD).click();
		
		
Thread.sleep(5000);
		
		WebElement c = Browser.findElementByPath(StaffWebScriptsConstants.STAFF_BREAD_CRUMS);
		((JavascriptExecutor)Browser.driver).executeScript("arguments[0].scrollIntoView();", c);
		
		Thread.sleep(5000);
		Browser.findElementByPath(StaffWebScriptsConstants.STAFF_SAVE).click();

		

	}

}
