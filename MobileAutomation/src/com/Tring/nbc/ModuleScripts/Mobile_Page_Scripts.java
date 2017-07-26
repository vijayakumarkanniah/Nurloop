package com.Tring.nbc.ModuleScripts;

import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Tring.nbc.ModulePages.Mobile_Page_utils;
import com.Tring.nbc.core.FrontEndTest;
import com.Tring.nbc.utils.Constants;
import com.Tring.nbc.utils.ExcelReader;
import com.relevantcodes.extentreports.LogStatus;

public class Mobile_Page_Scripts extends FrontEndTest{
	

	public  Mobile_Page_utils Nbcpageutils;
	public  final ExcelReader pathTestDataSheet = ExcelReader.getInstance(Constants.PATHTESTDATA);
	Map<String, String> testData;

	/**
	 * Class instantiation Before class.
	 */
	@BeforeClass
	public void beforeClass() {
		Nbcpageutils=PageFactory.initElements(driver, Mobile_Page_utils.class);
		extentTest = extent.startTest("NbcMobileApp", "SanityTesting");
	}
	
	//@Test(priority = 1)
	public void Create_Static_Configlet() throws Exception {
		createChildTest("SanityTesting", "LocationAllow");
		try {
			Nbcpageutils.Permission_PopUp();
			logger.info(LogStatus.PASS);
			jsonObject.put("LocationAllow", "Pass");
			appendChildTest();
		} catch (Exception e){
			logger.info(LogStatus.FAIL);
			jsonObject.put("Error on clicking allow button", "Fail");
			Assert.fail("Error on clicking allow button", e);
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void CustomizedScreenStup(){
		createChildTest("SanityTesting", "Verifying Customized screen");
		try {
			Nbcpageutils.verify_CustomizedScreen();
			logger.info(LogStatus.PASS);
			jsonObject.put("LocationAllow", "Pass");
			appendChildTest();
		} catch (Exception e){
			logger.info(LogStatus.FAIL);
			jsonObject.put("Error on clicking allow button", "Fail");
			Assert.fail("Error on clicking allow button", e);
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	public void Tutorial() throws Exception{
		createChildTest("SanityTesting", "Verifying Customized screen");
		try {
			Nbcpageutils.TutorialScreen();
			logger.info(LogStatus.PASS);
			jsonObject.put("LocationAllow", "Pass");
			appendChildTest();
		} catch (Exception e){
			logger.info(LogStatus.FAIL);
			jsonObject.put("Error on clicking allow button", "Fail");
			Assert.fail("Error on clicking allow button", e);
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public void NewsArticleScreen() throws Exception{
		createChildTest("SanityTesting", "Verifying Customized screen");
		try {
			Nbcpageutils.readNewsArticle();
			logger.info(LogStatus.PASS);
			jsonObject.put("LocationAllow", "Pass");
			appendChildTest();
		} catch (Exception e){
			logger.info(LogStatus.FAIL);
			jsonObject.put("Error on clicking allow button", "Fail");
			Assert.fail("Error on clicking allow button", e);
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	public void swipeToSeeArticles() throws Exception{
		createChildTest("SanityTesting", "swipeToSeeArticles");
		try {
			Nbcpageutils.NavigatingToArticles();
			logger.info(LogStatus.PASS);
			jsonObject.put("LocationAllow", "Pass");
			appendChildTest();
		} catch (Exception e){
			logger.info(LogStatus.FAIL);
			jsonObject.put("Error on Swipe allow ", "Fail");
			Assert.fail("Error on clicking allow ", e);
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public void Video_Article_Play(){
		createChildTest("SanityTesting", "Video_Article_Play");
		try {
			Nbcpageutils.playing_Video();
			logger.info(LogStatus.PASS);
			jsonObject.put("LocationAllow", "Pass");
			appendChildTest();
		} catch (Exception e){
			logger.info(LogStatus.FAIL);
			jsonObject.put("Error on Swipe allow ", "Fail");
			Assert.fail("Error on clicking allow ", e);
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
	public void Section_Screen_View(){
		createChildTest("SanityTesting", "Section_Screen");
		try {
			Nbcpageutils.Section_Screen();
			logger.info(LogStatus.PASS);
			jsonObject.put("LocationAllow", "Pass");
			appendChildTest();
		} catch (Exception e){
			logger.info(LogStatus.FAIL);
			jsonObject.put("Error on Swipe allow ", "Fail");
			Assert.fail("Error on clicking allow ", e);
			e.printStackTrace();
		}
	}
	
	@Test(priority=8)
	public void weather_View(){
		createChildTest("SanityTesting", "weather_View");
		try {
			Nbcpageutils.weather_Screen();
			logger.info(LogStatus.PASS);
			jsonObject.put("LocationAllow", "Pass");
			appendChildTest();
		} catch (Exception e){
			logger.info(LogStatus.FAIL);
			jsonObject.put("Error on Swipe allow ", "Fail");
			Assert.fail("Error on clicking allow ", e);
			e.printStackTrace();
		}
	}
	
	@Test(priority=9)
	public void HourlyForcast_Section(){
		createChildTest("SanityTesting", "HourlyForcast");
		try {
			Nbcpageutils.HourlyForcastModule();
			logger.info(LogStatus.PASS);
			jsonObject.put("LocationAllow", "Pass");
			appendChildTest();
		} catch (Exception e){
			logger.info(LogStatus.FAIL);
			jsonObject.put("Error on Swipe allow ", "Fail");
			Assert.fail("Error on clicking allow ", e);
			e.printStackTrace();
		}
	}
	
	@Test(priority=9)
	public void TenDayForcastModule(){
		createChildTest("SanityTesting", "TenDayForcast");
		try {
			Nbcpageutils.TenDayForcastModule();
			logger.info(LogStatus.PASS);
			jsonObject.put("LocationAllow", "Pass");
			appendChildTest();
		} catch (Exception e){
			logger.info(LogStatus.FAIL);
			jsonObject.put("Error on Swipe allow ", "Fail");
			Assert.fail("Error on clicking allow ", e);
			e.printStackTrace();
		}
	}
	
	@Test(priority=10)
	public void Weathervideos(){
		createChildTest("SanityTesting", "Weather_videos");
		try {
			Nbcpageutils.Weathervideos();
			logger.info(LogStatus.PASS);
			jsonObject.put("LocationAllow", "Pass");
			appendChildTest();
		} catch (Exception e){
			logger.info(LogStatus.FAIL);
			jsonObject.put("Error on Swipe allow ", "Fail");
			Assert.fail("Error on clicking allow ", e);
			e.printStackTrace();
		}
	}
	
	@Test(priority=11)
	public void MapsAndRadar(){
		createChildTest("SanityTesting", "Weather_videos");
		try {
			Nbcpageutils.Weathervideos();
			logger.info(LogStatus.PASS);
			jsonObject.put("LocationAllow", "Pass");
			appendChildTest();
		} catch (Exception e){
			logger.info(LogStatus.FAIL);
			jsonObject.put("Error on Swipe allow ", "Fail");
			Assert.fail("Error on clicking allow ", e);
			e.printStackTrace();
		}
	}
}
