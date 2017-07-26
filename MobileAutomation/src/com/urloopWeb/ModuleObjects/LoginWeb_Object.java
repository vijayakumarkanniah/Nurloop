package com.urloopWeb.ModuleObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginWeb_Object {

	
	@FindBy(id="username")
	public WebElement WebUsername;
	
	@FindBy(id="password")
	public WebElement WebPassword;
	
	
	@FindBy(id="btn-login")
	public WebElement LoginClick;
}
