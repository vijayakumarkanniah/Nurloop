package com.urloopWebScripts;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.excelGetterSetter.EventGS;
import webScriptsConstants.EventsWebScriptsConstants;
import webScriptsConstants.BookaserviceWebScriptsConstants;
import com.urloopWeb.ModuleObjects.EventWeb_Object;

import com.urloopWebPages.Browser;

public class EventWebScripts {

	
	public JavascriptExecutor jse = (JavascriptExecutor) Browser.driver;
	public void EmptyEvent() throws InterruptedException {

		Thread.sleep(15000);
		Browser.findElementByPath(EventsWebScriptsConstants.EVENTS).click();
		Thread.sleep(10000);
		Browser.findElementByPath(EventsWebScriptsConstants.CREATENEW_EVENT).click();
		Thread.sleep(10000);
		Browser.findElementByPath(EventsWebScriptsConstants.EVENT_SAVE).click();
		/*
		 * String
		 * Toast=Browser.findElementByPath(EventsWebScriptsConstants.Toast_message).
		 * getText(); System.out.println("Toast Message is:"+Toast);
		 */
		if (Browser.findElementByPath(EventsWebScriptsConstants.TOAST_MESSAGE).getText()
				.equals("Please fill the mandatory fields")) {

			System.out.println("EmptyEvent - Test Case Pass");

		} else {

			System.out.println("EmptyEvent - Test Case Fail");

		}

	}
	
	
/*	public int getCoordinates(){
		  //Locate element for which you wants to retrieve x y coordinates.
		       WebElement Image = Browser.findElementByPath(".//*[@id='event-create-form']/md-content/form/div[5]/md-input-container");
		       //Used points class to get x and y coordinates of element.
		        Point classname = Image.getLocation();
		        int xcordi = classname.getX();
		        System.out.println("Element's Position from left side"+xcordi +" pixels.");
		        return xcordi;
		        
		        
	}

	public int getCordinates1() {
		  //Locate element for which you wants to retrieve x y coordinates.
		       WebElement Image = Browser.findElementByPath(".//*[@id='endTimePicker']");
		       //Used points class to get x and y coordinates of element.
		        Point classname = Image.getLocation();
		        int ycordi = classname.getY();
		        System.out.println("Element's Position from top"+ycordi +" pixels.");
		        return ycordi;
		        
		        
	}
*/	
	public void ValidEvent_Staff(EventWeb_Object eventwebobject, EventGS eventGS) throws Exception{

		Thread.sleep(15000);
		//Passing the X and Y co-ordinates to scroll method
		JavascriptExecutor jseg = (JavascriptExecutor) Browser.driver;
		jseg.executeScript("scroll(0,250);");
		Thread.sleep(10000);
		Browser.findElementByPath(EventsWebScriptsConstants.EVENT_NAME).click();
		Browser.findElementByPath(EventsWebScriptsConstants.EVENT_NAME).sendKeys(eventGS.getEventname());
		Thread.sleep(5000);
		Browser.findElementByPath(BookaserviceWebScriptsConstants.EVENT_DATE).click();
		Thread.sleep(5000);
		WebElement datepick = Browser.findElementByPath(BookaserviceWebScriptsConstants.DATE_PICKER);
		List<WebElement> noOfColumns = datepick.findElements(By.tagName(BookaserviceWebScriptsConstants.TD));
		// Loop will rotate till expected date not found.
		for (WebElement cell : noOfColumns) {
			// Select the date from date picker when condition match.
			// "+"Recreation"+"
			if (cell.getText().equals(eventGS.getSelect_date())) {
				cell.findElement(By.linkText(eventGS.getSelect_date())).click();
				break;
			} }
			
		//Start time value setting
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.STARTTIME_PICKER).click();
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.HOUR).clear();
			Browser.findElementByPath(EventsWebScriptsConstants.HOUR).sendKeys(eventGS.getStart_hour());
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).clear();
			Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).sendKeys(eventGS.getStart_minute());
			Thread.sleep(5000);
			
		//End time value setting	
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.ENDTIME_PICKER).click();
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.HOUR).clear();
			Browser.findElementByPath(EventsWebScriptsConstants.HOUR).sendKeys(eventGS.getEnd_hour());
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).clear();
			Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).sendKeys(eventGS.getEnd_minute());
			Browser.findElementByPath(EventsWebScriptsConstants.WHO_IS_PARTICIPATING).click();
			Thread.sleep(5000);

			//Based on the input from excel to select whether staff/res/everyone
			
			if (Boolean.valueOf(eventGS.getEvent_only_Staff())) {
				Browser.findElementByPath(".//*[@value='2']").click();
			}

			if (Boolean.valueOf(eventGS.getEvent_only_Residents())) {
				Browser.findElementByPath(".//*[@value='3']").click();
			}

			if (Boolean.valueOf(eventGS.getEvent_everyone())) {
				Browser.findElementByPath(".//*[@value='1']").click();
			}

			if (Boolean.valueOf(eventGS.getEvent_Individual())) {
				Browser.findElementByPath(".//*[@value='4']").click();
			}
			
			Thread.sleep(5000);
			
			jseg.executeScript("scroll(0,50);");
			
			Browser.findElementByPath(EventsWebScriptsConstants.EVENT_DESCRIPTION).click();
			Browser.findElementByPath(EventsWebScriptsConstants.EVENT_DESCRIPTION).sendKeys(eventGS.getEvent_description());
			
			jseg.executeScript("scroll(0,-450);");
			
			Browser.findElementByPath(EventsWebScriptsConstants.EVENT_SAVE).click();

		
	}
	
	
	public void ValidEvent_Resident(EventWeb_Object eventwebobject, EventGS eventGS) throws Exception{

		Thread.sleep(15000);
		Browser.findElementByPath(EventsWebScriptsConstants.CREATENEW_EVENT).click();
		Thread.sleep(10000);
		JavascriptExecutor jsed = (JavascriptExecutor) Browser.driver;
		jsed.executeScript("scroll(0,250);");
		Thread.sleep(10000);
		Browser.findElementByPath(EventsWebScriptsConstants.EVENT_NAME).click();
		Browser.findElementByPath(EventsWebScriptsConstants.EVENT_NAME).sendKeys(eventGS.getEventname());
		Thread.sleep(5000);
		Browser.findElementByPath(BookaserviceWebScriptsConstants.EVENT_DATE).click();
		Thread.sleep(5000);
		WebElement datepick = Browser.findElementByPath(BookaserviceWebScriptsConstants.DATE_PICKER);
		List<WebElement> noOfColumns = datepick.findElements(By.tagName(BookaserviceWebScriptsConstants.TD));
		// Loop will rotate till expected date not found.
		for (WebElement cell : noOfColumns) {
			// Select the date from date picker when condition match.
			// "+"Recreation"+"
			if (cell.getText().equals(eventGS.getSelect_date())) {
				cell.findElement(By.linkText(eventGS.getSelect_date())).click();
				break;
			} }
			
		//Start time value setting
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.STARTTIME_PICKER).click();
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.HOUR).clear();
			Browser.findElementByPath(EventsWebScriptsConstants.HOUR).sendKeys(eventGS.getStart_hour());
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).clear();
			Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).sendKeys(eventGS.getStart_minute());
			Thread.sleep(5000);
			
		//End time value setting	
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.ENDTIME_PICKER).click();
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.HOUR).clear();
			Browser.findElementByPath(EventsWebScriptsConstants.HOUR).sendKeys(eventGS.getEnd_hour());
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).clear();
			Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).sendKeys(eventGS.getEnd_minute());
			Browser.findElementByPath(EventsWebScriptsConstants.WHO_IS_PARTICIPATING).click();
			Thread.sleep(5000);

			//Based on the input from excel to select whether staff/res/everyone
			
			if (Boolean.valueOf(eventGS.getEvent_only_Staff())) {
				Browser.findElementByPath(".//*[@value='2']").click();
			}

			if (Boolean.valueOf(eventGS.getEvent_only_Residents())) {
				Browser.findElementByPath(".//*[@value='3']").click();
			}

			if (Boolean.valueOf(eventGS.getEvent_everyone())) {
				Browser.findElementByPath(".//*[@value='1']").click();
			}

			if (Boolean.valueOf(eventGS.getEvent_Individual())) {
				Browser.findElementByPath(".//*[@value='4']").click();
			}
			
			Thread.sleep(5000);
			
			
			jsed.executeScript("scroll(0,50);");
			
			Browser.findElementByPath(EventsWebScriptsConstants.EVENT_DESCRIPTION).click();
			Browser.findElementByPath(EventsWebScriptsConstants.EVENT_DESCRIPTION).sendKeys(eventGS.getEvent_description());
			
			jsed.executeScript("scroll(0,-450);");
			
			Browser.findElementByPath(EventsWebScriptsConstants.EVENT_SAVE).click();
			
		
	}
	
	
	
	public void ValidEvent_Everyone(EventWeb_Object eventwebobject, EventGS eventGS) throws Exception{

		Thread.sleep(15000);
		Browser.findElementByPath(EventsWebScriptsConstants.CREATENEW_EVENT).click();
		Thread.sleep(10000);
		JavascriptExecutor jsej = (JavascriptExecutor) Browser.driver;
		jsej.executeScript("scroll(0,250);");
		Thread.sleep(10000);
		Browser.findElementByPath(EventsWebScriptsConstants.EVENT_NAME).click();
		Browser.findElementByPath(EventsWebScriptsConstants.EVENT_NAME).sendKeys(eventGS.getEventname());
		Thread.sleep(5000);
		Browser.findElementByPath(BookaserviceWebScriptsConstants.EVENT_DATE).click();
		Thread.sleep(5000);
		WebElement datepick = Browser.findElementByPath(BookaserviceWebScriptsConstants.DATE_PICKER);
		List<WebElement> noOfColumns = datepick.findElements(By.tagName(BookaserviceWebScriptsConstants.TD));
		// Loop will rotate till expected date not found.
		for (WebElement cell : noOfColumns) {
			// Select the date from date picker when condition match.
			// "+"Recreation"+"
			if (cell.getText().equals(eventGS.getSelect_date())) {
				cell.findElement(By.linkText(eventGS.getSelect_date())).click();
				break;
			} }
			
		//Start time value setting
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.STARTTIME_PICKER).click();
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.HOUR).clear();
			Browser.findElementByPath(EventsWebScriptsConstants.HOUR).sendKeys(eventGS.getStart_hour());
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).clear();
			Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).sendKeys(eventGS.getStart_minute());
			Thread.sleep(5000);
			
		//End time value setting	
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.ENDTIME_PICKER).click();
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.HOUR).clear();
			Browser.findElementByPath(EventsWebScriptsConstants.HOUR).sendKeys(eventGS.getEnd_hour());
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).clear();
			Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).sendKeys(eventGS.getEnd_minute());
			Browser.findElementByPath(EventsWebScriptsConstants.WHO_IS_PARTICIPATING).click();
			Thread.sleep(5000);

			//Based on the input from excel to select whether staff/res/everyone
			
			if (Boolean.valueOf(eventGS.getEvent_only_Staff())) {
				Browser.findElementByPath(".//*[@value='2']").click();
			}

			if (Boolean.valueOf(eventGS.getEvent_only_Residents())) {
				Browser.findElementByPath(".//*[@value='3']").click();
			}

			if (Boolean.valueOf(eventGS.getEvent_everyone())) {
				Browser.findElementByPath(".//*[@value='2']").click();
				Thread.sleep(5000);
				Browser.findElementByPath(".//*[@value='1']").click();
			}

			if (Boolean.valueOf(eventGS.getEvent_Individual())) {
				Browser.findElementByPath(".//*[@value='4']").click();
			}
			
			Thread.sleep(5000);
			
			jsej.executeScript("scroll(0,50);");
			
			Browser.findElementByPath(EventsWebScriptsConstants.EVENT_DESCRIPTION).click();
			Browser.findElementByPath(EventsWebScriptsConstants.EVENT_DESCRIPTION).sendKeys(eventGS.getEvent_description());
			
			jsej.executeScript("scroll(0,-450);");
			
			Browser.findElementByPath(EventsWebScriptsConstants.EVENT_SAVE).click();

		
	}
	
