package com.urloopWebPages;

import java.awt.AWTException;
import java.io.FileNotFoundException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Tring.nbc.utils.Constants;
import com.Tring.nbc.utils.ExcelReader;
import com.excelGetterSetter.BookAservicesGS;
import com.excelGetterSetter.ServicesGS;
import com.urloopWeb.ModuleObjects.BookAserviceWeb_Object;
import com.urloopWebScripts.BookAservicesWebScripts;
import com.urloopWebScripts.LoginWebScripts;
import com.urloopWebScripts.ServicesWebScripts;

public class ServicesWebPages {
	
	public static ExcelReader testDataSheet;
	public static LoginWebScripts loginWebScripts;
	public static ChromeDriver driver;
	public static ServicesWebPages servicesWebPages;
	public static ServicesGS servicesGS;
	public static LoginWebPages loginWebPages;
	public static ServicesWebScripts servicesWebScripts;
	
	@BeforeTest
	private void configuration() {
		
		testDataSheet = ExcelReader.getInstance(Constants.PATHTESTDATA);
		servicesWebPages = new ServicesWebPages();
		servicesGS = new ServicesGS();
		servicesWebScripts = new ServicesWebScripts();
		loginWebPages = new LoginWebPages();
	}
	
	@Test(priority = 1)
	public void login() throws InterruptedException, FileNotFoundException {
		loginWebPages.configuration();
		loginWebPages.validCredentials();
	}
	
	@Test(priority = 2)
    public void createRoomServices() throws InterruptedException{
		servicesGS.setRoomName(
				testDataSheet.getCellValue("RoomRentServices", "Services", "RoomName"));
		servicesGS.setRoomRentPrice(
				testDataSheet.getCellValue("RoomRentServices", "Services", "RoomRentPrice"));
		servicesGS.setDecription(
				testDataSheet.getCellValue("RoomRentServices", "Services", "Description"));
		
		System.out.println("Excel value of desc :"+testDataSheet.getCellValue("RoomRentServices", "Services", "Description"));
		
		servicesWebScripts.roomRentService(servicesGS);
		}
	
	@Test(priority = 3)
    public void createBoardingServices() throws InterruptedException{
		servicesGS.setPackageName(
				testDataSheet.getCellValue("BoardingService", "Services", "PackageName"));
		servicesGS.setPackageBasePrice(
				testDataSheet.getCellValue("BoardingService", "Services", "PackageBasePrice"));
		servicesGS.setPackageSelectQuantity(
				testDataSheet.getCellValue("BoardingService", "Services", "Quantity"));
		servicesGS.setPackageSelectOccurrence(
				testDataSheet.getCellValue("BoardingService", "Services", "Occurence"));
		servicesGS.setPackageNumberOfVouchers(
				testDataSheet.getCellValue("BoardingService", "Services", "NumerOfVouchers"));
		servicesGS.setPackageNumberOfVouchersPerDay(
				testDataSheet.getCellValue("BoardingService", "Services", "NumberOfVouchers/Day"));
		servicesGS.setPackagePricePerVoucher(
				testDataSheet.getCellValue("BoardingService", "Services", "PricePerVoucher"));
		servicesWebScripts.boardingRentPrice(servicesGS);
		}
	
	@Test(priority = 4)
    public void createNewServices_OnBoarding() throws InterruptedException, AWTException{
		servicesGS.setServiceName(
				testDataSheet.getCellValue("NewServiceCreation_OnDemand", "Services", "ServiceName"));
		servicesGS.setServiceCategory(
				testDataSheet.getCellValue("NewServiceCreation_OnDemand", "Services", "ServiceCategory"));
		servicesGS.setServiceTaskDuration(
				testDataSheet.getCellValue("NewServiceCreation_OnDemand", "Services", "TaskDuration"));
		servicesGS.setServiceMinutesOrHours(
				testDataSheet.getCellValue("NewServiceCreation_OnDemand", "Services", "Minutes"));
		servicesGS.setServiceServiceTeam(
				testDataSheet.getCellValue("NewServiceCreation_OnDemand", "Services", "ServiceTeam"));
		servicesGS.setServiceDescription(
				testDataSheet.getCellValue("NewServiceCreation_OnDemand", "Services", "Description"));
		servicesGS.setServiceOnDemandServiceBoolean(
				testDataSheet.getCellValue("NewServiceCreation_OnDemand", "Services", "OnDemandBoolean"));
		servicesGS.setServiceOnDemandServiceBoolean_baseCostPrice(
				testDataSheet.getCellValue("NewServiceCreation_OnDemand", "Services", "OnDemand_BaseCostPrice"));
		servicesGS.setServiceOnDemandServiceBoolean_basebillablePrice(
				testDataSheet.getCellValue("NewServiceCreation_OnDemand", "Services", "OnDemandBaseBillablePrice"));
		servicesGS.setServiceDailyCostPrice(
	            testDataSheet.getCellValue("NewServiceCreation_OnDemand", "Services", "DailyBaseCostPrice"));
		servicesGS.setServiceDailyBillablePrice(
				testDataSheet.getCellValue("NewServiceCreation_OnDemand", "Services", "DailyBaseBillablePrice"));
		servicesGS.setServiceWeeklyCostPrice(
				testDataSheet.getCellValue("NewServiceCreation_OnDemand", "Services", "WeeklyBaseCostPrice"));
		servicesGS.setServiceWeeklyBillablePrice(
				testDataSheet.getCellValue("NewServiceCreation_OnDemand", "Services", "WeeklyBaseBillablePrice"));
		servicesGS.setServiceMonthlyCostPrice(
				testDataSheet.getCellValue("NewServiceCreation_OnDemand", "Services", "MonthlyBaseCostPrice"));
		servicesGS.setServiceMonthlyBillablePrice(
				testDataSheet.getCellValue("NewServiceCreation_OnDemand", "Services", "MonthlyBaseBillablePrice"));
		servicesWebScripts.newServiceCreation(servicesGS);
	
	}
	

}
