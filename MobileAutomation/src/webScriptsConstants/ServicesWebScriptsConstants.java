package webScriptsConstants;

public interface ServicesWebScriptsConstants {
	
	
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
	

}
