package com.urloopWebPages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static ChromeDriver driver;
	
	public static void /*ChromeDriver*/ browserDriver(String browser){
		
		if(browser == "Chrome"){
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\VIJAY KUMAR\\workspace_new\\MobileAutomation\\MobileAutomation\\resources\\browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			/*driver.manage().window().maximize();*/
			driver.manage().window().maximize();
			driver.get("https://urloop-dev-1.appspot.com");
			
		}
	/*	return driver;*/
		
	}

}