//Invite Specific People	
	
	public void ValidEvent_Specific(EventWeb_Object eventwebobject, EventGS eventGS) throws Exception{

		Thread.sleep(15000);
		Browser.findElementByPath(EventsWebScriptsConstants.CREATENEW_EVENT).click();
		JavascriptExecutor jsez = (JavascriptExecutor) Browser.driver;
		jsez.executeScript("scroll(0,250);");
		Thread.sleep(10000);
		Browser.findElementByPath(EventsWebScriptsConstants.EVENT_NAME).click();
		Browser.findElementByPath(EventsWebScriptsConstants.EVENT_NAME).sendKeys(eventGS.getEventname());
		Thread.sleep(5000);
		Browser.findElementByPath(BookaserviceWebScriptsConstants.EVENT_DATE).click();
		Thread.sleep(5000);
		WebElement datepick = Browser.findElementByPath(BookaserviceWebScriptsConstants.DATE_PICKER);
		List<WebElement> noOfColumns = datepick.findElements(By.tagName(BookaserviceWebScriptsConstants.TD));
		// Loop will rotate till expected date not found.
		for (WebElement cell : noOfColumns) {
			// Select the date from date picker when condition match.
			// "+"Recreation"+"
			if (cell.getText().equals(eventGS.getSelect_date())) {
				cell.findElement(By.linkText(eventGS.getSelect_date())).click();
				break;
			} }
			
		//Start time value setting
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.STARTTIME_PICKER).click();
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.HOUR).clear();
			Browser.findElementByPath(EventsWebScriptsConstants.HOUR).sendKeys(eventGS.getStart_hour());
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).clear();
			Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).sendKeys(eventGS.getStart_minute());
			Thread.sleep(5000);
			
		//End time value setting	
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.ENDTIME_PICKER).click();
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.HOUR).clear();
			Browser.findElementByPath(EventsWebScriptsConstants.HOUR).sendKeys(eventGS.getEnd_hour());
			Thread.sleep(5000);
			Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).clear();
			Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).sendKeys(eventGS.getEnd_minute());
			Browser.findElementByPath(EventsWebScriptsConstants.WHO_IS_PARTICIPATING).click();
			Thread.sleep(5000);

			//Based on the input from excel to select whether staff/res/everyone
			
			if (Boolean.valueOf(eventGS.getEvent_only_Staff())) {
				Browser.findElementByPath(".//*[@value='2']").click();
			}

			if (Boolean.valueOf(eventGS.getEvent_only_Residents())) {
				Browser.findElementByPath(".//*[@value='3']").click();
			}

			if (Boolean.valueOf(eventGS.getEvent_everyone())) {
				Browser.findElementByPath(".//*[@value='1']").click();
			}

			if (Boolean.valueOf(eventGS.getEvent_Individual())) {
				Browser.findElementByPath(".//*[@value='4']").click();
				Thread.sleep(15000);
				Browser.findElementByPath(EventsWebScriptsConstants.SEARCH_MEMBERS).click();
				Browser.findElementByPath(EventsWebScriptsConstants.SEARCH_MEMBERS).sendKeys("Ben");
				Thread.sleep(10000);
				Browser.findElementByPath(EventsWebScriptsConstants.STAFF_SELECT).click();
				Browser.findElementByPath(EventsWebScriptsConstants.SEARCH_MEMBERS).click();
				Browser.findElementByPath(EventsWebScriptsConstants.SEARCH_MEMBERS).clear();
				Thread.sleep(2000);
				Browser.findElementByPath(EventsWebScriptsConstants.SEARCH_MEMBERS).sendKeys("Gan");
				Thread.sleep(10000);
				Browser.findElementByPath(EventsWebScriptsConstants.RESIDENT_SELECT).click();
				Browser.findElementByPath(EventsWebScriptsConstants.SEARCH_MEMBERS).click();
				Thread.sleep(3000);
				Browser.findElementByPath(EventsWebScriptsConstants.SEARCH_SAVE).click();
				Thread.sleep(5000);
				jsez.executeScript("scroll(0,100);");
			}
			
			Browser.findElementByPath(EventsWebScriptsConstants.EVENT_DESCRIPTION).click();
			Browser.findElementByPath(EventsWebScriptsConstants.EVENT_DESCRIPTION).sendKeys(eventGS.getEvent_description());
			
			jsez.executeScript("scroll(0,-550);");
			
			Browser.findElementByPath(EventsWebScriptsConstants.EVENT_SAVE).click();
		
	}
	
		
