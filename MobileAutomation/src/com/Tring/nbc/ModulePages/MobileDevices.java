package com.Tring.nbc.ModulePages;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileDevices {

	public static WebDriver driver=null;

	public static void main(String[] args) throws MalformedURLException {
		System.out.println("-------------------------------");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.4");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("app", "D:\\APKfiles\\ptl.apk");
	/*	capabilities.setCapability("appPackage", "naukriApp.appModules.login");
		capabilities.setCapability("appActivity", "com.naukri.fragments.NaukriSplashScreen");*/
		
		capabilities.setCapability("appPackage", "com.payoda.ptl");
		capabilities.setCapability("appActivity", "com.payoda.ptl.LoginActivity");
		
		driver =new AndroidDriver(new URL("http://127.0.0.1:3333/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(260, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(260, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Email Address']")).sendKeys("2345678");
		
		System.out.println("end test");
	}


}
