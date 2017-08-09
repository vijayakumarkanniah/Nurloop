package com.urloopWebScripts;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Tring.nbc.utils.CommonUtils;
import com.Tring.nbc.utils.WebScriptConstants;
import com.excelGetterSetter.ResidentGS;
import com.urloopWebPages.Browser;

public class ResidentWebScripts {
	
	public static void createResident(ResidentGS residentGS) throws InterruptedException, AWTException{
		
		Thread.sleep(15000);
		Browser.findElementByPath(WebScriptConstants.RESIDENT_MAINMENU).click();
		
		Thread.sleep(10000);
		Browser.findElementByPath(WebScriptConstants.RESIDENT_CREATEBUTTON).click();
		
		Thread.sleep(10000);
		CommonUtils.attachment(".//*[@id='fileinfo']/a[text()='Add Image']","Group.jpg");
		
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.RESIDENT_FIRSTNAME_FIELD).sendKeys(residentGS.getFirstName());
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.RESIDENT_LASTNAME_FIELD).sendKeys(residentGS.getLastName());
		
		
		Thread.sleep(5000);
		WebElement rESIDENT_GENDER_VALUE = Browser
				.findElementByPath(String.format(WebScriptConstants.RESIDENT_GENDER_VALUE, residentGS.getGender()));
		JavascriptExecutor rESIDENT_GENDER_VALUEexecutor = (JavascriptExecutor)Browser.driver;
		rESIDENT_GENDER_VALUEexecutor.executeScript("arguments[0].click();", rESIDENT_GENDER_VALUE);
		
		Thread.sleep(5000);
		WebElement rESIDENT_DOB = Browser
				.findElementByPath(String.format(WebScriptConstants.RESIDENT_DOB, residentGS.getBirthYear()));
		JavascriptExecutor rESIDENT_DOBexecutor = (JavascriptExecutor)Browser.driver;
		rESIDENT_DOBexecutor.executeScript("arguments[0].click();", rESIDENT_DOB);
		
Thread.sleep(5000);
		
		WebElement bOARDINGGLOBALHTML = Browser
				.findElementByPath(WebScriptConstants.BOARDINGGLOBALHTML);
		JavascriptExecutor bOARDINGGLOBALHTMLexecutor = (JavascriptExecutor)Browser.driver;
		bOARDINGGLOBALHTMLexecutor.executeScript("arguments[0].click();", bOARDINGGLOBALHTML);
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.RESIDENT_EMAIL).sendKeys(residentGS.getEmail());
		
		Thread.sleep(5000);
		WebElement rESIDENT_COUNTRY = Browser
				.findElementByPath(String.format(WebScriptConstants.RESIDENT_COUNTRY, residentGS.getCountryCode()));
		JavascriptExecutor rESIDENT_COUNTRYexecutor = (JavascriptExecutor)Browser.driver;
		rESIDENT_COUNTRYexecutor.executeScript("arguments[0].click();", rESIDENT_COUNTRY);
		
Thread.sleep(5000);
		
		WebElement bOARDINGGLOBALHTMLz = Browser
				.findElementByPath(WebScriptConstants.BOARDINGGLOBALHTML);
		JavascriptExecutor bOARDINGGLOBALHTMLzexecutor = (JavascriptExecutor)Browser.driver;
		bOARDINGGLOBALHTMLzexecutor.executeScript("arguments[0].click();", bOARDINGGLOBALHTMLz);
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.RESIDENT_PHONE).sendKeys(residentGS.getCellPhone());
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.RESIDENT_ADDRESS_1).sendKeys(residentGS.getAdderssLine_1());
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.RESIDENT_ADDRESS_2).sendKeys(residentGS.getAdderssLine_2());
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.RESIDENT_BIO).sendKeys(residentGS.getResidentBio());
		
Thread.sleep(5000);
		
		WebElement c = Browser.findElementByPath(WebScriptConstants.SERVICE_BREAD_CRUMS);
		((JavascriptExecutor)Browser.driver).executeScript("arguments[0].scrollIntoView();", c);
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.RESIDENT_SAVE).click();
		
	}

}
