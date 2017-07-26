package com.urloopWeb.ModuleObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookAserviceWeb_Object {

	
	@FindBy(xpath=".//*[@id='careAssessment']/div/div[1]/div[2]/div/button")
	public WebElement WebBookAServices;
	
	@FindBy(id="password")
	public WebElement WebPassword;
	
	
	@FindBy(id="btn-login")
	public WebElement LoginClick;
	
}
