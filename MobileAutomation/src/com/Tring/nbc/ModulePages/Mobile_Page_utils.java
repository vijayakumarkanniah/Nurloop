package com.Tring.nbc.ModulePages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Tring.nbc.ModuleObjects.Mobile_Object;
import com.Tring.nbc.utils.SeleniumCore;
import com.Tring.nbc.utils.SeleniumUtil;

import io.appium.java_client.android.AndroidDriver;

public class Mobile_Page_utils {

	public SeleniumCore seleniumcore;
	public SeleniumUtil seleniumutil;
	public Mobile_Object NbcPageObjects;

	public Mobile_Page_utils(WebDriver driver) {
		seleniumcore=PageFactory.initElements(driver,SeleniumCore.class);
		NbcPageObjects=PageFactory.initElements(driver, Mobile_Object.class);
	}

	public void Permission_PopUp() throws Exception{
		//(pageObjects.Permission_Location_PopUp_Allow_Button).isDisplayed();
		seleniumcore.isDisplayed(NbcPageObjects.Permission_Location_PopUp_Allow_Button, "Allow");
	}

	/*public void verify_SplashScreen(){
		if((((AndroidDriver) driver).currentActivity()== "com.nbc.news.activity.SplashActivity")){
			System.out.println("Splashscreen Activity Verfication");
		}
	}*/

	public  void verify_CustomizedScreen() throws Exception{
		seleniumcore.isDisplayed(NbcPageObjects.Set_Your_Start_screen, "Set your start screen");
		seleniumcore.clickonElement(NbcPageObjects.Save_Homepage_save_button, "Custom screen save option");
	}

	public void TutorialScreen() throws Exception{
		seleniumcore.clickonElement(NbcPageObjects.Skip_tutorial, "To skip tutorial page");
	}

	public void readNewsArticle() throws Exception{
		seleniumcore.clickonElement(NbcPageObjects.Article_Content_tap_homepage, "News Article");
	}

	public void BacktoHomePage() throws Exception{
		seleniumcore.clickonElement(NbcPageObjects.Hamburger_Menu_OR_backbutton, "Back to home screen");
	}

	public void NavigatingToArticles() throws Exception{
		for (int i = 0; i <=5; i++) {
			seleniumcore.Swipe_Horizontal(NbcPageObjects.Swiping_Articles);
		}
		seleniumcore.wait_For_Time(03);
		seleniumcore.Swipe_Horizontal(NbcPageObjects.Swiping_Ad_content);
		for (int i = 0; i <5; i++) {
			seleniumcore.Swipe_Horizontal(NbcPageObjects.Swiping_Articles);
		}
	}

	public void playing_Video() throws Exception{
		seleniumcore.wait_For_Time(03);
		seleniumcore.clickonElement(NbcPageObjects.Article_Content_tap_homepage, "News Article");
		seleniumcore.clickonElement(NbcPageObjects.Article_video_play_button, "video play button");
	}

	public void Section_Screen() throws Exception {
		seleniumcore.clickonElement(NbcPageObjects.Navigation_item_top_news, "Options Screen");
		seleniumcore.isDisplayed(NbcPageObjects.Navigation_item_top_news, "Section Screen");
	}

	public void weather_Screen() throws Exception{
		seleniumcore.clickonElement(NbcPageObjects.Weather_icon_section_page, "Weather icon");
	}

	public void HourlyForcastModule() throws Exception{
		seleniumcore.Swipe_Vertical(NbcPageObjects.Location_Name_Weather_page);
		seleniumcore.isDisplayed(NbcPageObjects.Hourly_forecast_module, "Hourly_forecast_module");
	}

	public void TenDayForcastModule() throws Exception{
		seleniumcore.Swipe_Vertical(NbcPageObjects.Hourly_Forecast_module_name_for_swiping);
		seleniumcore.Swipe_Vertical(NbcPageObjects.hourly_forecast_graph_swipe_down);
		seleniumcore.isDisplayed(NbcPageObjects.Hourly_Forecast_headline_text, "TenDayForcast");
	}

	public void Weathervideos() throws Exception {
		for (int i = 0; i < 6; i++) {
			seleniumcore.Swipe_Vertical(NbcPageObjects.Ten_day_forecast_swiping);
		}
		seleniumcore.isDisplayed(NbcPageObjects.weather_video_heading_for_swiping, "Weather video header");
	}

	public void MapsAndRadar() throws Exception {
		seleniumcore.Swipe_Vertical(NbcPageObjects.weather_video_heading_for_swiping);
		seleniumcore.Swipe_Horizontal(NbcPageObjects.Maps_and_radar_module_for_swiping);
		seleniumcore.isDisplayed(NbcPageObjects.Maps_and_radar_module_for_swiping, "MapAndRadarHeader");
	}
}
