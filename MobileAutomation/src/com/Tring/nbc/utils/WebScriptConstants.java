package com.Tring.nbc.utils;

public interface WebScriptConstants {
	/* Book a service */
	String SELECT_BOX = ".//*[@class='selectBox-values']/div[text()='%s']";
	String TIME_PICKER = ".//*[@id='timepicker']";
	String INPUT_2_1 = "html/body/div[6]/table/tbody/tr[2]/td[1]/input";
	String INPUT_2_3 = "html/body/div[6]/table/tbody/tr[2]/td[3]/input";
	String DATE_PICKER = ".//*[@id='ui-datepicker-div']";
	
	String CARE_ASSESMENT_BUTTON = ".//*[@id='careAssessment']/div/div[1]/div[2]/div/button";
	String CATEGORY_INPUT = ".//*[@id='category']/div/input";
	String SERVICE_CATEGORY = ".//*[@class='selectBox-values']/div[text()='%s']";
	String SERVICE_INPUT = ".//*[@id='service']/div/input";
	String EVENT_DATE = ".//*[@id='eventDate']";
	String SERVICE_NAME = ".//*[@class='selectBox-values']/div[text()='%s']";
	String TD = "td";
	String RESIDENT_DIV = ".//*[@id='resident']/div";
	String STAFF_INPUT = ".//*[@id='staff']/div/input";
	String DESCRIPTION = ".//*[@id='description']";
	String SAVE_MODAL = ".//*[@id='modal-box']/div[2]/md-content/form/div[7]/div[2]/a[2]/button/span[text()='Save']";
	String SELECTED_STAFF = ".//*[@class='selectBox-values']/div[text()='%s']";
	
/*Events */
	
	String EVENTS=".//*[@id='side-menu']/li[3]/a/span[text()='Events']";
	String CREATENEW_EVENT=".//*[@id='events']/div[1]/div[2]/div/a/button";
	String EVENT_SAVE=".//*[@id='eventcreate']/div[2]/div[2]/a";
	String TOAST_MESSAGE=".//*[@id='toast-container']/div/div/div[2]";
	String EVENT_NAME=".//*[@name='eventname']";
	String SELECT_DATE=".//*[@id='eventDate']";
	String STARTTIME_PICKER=".//*[@id='startTimePicker']";
	String ENDTIME_PICKER=".//*[@id='endTimePicker']";
	String HOUR="html/body/div[4]/table/tbody/tr[2]/td[1]/input";
	String MINUTES="html/body/div[4]/table/tbody/tr[2]/td[3]/input";
	String AM_PM="html/body/div[4]/table/tbody/tr[2]/td[5]/input";
	String EVENT_DESCRIPTION=".//*[@id='description']";
	String WHO_IS_PARTICIPATING=".//*[@id='event-create-form']/md-content/form/div[4]/div[1]/div";
	String STAFF_SELECT=".//*[@id='eventpopover']/div[2]/md-content/form/div[2]/div[2]/md-input-container/div[3]";
	String RESIDENT_SELECT=".//*[@id='eventpopover']/div[2]/md-content/form/div[2]/div[3]/md-input-container/div[3]";
	String SEARCH_MEMBERS=".//*[@id='searchmember']";
	String EVENT_UPDATEBUTTON=".//*[@id='eventcreate']/div[2]/div[2]/a[1]";
	String SEARCH_SAVE=".//*[@id='eventpopover']/div[3]/button";
	String MONTH_BUTTON=".//*[@id='calendar']/div[1]/div[2]/div/button[3]";
	String CALENDAR=".//*[@id='calendar']/div[2]/div/table/tbody/tr/td/div/div/div[%d]/div[2]/table/thead/tr/td[%d]/a";
	String EVENT_SELECT=".//*[@id='calendar']/div[2]/div/table/tbody/tr/td/div/div/div[%d]/div[2]/table/tbody/tr[1]/td[%d]/a/div/span[1]";
	String EDIT_EVENTBUTTON=".//*[@id='event-tooltip']/div[2]/div[9]/div[2]/a/button";
	String EDIT_EVENTDATE=".//*[@id='editeventDate']";
	String WHO_HAS_INVITED=".//*[@id='event-edit-form']/md-content/form/div[4]/div/div[1]";
	
/*Events */
	
	
	/* Unassigned Services*/
	
	String UNASSIGNED_SERVICESMENU=".//*[@id='side-menu']/li[7]/a/span";
	String UNASSIGNED_ONDEMANDTAB=".//*[@id='schduleservices']/div[2]/div/div/md-content/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[2]/span";
	String UNASSIGNED_SCHEDULEBUTTON=".//*[@class='inline-block col-empty-det'][text()='Schedule']";
	String UNASSIGNED_TIMELABEL=".//*[@class='list-service-subtitle font-size-16 lato-regular-font ng-binding'][text()='09:00 AM']";
	String UNASSIGNED_TIMELABEL1=".//*[@class='list-service-subtitle font-size-16 lato-regular-font ng-binding'][text()='08:00 AM']";
	String UNASSIGNED_TIMEPICKER=".//*[@id='timepicker']";
	String UNASSIGNED_HOUR="html/body/div[6]/table/tbody/tr[2]/td[1]/input";
	String UNASSIGNED_MINUTES="html/body/div[6]/table/tbody/tr[2]/td[3]/input";
	String UNASSIGNED_AM_PM="html/body/div[6]/table/tbody/tr[2]/td[5]/input";
	String UNASSIGNED_STAFFDROPDOWN=".//*[@id='staffId']";
	String UNASSIGNED_SELECTSTAFF=".//*[@value='Charlie Harper']";
	String UNASSIGNED_SELECTSTAFF1=".//*[@value='Charlie Harper']";
	String UNASSIGNED_SAVEBUTTON=".//*[@id='btn-save'][text()='Save']";
	String UNASSIGNED_SERVICEDATE=".//*[@ class='md-input ng-pristine ng-untouched ng-valid hasDatepicker ng-not-empty']";
    
}
