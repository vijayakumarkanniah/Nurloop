package com.urloopWebScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import webScriptsConstants.UnassignedWebScriptsConstants;
import webScriptsConstants.BookaserviceWebScriptsConstants;
import com.excelGetterSetter.UnassignedGS;
import com.urloopWebPages.Browser;
import com.urloopWebScripts.LoginWebScripts;
import com.urloopWebPages.LoginWebPages;

public class UnassignedWebScripts {
	
	
	public JavascriptExecutor jse = (JavascriptExecutor) Browser.driver;
	public void Unassignedtimeonly(UnassignedGS unassignedGS) throws InterruptedException {
		
		Thread.sleep(5000);
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_SERVICESMENU).click();
		Thread.sleep(15000);
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_ONDEMANDTAB).click();
		Thread.sleep(10000);

		
		System.out.println(Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_TIMELABEL).getText());
		
		if(Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_TIMELABEL).getText().equals("09:00 AM"))
		{
		
		Thread.sleep(5000);	
		WebElement web_Element_To_Be_Hovered = Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_TIMELABEL);
		Actions builder = new Actions(Browser.driver);
		builder.moveToElement(web_Element_To_Be_Hovered).build().perform();
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_SCHEDULEBUTTON).click();
		Thread.sleep(15000);
		
		//Select time from the time picker
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_TIMEPICKER).click();
		Thread.sleep(5000);
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_HOUR).click();
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_HOUR).clear();
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_HOUR).sendKeys(unassignedGS.getHour());
		Thread.sleep(5000);
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_MINUTES).click();
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_MINUTES).clear();
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_MINUTES).sendKeys(unassignedGS.getMinutes());
		Thread.sleep(5000);
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_STAFFDROPDOWN).click();
		Thread.sleep(5000);
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_SELECTSTAFF).click();
		Thread.sleep(5000);
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_SAVEBUTTON).click();
		Thread.sleep(10000);
		
		
		}
		
		
	}  	
	
	public void UnassignedDateandtime(UnassignedGS unassignedGS) throws InterruptedException
	{
		Thread.sleep(5000);
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_SERVICESMENU).click();
		Thread.sleep(15000);
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_ONDEMANDTAB).click();
		
		Thread.sleep(15000);
		
		System.out.println(Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_TIMELABEL1).getText());
		
		if(Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_TIMELABEL1).getText().equals("08:00 AM"))
		{
		
		Thread.sleep(5000);	
		WebElement web_Element_To_Be_Hovered = Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_TIMELABEL1);
		Actions builder = new Actions(Browser.driver);
		builder.moveToElement(web_Element_To_Be_Hovered).build().perform();
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_SCHEDULEBUTTON).click();
		Thread.sleep(15000);
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_SERVICEDATE).click();
		Thread.sleep(5000);
		WebElement datepick = Browser.findElementByPath(BookaserviceWebScriptsConstants.DATE_PICKER);
		List<WebElement> noOfColumns = datepick.findElements(By.tagName(BookaserviceWebScriptsConstants.TD));
		// Loop will rotate till expected date not found.
		for (WebElement cell : noOfColumns) {
			// Select the date from date picker when condition match.
			// "+"Recreation"+"
			if (cell.getText().equals(unassignedGS.getSelectdate())) {
				cell.findElement(By.linkText(unassignedGS.getSelectdate())).click();
				break;
			} }
			
		Thread.sleep(10000);
		//Select time from the time picker
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_TIMEPICKER).click();
		Thread.sleep(5000);
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_HOUR).click();
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_HOUR).clear();
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_HOUR).sendKeys(unassignedGS.getHour());
		Thread.sleep(5000);
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_MINUTES).click();
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_MINUTES).clear();
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_MINUTES).sendKeys(unassignedGS.getMinutes());
		Thread.sleep(5000);
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_STAFFDROPDOWN).click();
		Thread.sleep(5000);
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_SELECTSTAFF1).click();
		Thread.sleep(5000);
		Browser.findElementByPath(UnassignedWebScriptsConstants.UNASSIGNED_SAVEBUTTON).click();
		Thread.sleep(10000);
		
		
		}
		
	
	}

}
