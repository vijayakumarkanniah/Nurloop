package com.Tring.nbc.ModuleObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class Mobile_Object {
	
	@FindBy(id="username")
	public WebElement WebUsername;
	
	@FindBy(id="password")
	public WebElement WebPassword;
	
	
	@FindBy(id="btn-login")
	public WebElement LoginClick;
	
	
	@FindBy(id="com.android.packageinstaller:id/permission_allow_button")
	public WebElement Permission_Location_PopUp_Allow_Button;
	
	
	@FindBy(name="SET YOUR START SCREEN")
	public WebElement Set_Your_Start_screen;
	
	@FindBy(name="Save")
	public WebElement Save_Homepage_save_button;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/toolbar_title_layout")
	public WebElement Skip_tutorial;
	
	@FindBy(name="Top Stories")
	public WebElement News_Homepage_selection_navigation_menu;
	
	@FindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
	public WebElement Hamburger_Menu_OR_backbutton;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/headline_layout")
	public WebElement Article_Content_tap_homepage;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/image_layout")
	public WebElement Swiping_Articles;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/ad_view")
	public WebElement Swiping_Ad_content;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/article_type_image")
	public WebElement Article_video_play_button;
	
	@FindBy(name="Top News")
	public WebElement Navigation_item_top_news;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/title")
	public WebElement Section_title;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/weather_view_container")
	public WebElement Weather_icon_section_page;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/selected_location_text")
	public WebElement Location_Name_Weather_page;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/hourly_forecast_text")
	public WebElement Hourly_forecast_module;
	
	@FindBy(name="Hourly Forecast")
	public WebElement Hourly_Forecast_module_name_for_swiping;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/headline")
	public WebElement Hourly_Forecast_headline_text;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/weather_daily_forecast_layout")
	public WebElement Ten_day_forecast_swiping;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/weather_forecast_video_headline")
	public WebElement weather_video_heading_for_swiping;
	
	@FindBy(name="Maps & Radar")
	public WebElement Maps_and_radar_module_for_swiping;
	
	@FindBy(xpath="//android.widget.TextView[@index='10']")
	public WebElement Navigation_item_swiping_down_to_up;
	
	@FindBy(xpath="//android.widget.TextView[@index='12']")
	public WebElement Another_navigation_item_for_swiping;
	
	@FindBy(name="Sports")
	public WebElement Sport_item_for_navigation_item_swiping;
	
	@FindBy(name="Entertainment")
	public WebElement Entertainment_item_navigation_swiping;
	
	@FindBy(name="Submit Photos/Videos")
	public WebElement Navigation_menu_item_click;
	
	@FindBy(name="TV Listings")
	public WebElement Navigation_item_click_TVlisting;
	
	@FindBy(name="Contact Us")
	public WebElement Navigation_item_contactUS_click;
	
	@FindBy(name="President Trump")
	public WebElement Navigation_item_President_trump_swipe;
	
	@FindBy(name="Triple Crown")
	public WebElement Navigation_item_TripleCrown_swipe;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/watch_live_icon")
	public WebElement Live_TV_icon_click;
	
	@FindBy(xpath="//android.widget.ImageButton[@index='0']")
	public WebElement TV_dropdown_cross_button_click;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/action_weather")
	public WebElement Weather_icon_newshomepage;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/action_settings")
	public WebElement Settings_page_from_navigation;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/hourly_forecast_graph")
	public WebElement hourly_forecast_graph_swipe_down;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/map_image_view")
	public WebElement maps_images_click;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android:id/gallery_Image")
	public WebElement gallery_images_swipe;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android:id/display_ad")
	public WebElement gallery_ad_scroll;
	
	@FindBy(name="Watch Live: Today in New York")
	public WebElement Watch_live_context_bar_text;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/ad_view")
	public WebElement section_article_screen_ad_check;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/web_view_container")
	public WebElement Article_page_swipe_onetime;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/ok")
	public WebElement Article_video_tutorial_ok_button;
	
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"YOU MIGHT LIKE\"));")
	public WebElement Article_page_scroll_down;
	
	@FindBy(name="YOU MIGHT LIKE")
	public WebElement Verifying_text_visible_article_page;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/maximize_minimize_image_button")
	public WebElement Interactive_radar_maximise_minimise;
	
	@FindBy(xpath="//android.widget.FrameLayout[@index='1']")
	public WebElement Default_market_location_selection;
	
	@FindBy(name="Set Location")
	public WebElement location_set_click;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/search_text")
	public WebElement search_box_selection;
	
	@FindBy(name="Local")
	public WebElement Navigation_item_local;
	
	@FindBy(name="Top Video")
	public WebElement Navigation_item_top_video;
	
	@FindBy(name="US & World")
	public WebElement Navigation_item_USandWorld;
	
	@FindBy(name="Investigations")
	public WebElement Navigation_item_investigation;
	
	@FindBy(name="Recall Alert")
	public WebElement Navigation_item_Recall_alert;
	
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"Forecast\"));")
	public WebElement Navigation_item_scrollto_forecast;
	
	@FindBy(name="Weather Alerts")
	public WebElement Navigation_item_Weather_alert;
	
	@FindBy(name="School Closings")
	public WebElement Navigation_item_school_alert;
	
	@FindBy(name="Watch Live TV Now")
	public WebElement Navigation_item_Watch_live_TV;
	
	@FindBy(name="Traffic")
	public WebElement Navigation_item_Traffic;
	
	@FindBy(name="Top Entertainment")
	public WebElement Navigation_item_Top_Entertainment;
	
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"Sports\"));")
	public WebElement Navigation_item_scrollto_sports;
	
	@FindBy(name="New York Live")
	public WebElement Navigation_item_New_York_Live;
	
	@FindBy(name="In The Wings")
	public WebElement Navigation_item_IntheWings;
	
	@FindBy(name="The Scene")
	public WebElement Navigation_item_TheScene;
	
	@FindBy(name="Entertainment News")
	public WebElement Navigation_item_Entertainment_news;
	
	@FindBy(name="Top Investigations")
	public WebElement Navigation_item_Top_Investigation;
	
	@FindBy(name="Better Get Baquero")
	public WebElement Navigation_item_Better_get_Baquero;
	
	@FindBy(name="NBC Live FAQ")
	public WebElement Navigation_item_NBC_Live_FAQ;
	
	@FindBy(name="App FAQ")
	public WebElement Navigation_item_App_FAQ;
	
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"TV Listings\"));")
	public WebElement Navigation_item_scrollto_TVListings;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/live_tve")
	public WebElement Article_screen_TV_icon;
	
	@FindBy(name="Set Your Start Screen")
	public WebElement Navigation_item_Set_your_start_screen;
	
	@FindBy(name="Weather")
	public WebElement Start_screen_option_weather;
	
	@FindBy(name="Save")
	public WebElement Start_screen_save_button;
	
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"Top Stories\"));")
	public WebElement Navigation_item_Scrollto_TopStories;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/open_nbc_app")
	public WebElement TVE_dropdown_watch_now;
	
	@FindBy(id="com.nbcuni.nbcots.nbcnewyork.android.development.development:id/optimum")
	public WebElement TVE_provider_selector;
	
	@FindBy(xpath="//android.widget.EditText[contains(@resource-id,'IDToken1')]")
	public WebElement Username_text_box_TVE_provider;
	
	@FindBy(xpath="//android.widget.EditText[contains(@resource-id,'IDToken2')]")
	public WebElement Password_text_box_TVE_provider;
	
	@FindBy(xpath="//android.widget.Image[contains(@resource-id,'logo')]")
	public WebElement Select_logo_to_hide_keyboard;
	
	@FindBy(xpath="//android.widget.Image[contains(@resource-id,'signin_button')]")
	public WebElement Sign_in_button;


}
