package com.urloopWebPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Tring.nbc.utils.Constants;
import com.Tring.nbc.utils.ExcelReader;
import com.excelGetterSetter.EventGS;
import com.urloopWeb.ModuleObjects.EventWeb_Object;
import com.urloopWebScripts.EventWebScripts;


public class EventWebPages {
	
	private ExcelReader testDataSheet;
	private EventWeb_Object eventwebobject;
	private EventGS eventGS;
	private EventWebScripts eventWebScripts;

	@BeforeTest
	private void configuration() {
		eventwebobject = new EventWeb_Object();
		eventwebobject = PageFactory.initElements(Browser.driver, EventWeb_Object.class);
		testDataSheet = ExcelReader.getInstance(Constants.PATHTESTDATA);
		eventGS = new EventGS();
		eventWebScripts = new EventWebScripts();

	}
	
	@Test(priority = 1)
	public void login() throws InterruptedException {
		LoginWebPages loginWebPages = new LoginWebPages();
		loginWebPages.configuration();
		loginWebPages.validCredentials();
	}
	
	@Test(priority = 2)
	public void emptyevent() throws InterruptedException
	{
		
		eventWebScripts.EmptyEvent();
	}

	@Test(priority = 3)
	public void ValidEventStaff() throws Exception {
		eventGS.setEventname(testDataSheet.getCellValue("ValidEventStaff", "Events", "EventName"));
		
		System.out.println("Value of staff"+testDataSheet.getCellValue("ValidEventStaff", "Events", "Staff"));
		
		eventGS.setEvent_only_Staff(testDataSheet.getCellValue("ValidEventStaff", "Events", "Staff"));
		eventGS.setEvent_description(testDataSheet.getCellValue("ValidEventStaff", "Events", "Description"));
		eventGS.setSelect_date(testDataSheet.getCellValue("ValidEventStaff", "Events", "Selectdate"));
		eventGS.setStart_hour(testDataSheet.getCellValue("ValidEventStaff", "Events", "Starthour"));
		eventGS.setStart_minute(testDataSheet.getCellValue("ValidEventStaff", "Events", "Startminute"));
		eventGS.setEnd_hour(testDataSheet.getCellValue("ValidEventStaff", "Events", "Endhour"));
		eventGS.setEnd_minute(testDataSheet.getCellValue("ValidEventStaff", "Events", "Endminute"));
		eventGS.setAM_PM(testDataSheet.getCellValue("ValidEventStaff", "Events", "AM_PM"));
		eventWebScripts.ValidEvent_Staff(eventwebobject, eventGS);
	}
	
	@Test(priority = 4)
	public void ValidEventResident() throws Exception {
		eventGS.setEventname(testDataSheet.getCellValue("ValidEventResident", "Events", "EventName"));
		eventGS.setEvent_only_Residents(testDataSheet.getCellValue("ValidEventResident", "Events", "Resident"));
		eventGS.setEvent_description(testDataSheet.getCellValue("ValidEventResident", "Events", "Description"));
		eventGS.setSelect_date(testDataSheet.getCellValue("ValidEventResident", "Events", "Selectdate"));
		eventGS.setStart_hour(testDataSheet.getCellValue("ValidEventResident", "Events", "Starthour"));
		eventGS.setStart_minute(testDataSheet.getCellValue("ValidEventResident", "Events", "Startminute"));
		eventGS.setEnd_hour(testDataSheet.getCellValue("ValidEventResident", "Events", "Endhour"));
		eventGS.setEnd_minute(testDataSheet.getCellValue("ValidEventResident", "Events", "Endminute"));
		eventGS.setAM_PM(testDataSheet.getCellValue("ValidEventResident", "Events", "AM_PM"));
		eventWebScripts.ValidEvent_Resident(eventwebobject, eventGS);
	}
	
	
	@Test(priority = 5)
	public void ValidEventEveryOne() throws Exception {
		eventGS.setEventname(testDataSheet.getCellValue("ValidEventEveryOne", "Events", "EventName"));
		eventGS.setEvent_everyone(testDataSheet.getCellValue("ValidEventEveryOne", "Events", "Everyone"));
		eventGS.setEvent_description(testDataSheet.getCellValue("ValidEventEveryOne", "Events", "Description"));
		eventGS.setSelect_date(testDataSheet.getCellValue("ValidEventEveryOne", "Events", "Selectdate"));
		eventGS.setStart_hour(testDataSheet.getCellValue("ValidEventEveryOne", "Events", "Starthour"));
		eventGS.setStart_minute(testDataSheet.getCellValue("ValidEventEveryOne", "Events", "Startminute"));
		eventGS.setEnd_hour(testDataSheet.getCellValue("ValidEventEveryOne", "Events", "Endhour"));
		eventGS.setEnd_minute(testDataSheet.getCellValue("ValidEventEveryOne", "Events", "Endminute"));
		eventGS.setAM_PM(testDataSheet.getCellValue("ValidEventEveryOne", "Events", "AM_PM"));
		eventWebScripts.ValidEvent_Everyone(eventwebobject, eventGS);
	}
	
	
	@Test(priority = 6)
	public void ValidEventSpecific() throws Exception {
		eventGS.setEventname(testDataSheet.getCellValue("ValidEventIndividual", "Events", "EventName"));
		eventGS.setEvent_Individual(testDataSheet.getCellValue("ValidEventIndividual", "Events", "Individual"));
		eventGS.setEvent_description(testDataSheet.getCellValue("ValidEventIndividual", "Events", "Description"));
		eventGS.setSelect_date(testDataSheet.getCellValue("ValidEventIndividual", "Events", "Selectdate"));
		eventGS.setStart_hour(testDataSheet.getCellValue("ValidEventIndividual", "Events", "Starthour"));
		eventGS.setStart_minute(testDataSheet.getCellValue("ValidEventIndividual", "Events", "Startminute"));
		eventGS.setEnd_hour(testDataSheet.getCellValue("ValidEventIndividual", "Events", "Endhour"));
		eventGS.setEnd_minute(testDataSheet.getCellValue("ValidEventIndividual", "Events", "Endminute"));
		eventGS.setAM_PM(testDataSheet.getCellValue("ValidEventIndividual", "Events", "AM_PM"));
		eventWebScripts.ValidEvent_Specific(eventwebobject, eventGS);
	}
	
	//Edit Events
	
	@Test(priority = 7)
	public void Editstaff() throws InterruptedException
	{
		
		eventGS.setSelect_date(testDataSheet.getCellValue("EditEventStaff", "Events", "Selectdate"));
		eventGS.setEventname(testDataSheet.getCellValue("EditEventStaff", "Events", "EventName"));
		eventGS.setUpdate_date(testDataSheet.getCellValue("EditEventStaff", "Events", "UpdatedDate"));
		eventGS.setStart_hour(testDataSheet.getCellValue("EditEventStaff", "Events", "Starthour"));
		eventGS.setStart_minute(testDataSheet.getCellValue("EditEventStaff", "Events", "Startminute"));
		eventGS.setEnd_hour(testDataSheet.getCellValue("EditEventStaff", "Events", "Endhour"));
		eventGS.setEnd_minute(testDataSheet.getCellValue("EditEventStaff", "Events", "Endminute"));
		eventGS.setAM_PM(testDataSheet.getCellValue("EditEventStaff", "Events", "AM_PM"));
		eventGS.setEvent_description(testDataSheet.getCellValue("EditEventStaff", "Events", "Description"));
		eventWebScripts.Editstaff_Event(eventwebobject, eventGS);
		
		
	}
	
}
