package com.urloopWebScripts;

import java.awt.AWTException;

import org.hamcrest.core.StringContains;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Tring.nbc.utils.CommonUtils;
import com.Tring.nbc.utils.WebScriptConstants;
import com.excelGetterSetter.ServicesGS;
import com.urloopWebPages.Browser;

public class ServicesWebScripts {
	
	public static void slideMainMenuServiceClick() throws InterruptedException{
		Thread.sleep(15000);
		Browser.findElementByPath(WebScriptConstants.SERVICESMAINMENU).click();
		
		
Thread.sleep(5000);
		
		WebElement v = Browser.findElementByPath(WebScriptConstants.SERVICE_BREAD_CRUMS);
		((JavascriptExecutor)Browser.driver).executeScript("arguments[0].scrollIntoView();", v);

		
	}
	
	
	public static void roomRentService(ServicesGS servicesGS) throws InterruptedException{
		
		slideMainMenuServiceClick();
		
		Thread.sleep(10000);
		
		WebElement targetElement = Browser
				.findElementByPath(WebScriptConstants.ROOMSERVICE);
		Actions action = new Actions(Browser.driver);
		/* action.click(targetElement); */
		action.moveToElement(targetElement);
		action.perform();
        
		Thread.sleep(5000);
		
		Browser.findElementByPath(WebScriptConstants.ROOMSERVICEHOVER).click();
		Thread.sleep(10000);
		Browser.findElementByPath(WebScriptConstants.ROOMNAME).sendKeys(servicesGS.getRoomName());
		Thread.sleep(5000);
		
		System.out.println("Room Price :"+servicesGS.getRoomRentPrice());
		
		Browser.findElementByPath(WebScriptConstants.ROOMRENTPRICE).sendKeys(String.valueOf(servicesGS.getRoomRentPrice()));
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.ROOMDESCRIPTION).sendKeys(servicesGS.getDecription());
		System.out.println("Room Description :"+servicesGS.getDecription());
		Thread.sleep(10000);
		Browser.findElementByPath(WebScriptConstants.SAVERENTOPTION).click();
		Thread.sleep(10000);
		
		JavascriptExecutor jse = (JavascriptExecutor) Browser.driver;
		
