package com.urloopWebScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excelGetterSetter.LoginGS;
import com.urloopWeb.ModuleObjects.ExcelObjects;
import com.urloopWeb.ModuleObjects.LoginWeb_Object;
import com.urloopWebPages.*;

public class LoginWebScripts {

	
	public static String Validation;
	
	
	public static void login(LoginWeb_Object loginWeb_Object,LoginGS loginGS) throws InterruptedException{
		loginWeb_Object.WebUsername.clear();
		loginWeb_Object.WebUsername.sendKeys(loginGS.getUserName());
		loginWeb_Object.WebPassword.clear();
		loginWeb_Object.WebPassword.sendKeys(loginGS.getPassWord());
		loginWeb_Object.LoginClick.click();
		Thread.sleep(2000);
		}
}
