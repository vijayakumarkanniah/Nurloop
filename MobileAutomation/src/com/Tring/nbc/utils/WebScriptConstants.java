package com.Tring.nbc.utils;

public interface WebScriptConstants {
	/* Book a service */
	String SELECT_BOX = ".//*[@class='selectBox-values']/div[text()='%s']";
	String TIME_PICKER = ".//*[@id='timepicker']";
	String INPUT_2_1 = "html/body/div[6]/table/tbody/tr[2]/td[1]/input";
	String INPUT_2_3 = "html/body/div[6]/table/tbody/tr[2]/td[3]/input";
	String DATE_PICKER = "ui-datepicker-div";
	
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
	/* Book a service */
	
	/*Service */
	
	String SERVICESMAINMENU = ".//*[@id='side-menu']/li[4]/a/span[text()='Services']";
	String CREATE_A_NEW_SERVICE = ".//*[@id='btn-create']";
	
	
	/*ROOM SERVICES*/
	String ROOMSERVICE = ".//*[@id='services']/div[2]/div/div/div[2]/div/div[1]/a/div";
	String ROOMSERVICEHOVER = ".//*[@id='services']/div[2]/div/div/div[2]/div/div[1]/a/div/div/div[text()='Edit Service']";
	String ROOMNAME = ".//*[@id='roomName']";
	String ROOMRENTPRICE = ".//*[@id='price']";
	String ROOMDESCRIPTION = ".//*[@id='description']";
	String SAVERENTOPTION = ".//*[@id='rentalformsave'][text()='Save Rent Option']";
	String SAVE = ".//*[@id='btn-save'][text()='Save']";
	/*ROOM SERVICES*/
	
	/*Boarding Services*/
	
	String BOARDINGSERVICE = ".//*[@id='services']/div[2]/div/div/div[2]/div/div[2]/a/div";
	String BOARDINGSERVICEHOVER = ".//*[@id='services']/div[2]/div/div/div[2]/div/div[2]/a/div/div/div[text()='Edit Service']";
	String BOARDINGPACKAGENAME =".//*[@id='packageName']";
	String BOARDINGPACKAGEPRICE =".//*[@id='packageprice']";
	String BOARDINGSELECTSERVICEFIELD =".//*[@aria-label='Select Service*']";
	/*HardCoded*/
	String BOARDINGSELECTSERVICEVALUE =".//*[@value=170]";
	/*HardCoded*/
	String BOARDINGSELECTQUANTITYFIELD =".//*[@aria-label='Quantity*']";
	String BOARDINGSELECTQUANTITYVALUE =".//*[@class='md-text ng-binding'][text()=%s]";
	String BOARDINGSELECTOCCURRENCEFIELD =".//*[@id='select_value_label_2']";
	String BOARDINGSELECTOCCURRENCEVALUE = ".//*[@value='%s']/div";
	String BOARDINGMEALVOUCHERSFIELD =".//*[@id='mealVouchers']";
	String BOARDINGMEALVOUCHERSPERDAYFIELD =".//*[@id='voucherPerDay']";
	String BOARDINGMEALPRICEPERVOUCHERS =".//*[@id='pricePerVoucher']";
	String BOARDINGSAVEPACKAGE =".//*[@id='packageformsave']";
	String BOARDINGGLOBALSAVE =".//*[@id='btn-save']";
	String BOARDINGGLOBALHTML ="html/body/md-backdrop";
	/*Boarding Services*/
	
	/*Service Creation*/
	String SERVICENAME = ".//*[@id='serviceName']";
	String SERVICECATEGORYFIELD = ".//*[@id='categoryId']";
	String SERVICECATEGORYSELECTION = ".//*[@id='select-options-categoryId']/ul/li[text()='%s']";
	String SERVICEDURATION = ".//*[@id='taskDuration']";
	String SERVICEMINUTESORHOURSFIELD = ".//*[@id='taskDurationUnit']";
	String SERVICEMINUTESORHOURSSELECTIONMINUTES = ".//*[@id='select-options-taskDurationUnit']/ul/li[1]";
	String SERVICEMINUTESORHOURSSELECTIONHOURS = ".//*[@id='select-options-taskDurationUnit']/ul/li[2]";
	String SERVICESERVICETEAMFIELD = ".//*[@id='executionTeamId']";		
	String SERVICESERVICETEAM = ".//*[@value='%s']";
	String SERVICEDESCRIPTION= ".//*[@id='description']";
	String SERVICEONDEMANDBOOLEAN= ".//*[@id='servicecreate']/div[2]/div/div/div[2]/div[2]/div/div/form/div[4]/md-checkbox/div[2]/span[1]";
	String SERVICE_ONDEMAND_BOOLEANBASECOST_PRICE= ".//*[@id='baseCostPrice']";
	String SERVICE_ONDEMAND_BOOLEAN_BASEBILLABLE_PRICE= ".//*[@id='basebillablePrice']";
	String SERVICE_DAILY_BASE_COST_PRICE= ".//*[@id='dailyCostPricev']";
	String SERVICE_DAILY_BASE_BILLABLE_PRICE= ".//*[@id='dailyBillablePrice']";
	String SERVICE_WEEKLY_BASE_COST_PRICE= ".//*[@id='weeklyCostPrice']";
	String SERVICE_WEEKLY_BASE_BILLABLE_PRICE= ".//*[@id='weeklyBillablePrice']";
	String SERVICE_MONTH_BASE_COST_PRICE= ".//*[@id='monthlyCostPrice']";
	String SERVICE_MONTH_BASE_BILLABLE_PRICE= ".//*[@id='monthlyBillablePrice']";
	/*Service Creation*/
	
