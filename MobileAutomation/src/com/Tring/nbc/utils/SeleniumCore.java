package com.Tring.nbc.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import io.appium.java_client.android.AndroidDriver;

import com.Tring.nbc.core.FrontEndTest;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SeleniumCore extends FrontEndTest {

	/** The Constant PAGE_LOAD_TIMEOUT. */
	private static final long PAGE_LOAD_TIMEOUT = 15;

	/** The Constant ASYNC_SCRIPT_TIMEOUT. */
	public  static final long ASYNC_SCRIPT_TIMEOUT = 3;

	/** Variables declaration for Logger class. */
	private final Logger logger = Logger.getLogger(SeleniumCore.class);
	JavascriptExecutor executor;

	public FluentWait<WebDriver> wait;
	public  String scr_path=System.getProperty("user.dir");
	//Invoking the SeleniumCore class constructor
	AndroidDriver ADdriver;

	/*Checks if is element present.*/
	public boolean isElementExist(WebElement element) {
		Boolean result;
		wait.until(ExpectedConditions.visibilityOf(element));
		if(element.isDisplayed()) {
			result=true;
		}else {
			result=false;
		}
		return result;
	}

	/*Checks if is element enabled. */
	public boolean isEnabled(WebElement object) {
		try {
			object.isEnabled();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/*Checks if is element enabled. */
	public boolean isEnabled(WebElement object,String elementName) throws IOException {
		try {
			object.isEnabled();
			test_Report_child.log(LogStatus.PASS,elementName+" should be available",elementName+" is Enabled");
			return true;
		} catch (Exception e) {
			logStatusFail(elementName+" should be available",getScreenshot(elementName+" is not Enabled"));
			jsonObject.put(scenarioName, "Fail");
			Assert.fail(elementName+" is not available", e);
			logger.info(e.toString());
			return false;
		}
	}
	/*Wait for milli seconds.*/
	public void waitForMilliSeconds(long number) {
		try {
			Thread.sleep(number);
		} catch (InterruptedException ie) {
			logger.info(ie.getMessage());
			jsonObject.put(scenarioName, "Fail");
		}
	}

	/* Wait for PageLoad */
	public void waitForPageToLoad(WebDriver driver,WebElement element) {
		try {
			wait = new FluentWait<WebDriver>(driver);
			wait.pollingEvery(800, TimeUnit.MILLISECONDS);
			wait.withTimeout(30, TimeUnit.SECONDS);
			wait.ignoring(NoSuchElementException.class);			
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException ex) {
			jsonObject.put(scenarioName, "Fail");
			Assert.fail(element+" is not available",ex);
			System.out.println(" Page Load Failed after waiting for : "+ PAGE_LOAD_TIMEOUT + "  second(s)");
			logger.info(ex.toString());
		}
	}

	/*Wait for an element to be click*/
	public void waitForAnElementToClick(WebDriver driver,WebElement element) throws Exception {
		try {
			wait = new FluentWait<WebDriver>(driver);
			wait.pollingEvery(500, TimeUnit.MILLISECONDS);
			wait.withTimeout(30, TimeUnit.SECONDS);
			wait.ignoring(NoSuchElementException.class);			
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			jsonObject.put(scenarioName, "Fail");
			Assert.fail(element.getText()+" is not available",e);
			logStatusFail(element.getText()+"should be available",getScreenshot(element.getText()+" is not available"));
			logger.info(e.toString());
		}
	}	

	public boolean isDisplayed(WebElement element,String elementName) throws IOException 	{
		try {
			element.isDisplayed();
			test_Report_child.log(LogStatus.PASS,elementName+" should be available",elementName+" is available");
			return true;		
		} catch (Exception e) {
			logStatusFail(elementName+" should be available",getScreenshot(elementName+" is not available"));
			jsonObject.put(scenarioName, "Fail");
			Assert.fail(elementName+" is not available", e);
			logger.info(e.toString());
			e.printStackTrace();
			return false;
		}
	}

	public boolean isSelected(WebElement element,String elementName) throws IOException {
		try {
			element.isSelected();
			test_Report_child.log(LogStatus.PASS,elementName+" should be Selected",elementName+" is Selected");
			return true;		
		} catch (Exception e) {
			logStatusFail(elementName+" should be Selected",getScreenshot(elementName+" is not Selected"));
			jsonObject.put(scenarioName, "Fail");
			Assert.fail(elementName+" is not Selected", e);
			logger.info(e.toString());
			e.printStackTrace();
			return false;
		}
	}

	/*Enter text in text box */
	public void enterTextBoxValue(WebElement element,String value) throws Exception {		 
		try {
			element.clear();
			if (element.isDisplayed()){
				element.clear();
				element.sendKeys(value);
				test_Report_child.log(LogStatus.PASS, "Entering Value "+value, value+" Entered successfully");
			}
		} catch (Exception e) {
			logStatusFail("Entering Value "+value,getScreenshot("Error while entering value "));
			jsonObject.put(scenarioName, "Fail");
			Assert.fail("Error while entering value", e);
			logger.info(e.toString());
			e.printStackTrace();
		} 
	}

	public void enterTextBoxValue(WebElement element,String value,ExtentTest testlocal) throws Exception 	{		
		try {
			if (element.isDisplayed()) {
				element.clear();
				element.sendKeys(value);
				testlocal.log(LogStatus.PASS, "Entering Value "+value, value+" Entered successfully");
			}
		} catch (Exception e) {
			logStatusFail("Entering Value "+value,getScreenshot("Error while entering value "));
			Assert.fail("Error while entering value", e);
			logger.info(e.toString());
			e.printStackTrace();
		} 
	}

	/* Click on Element	 */
	public boolean clickonElement(WebElement element,String elementName,ExtentTest extentTest) throws IOException {
		try {			
			waitForAnElementToClick(driver, element);
			element.click();
			extentTest.log(LogStatus.PASS, "Clicking on "+elementName, elementName+" Clicked Successfully");
			return true;
		} catch (Exception e) {
			extentTest.log(LogStatus.FAIL, "Clicking on "+elementName,getScreenshot("Error  While clicking on "+elementName));
			logger.info(e.toString());
			Assert.fail("Error while clicking", e);
			e.printStackTrace();
			return false;
		}
	}

	public boolean clickonElement(WebElement element,String elementName) throws IOException {
		try {			
			waitForAnElementToClick(driver, element);
			element.click();
			logStatusPass("Clicking on "+elementName, elementName+" Clicked Successfully");
			return true;
		} catch (Exception e) {
			logStatusFail("Clicking on "+elementName,getScreenshot("Error  While clicking on "+elementName));
			logger.info(LogStatus.FAIL);
			jsonObject.put(scenarioName, "Fail");
			Assert.fail("Error while clicking", e);
			logger.info(e.toString());
			return false;
		}
	}

	/* Verify Element text	 */
	public void verifyElementText(WebElement element,String value) throws Exception {		
		try {
			waitForPageToLoad(driver, element);
			if(element.getText().trim().equals(value.trim()))	{
				test_Report_child.log(LogStatus.PASS, "Verifying "+value+" should be available",value+" is available");
			}else {
				test_Report_child.log(LogStatus.FAIL, "Verifying "+value+" should be available",getScreenshot(value+" is  not available"));
			}
		} catch (Exception e) {
			logStatusFail("Verifying "+value+" should be available",getScreenshot(" Error While Verifying text "+value));
			jsonObject.put(scenarioName, "Fail");
			Assert.fail("Error in verifying text...", e);
			logger.info(e.toString());
			e.printStackTrace();
		}
	}
	public void verifyElementTextContains(WebElement element,String value) throws Exception {		
		try {
			waitForPageToLoad(driver, element);
			if(element.getText().trim().contains(value.trim()))	
			{
				test_Report_child.log(LogStatus.PASS, "Verifying "+value+" should be available",value+" is available");
			}else {
				test_Report_child.log(LogStatus.FAIL, "Verifying "+value+" should be available",getScreenshot(value+" is  not available"));
			}
		} catch (Exception e) {
			logStatusFail("Verifying "+value+" should be available",getScreenshot(" Error While Verifying text "+value));
			jsonObject.put(scenarioName, "Fail");
			Assert.fail("Error in verifying text...", e);
			logger.info(e.toString());
			e.printStackTrace();
		}
	}
	//Verifying Column Headers for the grid
	public void verifyColumnHeaders(List<WebElement> availableHeaders, String[] headers) throws IOException 
	{			
		Iterator<WebElement> iter = availableHeaders.iterator();
		List<String> hds = new ArrayList<String>();
		while(iter.hasNext()) 	{
			WebElement we = iter.next(); {
				hds.add(we.getText().trim());
			}
		}
		for (String str : headers){
			if(hds.contains(str.trim()))	{
				test_Report_child.log(LogStatus.PASS, "Verifying "+str.trim()+" Header should be available",str.trim()+" header is available");
			}else {
				test_Report_child.log(LogStatus.FAIL, "Verifying "+str.trim()+" Header should be available",str.trim()+" header is not available");
			}
		}
	}

	//Method to get Screen shot
	public String getScreenshot(String fileName) throws IOException {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String newFileName = currDir+"\\Extend Reports\\Screenshots\\"+fileName+"_"+strDate+".png";
		FileUtils.copyFile(scrFile, new File(newFileName));
		String link="<a target='_blank' href='"+newFileName+"'><font color='red'> <u>"+fileName+"</u></font></a>";
		return link ;       
	}

	/*Selecting values using Dropdown index*/
	public void select_Using_index(WebElement object,int index){
		Select select=new Select(object);
		select.selectByIndex(index);
	}

	/*Selecting values using Dropdown index*/
	public void select_Using_Value(WebElement object,String value){
		Select select=new Select(object);
		select.selectByValue(value);
	}

	/* Selecting values using Dropdown index */
	public void select_Using_Text(WebElement object,String text){
		Select select=new Select(object);
		select.selectByVisibleText(text);
	}

	public boolean clickonElement_JavaExecutor(WebElement element,String elementName) throws IOException {
		try {			
			waitForAnElementToClick(driver, element);
			executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			logStatusPass("Clicking on "+elementName, elementName+" Clicked Successfully");
			return true;
		} catch (Exception e) {
			logStatusFail("Clicking on "+elementName,"Error  While clicking on "+elementName);
			logger.info(LogStatus.FAIL);
			jsonObject.put(scenarioName, "Fail");
			Assert.fail("Error while clicking", e);
			logger.info(e.toString());
			return false;
		}
	}

	public void wait_For_Time(int timeSeconds)
	{
		driver.manage().timeouts().implicitlyWait(timeSeconds, TimeUnit.SECONDS);
	}
	public void validateInvalidPageNumber(WebElement currentPageTextbox,WebElement totalPageLabel,WebElement errorMessage)throws Exception
	{
		try {
			waitForMilliSeconds(2000);
			String totPage = totalPageLabel.getText();
			String[] totalpages = totPage.split(" ");
			int totalPageNo =Integer.parseInt(totalpages[1]);
			int newPageNo = totalPageNo+1;
			enterTextBoxValue(currentPageTextbox, Integer.toString(newPageNo));
			currentPageTextbox.sendKeys(Keys.ENTER);
			verifyElementText(errorMessage, "Invalid page number");
		} catch (Exception e) {
			logStatusFail("validate Invalid page Number ",getScreenshot("Error  validate Invalid page Number message "));
			logger.info(LogStatus.FAIL);
			jsonObject.put(scenarioName, "Fail");
			Assert.fail("Error while clicking", e);
			e.printStackTrace();
		}
	}

	public void wait_For_Element_Click(WebElement object,String elementName) {
		for(int i=0;i<=60;i++){
			if(object.isDisplayed()){
				try{
					clickonElement_JavaExecutor(object, elementName);
					break; 
				}catch(Exception e){
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				}
			}		
		}
	}

	public void Swipe_Horizontal(WebElement element) {
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getWidth() * 0.99;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getWidth() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		WebElement size = element;
		((AndroidDriver) driver).swipe(scrollStart,0,scrollEnd,0,1000);
	}

	public void Swipe_Vertical(WebElement element) {
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		WebElement size = element;
		((AndroidDriver) driver).swipe(0,scrollStart,0,scrollEnd,1000);
	}	
}