//Event Edit
	
	public void Editstaff_Event(EventWeb_Object eventwebobject, EventGS eventGS) throws InterruptedException
	{
		Thread.sleep(15000);
		Browser.findElementByPath(EventsWebScriptsConstants.EVENTS).click();
		Thread.sleep(15000);
		Browser.findElementByPath(EventsWebScriptsConstants.MONTH_BUTTON).click();
		Thread.sleep(15000);
		//Scroll through the page till the date in month view
		
		for(int i=1;i<7;i++)
		{
			for(int j=1;j<8;j++)
			{
				System.out.println("Value is:"+Browser.findElementByPath(String.format(EventsWebScriptsConstants.CALENDAR,i,j)).getText());
				
				if(Browser.findElementByPath(String.format(EventsWebScriptsConstants.CALENDAR,i,j)).getText().equals(eventGS.getSelect_date()))
				{
					System.out.print("Inside If statement");
					Browser.findElementByPath(String.format(EventsWebScriptsConstants.EVENT_SELECT,i,j)).click();
					Thread.sleep(15000);
					Browser.findElementByPath(EventsWebScriptsConstants.EDIT_EVENTBUTTON).click();
					//Value passing in Edit Event Screen
					Thread.sleep(20000);
					Browser.findElementByPath(EventsWebScriptsConstants.EVENT_NAME).click();
					Browser.findElementByPath(EventsWebScriptsConstants.EVENT_NAME).clear();
					Browser.findElementByPath(EventsWebScriptsConstants.EVENT_NAME).sendKeys(eventGS.getEventname());
					Thread.sleep(10000);
					Browser.findElementByPath(EventsWebScriptsConstants.EDIT_EVENTDATE).click();
					Thread.sleep(5000);
					WebElement datepick = Browser.findElementByPath(BookaserviceWebScriptsConstants.DATE_PICKER);
					List<WebElement> noOfColumns = datepick.findElements(By.tagName(BookaserviceWebScriptsConstants.TD));
					// Loop will rotate till expected date not found.
					for (WebElement cell : noOfColumns) {
						// Select the date from date picker when condition match.
											
						if (cell.getText().equals(eventGS.getUpdate_date())) {
							System.out.println("INside the date picker condition");
							
							cell.findElement(By.linkText(eventGS.getUpdate_date())).click();
							break;
						} }
					Thread.sleep(5000);	
					Browser.findElementByPath(EventsWebScriptsConstants.STARTTIME_PICKER).click();
					Browser.findElementByPath(EventsWebScriptsConstants.HOUR).click();
					Browser.findElementByPath(EventsWebScriptsConstants.HOUR).clear();
					Browser.findElementByPath(EventsWebScriptsConstants.HOUR).sendKeys(eventGS.getStart_hour());
					Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).click();
					Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).clear();
					Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).sendKeys(eventGS.getStart_minute());
					Browser.findElementByPath(EventsWebScriptsConstants.ENDTIME_PICKER).click();
					Browser.findElementByPath(EventsWebScriptsConstants.HOUR).click();
					Browser.findElementByPath(EventsWebScriptsConstants.HOUR).clear();
					Browser.findElementByPath(EventsWebScriptsConstants.HOUR).sendKeys(eventGS.getEnd_hour());
					Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).click();
					Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).clear();
					Browser.findElementByPath(EventsWebScriptsConstants.MINUTES).sendKeys(eventGS.getEnd_minute());
					Browser.findElementByPath(EventsWebScriptsConstants.WHO_HAS_INVITED).click();
					Thread.sleep(5000);
					Browser.findElementByPath(EventsWebScriptsConstants.EVENT_DESCRIPTION).click();
					Browser.findElementByPath(EventsWebScriptsConstants.EVENT_DESCRIPTION).clear();
					Browser.findElementByPath(EventsWebScriptsConstants.EVENT_DESCRIPTION).sendKeys(eventGS.getEvent_description());
					Browser.findElementByPath(EventsWebScriptsConstants.WHO_HAS_INVITED).click();
					Thread.sleep(2000);
					JavascriptExecutor jsec = (JavascriptExecutor) Browser.driver;
					jsec.executeScript("window.scrollBy(0,-550)", "");
					Thread.sleep(5000);
					Browser.findElementByPath(EventsWebScriptsConstants.EVENT_UPDATEBUTTON).click();
					Thread.sleep(15000);
					Browser.findElementByPath(EventsWebScriptsConstants.MONTH_BUTTON).click();
					Thread.sleep(15000);
					return;
				}
			}
		}
		
	}
	
	
}