	String SERVICE_BREAD_CRUMS=".//*[@id='page-wrapper']/div/ol";
	/*Service */
	
	/*Resident*/
	String RESIDENT_MAINMENU=".//*[@id='side-menu']/li[5]/a['Residents']";
	String RESIDENT_CREATEBUTTON=".//*[@id='residents']/div[1]/div[2]/div/a/button/span['Add New Resident']";
	String RESIDENT_FIRSTNAME_FIELD=".//*[@ng-model='residentfirstname']";
	String RESIDENT_LASTNAME_FIELD=".//*[@ng-model='residentlastname']";
	String RESIDENT_GENDER_VALUE=".//*[@value='%s']";
	String RESIDENT_DOB=".//*[@value='%s']";
	String RESIDENT_EMAIL=".//*[@ng-value='residentemail']";
	String RESIDENT_COUNTRY=".//*[@value='%s']";
	String RESIDENT_PHONE=".//*[@name='residentcellphone']";
	String RESIDENT_ADDRESS_1=".//*[@ng-value='rc.address1']";
	String RESIDENT_ADDRESS_2=".//*[@ng-value='rc.address2']";
	String RESIDENT_BIO=".//*[@ng-model='residentbio']";
	String RESIDENT_SAVE=".//*[@id='residentcreate']/div[2]/div[2]/a['Save']";
	/*Resident*/
	
	/*Staff*/
	String STAFF_MAINMENU=".//*[@id='side-menu']/li[8]/a/span['Staff']";
	String STAFF_CREATEBUTTON=".//*[@id='staff']/div[1]/div[2]/div/a[2]/button/span['Add New Staff']";
	String STAFF_FIRSTNAME=".//*[@name='stafffirstname']";
	String STAFF_LASTNAME=".//*[@name='stafflastname']";
	String STAFF_GENDER=".//*[@value='%s']";
	String STAFF_EMAIL=".//*[@name='staffemail']";
	String STAFF_COUNTRYCODE=".//*[@value='%s']";
	String STAFF_CELLPHONE=".//*[@name='staffcellphone']";
	String STAFF_BIO=".//*[@name='staffbio']";
	/*HARDCODED*/
	String STAFF_SERVICETEAM=".//*[@value='69']";
	/*HARDCODED*/
	String STAFF_WORKINGHOURS_SUNDAY_STARTTIME=".//*[@id='Staff-workinghours']/div[1]/div[2]/div/md-input-container/input";
	String STAFF_WORKINGHOURS_SUNDAY_ENDTIME=".//*[@id='Staff-workinghours']/div[1]/div[3]/div/md-input-container/input";
	String STAFF_PASSWORD=".//*[@id='gen-pwd']";
	String STAFF_INPUT_2_1 = "html/body/div[6]/table/tbody/tr[2]/td[1]/input";
	String STAFF_INPUT_2_3 = "html/body/div[6]/table/tbody/tr[2]/td[3]/input";
	String STAFF_SAVE =".//*[@id='staffcreate']/div[1]/div[2]/a['Save']";
	/*Staff*/
	
	/*CareAssessment*/
	String CAREASSESSMENT_MENU =".//*[@id='side-menu']/li[6]/a/span['Care Assessments']";
	String CREATE_CAREASSESSMENT_BUTTON =".//*[@id='btn-create']/span['Create New Assessment']";
	String CAREASSESSMENT_TITLE_NAME =".//*[@id='formtitlename']";
	String CAREASSESSMENT_QUESTIONTYPE_FILED =".//*[@id='cacreate']/div[2]/div/div/div[3]/div/form/div/div[1]/div[1]/div[2]/div/select";
	String CAREASSESSMENT_QUESTIONTYPE_FILED_SINGLE_CHOICE ="//option[contains(@value,'radio')]";
	String CAREASSESSMENT_SERVICE_NAME_FIELD =".//*[@id='cacreate']/div[2]/div/div/div[3]/div/form/div/div[1]/div[2]/div[2]/div/select";
	String CAREASSESSMENT_SERVICE_NAME_FIELD_VALUE="//option[contains(.,'None')]";
	String CAREASSESSMENT_QUESTION_TITLE=".//*[@id='cacreate']/div[2]/div/div/div[3]/div/form/div/div[1]/div[3]/div[2]/input";
	String CAREASSESSMENT_ANSWER_1=".//*[@id='questAns1']";
	String CAREASSESSMENT_ANSWER_SAVE=".//*[@id='cacreate']/div[2]/div/div/div[3]/div/form/div/div[4]/div[text()='Save Question']";
	String CAREASSESSMENT_SAVE=".//*[@id='cacreate']/div[1]/div[2]/div/a[text()='Save']";
	/*CareAssessment*/
	
	/*Groups*/
	String GROUPS_MAIN_MENU = ".//*[@id='side-menu']/li[2]/a/span[text()='Groups'";
	String GROUPS_CREATE_GROUP =".//*[@id='groups']/div[1]/div[2]/div/a/button/span[text()='Create New Group']";
	String GROUPS_ADD_IMAGE =".//*[@id='fileinfo']/a[text()='Add Image']";
	String GROUPS_NAME =".//*[@name='groupname']";
	String GROUPS_RADIO_STAFF =".//*[@value='staff']";
	String GROUPS_RADIO_RESIDENT =".//*[@value='resident']";
	String GROUPS_RADIO_EVERYONE =".//*[@value='everyone']";
	String GROUPS_RADIO_DESCRIPTION =".//*[@id='description']";
	String GROUPS_SAVE_BUTTON =".//*[@id='groupcreate']/div[1]/div[2]/a[text()='Save']";
	/*Groups*/

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


