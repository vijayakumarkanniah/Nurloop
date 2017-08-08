package com.urloopWebScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.Tring.nbc.utils.WebScriptConstants;
import com.excelGetterSetter.UnassignedGS;
import com.urloopWebPages.Browser;
import com.urloopWebScripts.LoginWebScripts;
import com.urloopWebPages.LoginWebPages;

public class UnassignedWebScripts {
	
	
	public JavascriptExecutor jse = (JavascriptExecutor) Browser.driver;
	public void Unassignedtimeonly(UnassignedGS unassignedGS) throws InterruptedException {
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_SERVICESMENU).click();
		Thread.sleep(15000);
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_ONDEMANDTAB).click();
		Thread.sleep(10000);

		
		System.out.println(Browser.findElementByPath(WebScriptConstants.UNASSIGNED_TIMELABEL).getText());
		
		if(Browser.findElementByPath(WebScriptConstants.UNASSIGNED_TIMELABEL).getText().equals("09:00 AM"))
		{
		
		Thread.sleep(5000);	
		WebElement web_Element_To_Be_Hovered = Browser.findElementByPath(WebScriptConstants.UNASSIGNED_TIMELABEL);
		Actions builder = new Actions(Browser.driver);
		builder.moveToElement(web_Element_To_Be_Hovered).build().perform();
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_SCHEDULEBUTTON).click();
		Thread.sleep(15000);
		
		//Select time from the time picker
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_TIMEPICKER).click();
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_HOUR).click();
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_HOUR).clear();
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_HOUR).sendKeys(unassignedGS.getHour());
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_MINUTES).click();
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_MINUTES).clear();
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_MINUTES).sendKeys(unassignedGS.getMinutes());
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_STAFFDROPDOWN).click();
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_SELECTSTAFF).click();
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_SAVEBUTTON).click();
		Thread.sleep(10000);
		
		
		}
		
		
	}  	
	
	public void UnassignedDateandtime(UnassignedGS unassignedGS) throws InterruptedException
	{
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_SERVICESMENU).click();
		Thread.sleep(15000);
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_ONDEMANDTAB).click();
		
		Thread.sleep(15000);
		
		System.out.println(Browser.findElementByPath(WebScriptConstants.UNASSIGNED_TIMELABEL1).getText());
		
		if(Browser.findElementByPath(WebScriptConstants.UNASSIGNED_TIMELABEL1).getText().equals("08:00 AM"))
		{
		
		Thread.sleep(5000);	
		WebElement web_Element_To_Be_Hovered = Browser.findElementByPath(WebScriptConstants.UNASSIGNED_TIMELABEL1);
		Actions builder = new Actions(Browser.driver);
		builder.moveToElement(web_Element_To_Be_Hovered).build().perform();
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_SCHEDULEBUTTON).click();
		Thread.sleep(15000);
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_SERVICEDATE).click();
		Thread.sleep(5000);
		WebElement datepick = Browser.findElementByPath(WebScriptConstants.DATE_PICKER);
		List<WebElement> noOfColumns = datepick.findElements(By.tagName(WebScriptConstants.TD));
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
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_TIMEPICKER).click();
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_HOUR).click();
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_HOUR).clear();
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_HOUR).sendKeys(unassignedGS.getHour());
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_MINUTES).click();
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_MINUTES).clear();
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_MINUTES).sendKeys(unassignedGS.getMinutes());
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_STAFFDROPDOWN).click();
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_SELECTSTAFF1).click();
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.UNASSIGNED_SAVEBUTTON).click();
		Thread.sleep(10000);
		
		
		}
		
	
	}

}