		jse.executeScript("window.scrollBy(0,-250)", "");
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.SAVE).click();

	}
	
	public static void boardingRentPrice(ServicesGS servicesGS) throws InterruptedException{
		
		
		slideMainMenuServiceClick();
		Thread.sleep(5000);
		
	    WebElement targetElement = Browser
				.findElementByPath(WebScriptConstants.BOARDINGSERVICE);
		Actions action = new Actions(Browser.driver);
		action.moveToElement(targetElement);
		action.perform();
        
		Thread.sleep(5000);
		
		Browser.findElementByPath(WebScriptConstants.BOARDINGSERVICEHOVER).click();
		Thread.sleep(10000);
		
		Browser.findElementByPath(WebScriptConstants.BOARDINGPACKAGENAME).sendKeys(servicesGS.getPackageName());
		Thread.sleep(5000);
		
		Browser.findElementByPath(WebScriptConstants.BOARDINGPACKAGEPRICE).sendKeys(servicesGS.getPackageBasePrice());
		Thread.sleep(5000);
		
		
		JavascriptExecutor jse = (JavascriptExecutor) Browser.driver;
		jse.executeScript("window.scrollBy(0,150)", "");
		Thread.sleep(5000);
	
		Thread.sleep(5000);
	    WebElement bOARDINGSELECTSERVICEVALUE = Browser
				.findElementByPath(WebScriptConstants.BOARDINGSELECTSERVICEVALUE);
		JavascriptExecutor bOARDINGSELECTSERVICEVALUEexecutor = (JavascriptExecutor)Browser.driver;
		bOARDINGSELECTSERVICEVALUEexecutor.executeScript("arguments[0].click();", bOARDINGSELECTSERVICEVALUE);
		
		Thread.sleep(5000);
		
		WebElement bOARDINGSELECTQUANTITYVALUE = Browser
				.findElementByPath(String.format(WebScriptConstants.BOARDINGSELECTQUANTITYVALUE, servicesGS.getPackageSelectQuantity()));
		JavascriptExecutor bOARDINGSELECTQUANTITYVALUEexecutor = (JavascriptExecutor)Browser.driver;
		bOARDINGSELECTQUANTITYVALUEexecutor.executeScript("arguments[0].click();", bOARDINGSELECTQUANTITYVALUE);
		
		
Thread.sleep(5000);
		
		WebElement bOARDINGSELECTOCCURRENCEVALUE = Browser
				.findElementByPath(String.format(WebScriptConstants.BOARDINGSELECTOCCURRENCEVALUE, servicesGS.getPackageSelectOccurrence()));
		JavascriptExecutor bOARDINGSELECTOCCURRENCEVALUEexecutor = (JavascriptExecutor)Browser.driver;
		bOARDINGSELECTOCCURRENCEVALUEexecutor.executeScript("arguments[0].click();", bOARDINGSELECTOCCURRENCEVALUE);
		
		
Thread.sleep(5000);
		
		WebElement bOARDINGGLOBALHTML = Browser
				.findElementByPath(WebScriptConstants.BOARDINGGLOBALHTML);
		JavascriptExecutor bOARDINGGLOBALHTMLexecutor = (JavascriptExecutor)Browser.driver;
		bOARDINGGLOBALHTMLexecutor.executeScript("arguments[0].click();", bOARDINGGLOBALHTML);
		
		Thread.sleep(5000);
		
		Browser.findElementByPath(WebScriptConstants.BOARDINGMEALVOUCHERSFIELD).sendKeys(servicesGS.getPackageNumberOfVouchers());
		Thread.sleep(5000);
		
		Browser.findElementByPath(WebScriptConstants.BOARDINGMEALVOUCHERSPERDAYFIELD).sendKeys(servicesGS.getPackageNumberOfVouchersPerDay());
		Thread.sleep(5000);
		
		Browser.findElementByPath(WebScriptConstants.BOARDINGMEALPRICEPERVOUCHERS).sendKeys(servicesGS.getPackagePricePerVoucher());
		Thread.sleep(5000);
		
		
		Browser.findElementByPath(WebScriptConstants.BOARDINGSAVEPACKAGE).click();
		Thread.sleep(5000);
		
		JavascriptExecutor jsec = (JavascriptExecutor) Browser.driver;
		jsec.executeScript("window.scrollBy(0,-250)", "");
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.BOARDINGGLOBALSAVE).click();
	
	}
	
	public static void newServiceCreation(ServicesGS servicesGS) throws InterruptedException, AWTException{
		
		slideMainMenuServiceClick();
		
		Thread.sleep(10000);
		Browser.findElementByPath(WebScriptConstants.CREATE_A_NEW_SERVICE).click();
		
		
Thread.sleep(10000);
		
		WebElement v = Browser.findElementByPath(WebScriptConstants.SERVICE_BREAD_CRUMS);
		((JavascriptExecutor)Browser.driver).executeScript("arguments[0].scrollIntoView();", v);

		
		Thread.sleep(10000);
		CommonUtils.attachment(".//*[@id='fileinfo']/a[text()='Add Image']","Group.jpg");
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.SERVICENAME).sendKeys(servicesGS.getServiceName());
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.SERVICECATEGORYFIELD).click();
		
		
		Thread.sleep(5000);
		Browser.findElementByPath(String.format(WebScriptConstants.SERVICECATEGORYSELECTION,servicesGS.getServiceCategory())).click();
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.SERVICEDURATION).sendKeys(servicesGS.getServiceTaskDuration());
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.SERVICEMINUTESORHOURSFIELD).click();
		
		
		if(servicesGS.getServiceMinutesOrHours().trim().equals("Minutes")){
			Thread.sleep(5000);
			Browser.findElementByPath(WebScriptConstants.SERVICEMINUTESORHOURSSELECTIONMINUTES).click();
		}
		
		else if(servicesGS.getServiceMinutesOrHours().trim().equals("Hours")){
			Thread.sleep(5000);
			Browser.findElementByPath(WebScriptConstants.SERVICEMINUTESORHOURSSELECTIONHOURS).click();
		}
		else{}
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.SERVICESERVICETEAMFIELD).click();
		
		Thread.sleep(5000);
		Browser.findElementByPath(String.format(WebScriptConstants.SERVICESERVICETEAM,servicesGS.getServiceServiceTeam())).click();

		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.SERVICEDESCRIPTION).sendKeys(servicesGS.getServiceDescription());
		
		if(Boolean.valueOf(servicesGS.getServiceOnDemandServiceBoolean())){
			
			Thread.sleep(5000);
			Browser.findElementByPath(WebScriptConstants.SERVICEONDEMANDBOOLEAN).click();
			
			Thread.sleep(5000);
			Browser.findElementByPath(WebScriptConstants.SERVICE_ONDEMAND_BOOLEANBASECOST_PRICE).sendKeys(servicesGS.getServiceOnDemandServiceBoolean_baseCostPrice());
			
			Thread.sleep(5000);
			Browser.findElementByPath(WebScriptConstants.SERVICE_ONDEMAND_BOOLEAN_BASEBILLABLE_PRICE).sendKeys(servicesGS.getServiceOnDemandServiceBoolean_basebillablePrice());
			}
		else{}
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.SERVICE_DAILY_BASE_COST_PRICE).sendKeys(servicesGS.getServiceDailyCostPrice());
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.SERVICE_DAILY_BASE_BILLABLE_PRICE).sendKeys(servicesGS.getServiceDailyBillablePrice());

		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.SERVICE_WEEKLY_BASE_COST_PRICE).sendKeys(servicesGS.getServiceWeeklyCostPrice());
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.SERVICE_WEEKLY_BASE_BILLABLE_PRICE).sendKeys(servicesGS.getServiceWeeklyBillablePrice());
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.SERVICE_MONTH_BASE_COST_PRICE).sendKeys(servicesGS.getServiceMonthlyCostPrice());
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.SERVICE_MONTH_BASE_BILLABLE_PRICE).sendKeys(servicesGS.getServiceMonthlyBillablePrice());

		
Thread.sleep(5000);
		
		WebElement c = Browser.findElementByPath(WebScriptConstants.SERVICE_BREAD_CRUMS);
		((JavascriptExecutor)Browser.driver).executeScript("arguments[0].scrollIntoView();", c);
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.SAVE).click();
		}
	

}
