package com.urloopWebScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.urloopWeb.ModuleObjects.BookAserviceWeb_Object;
import com.urloopWeb.ModuleObjects.GroupWeb_Object;
import com.urloopWebPages.Browser;

public class GroupWebScripts {
	
	public static Browser browser;
	
	public void createGroups(GroupWeb_Object groupWeb_Object) throws InterruptedException {
		
		
		Thread.sleep(15000);
		browser.driver.findElement(By.xpath(".//*[@id='side-menu']/li[2]/a/span[text()='Groups']")).click();
		Thread.sleep(10000);
		browser.driver.findElement(By.xpath(".//*[@id='groups']/div[1]/div[2]/div/a/button/span[text()='Create New Group']")).click();
		Thread.sleep(5000);
		
		browser.driver.findElement(By.xpath(".//*[@name='groupname']")).sendKeys("Good Groups");
		Thread.sleep(5000);
		browser.driver.findElement(By.xpath(".//*[@value='staff']")).click();
		Thread.sleep(5000);
		browser.driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("Description");
		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor)browser.driver;
		jse.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(5000);
		browser.driver.findElement(By.xpath(".//*[@id='groupcreate']/div[1]/div[2]/a[text()='Save']")).click();
		
	}

}
