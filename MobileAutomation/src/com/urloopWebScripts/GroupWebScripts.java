package com.urloopWebScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.excelGetterSetter.GroupGS;
import com.urloopWeb.ModuleObjects.BookAserviceWeb_Object;
import com.urloopWeb.ModuleObjects.GroupWeb_Object;
import com.urloopWebPages.Browser;

public class GroupWebScripts {
	
	public static Browser browser;
	
	public static String booleans ="1";
	
	private int i=1;
	
	public void createGroups(GroupWeb_Object groupWeb_Object,GroupGS groupGS) throws InterruptedException {
		
		
		Thread.sleep(15000);                  
		browser.driver.findElement(By.xpath(".//*[@id='side-menu']/li[2]/a/span[text()='Groups']")).click();
		Thread.sleep(10000);
		browser.driver.findElement(By.xpath(".//*[@id='groups']/div[1]/div[2]/div/a/button/span[text()='Create New Group']")).click();
		Thread.sleep(5000);
		
		browser.driver.findElement(By.xpath(".//*[@name='groupname']")).sendKeys(groupGS.getGroupName());
		Thread.sleep(5000);
		
		if(groupGS.getOnly_Staff().equals(booleans)){
			browser.driver.findElement(By.xpath(".//*[@value='staff']")).click();
		}
		
		if(groupGS.getOnly_Residents().equals(booleans)){
			browser.driver.findElement(By.xpath(".//*[@value='resident']")).click();
		}
		
		if(groupGS.getEveryone().equals(booleans)){
			browser.driver.findElement(By.xpath(".//*[@value='everyone']")).click();
		}
		
		
		Thread.sleep(5000);
		browser.driver.findElement(By.xpath(".//*[@id='description']")).sendKeys(groupGS.getDescription());
		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor)browser.driver;
		jse.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(5000);
		browser.driver.findElement(By.xpath(".//*[@id='groupcreate']/div[1]/div[2]/a[text()='Save']")).click();
	
		
		
	}
	
	public void scroll(GroupGS groupGS) throws InterruptedException{
		
		Thread.sleep(10000);
		
		
	while(true){
			
			i++;
			String hello = browser.driver.findElement(By.xpath(".//*[@id='groups']/div[2]/div/div/div[2]/div/div/div["+i+"]/div/span")).getText().toString();
		if(hello.equals(groupGS.getOnly_Residents()))	
		{
		JavascriptExecutor je = (JavascriptExecutor) browser.driver;
		WebElement element = browser.driver.findElement(By.xpath(".//*[@id='groups']/div[2]/div/div/div[2]/div/div/div["+i+"]/div/span[text()='Scroll Element']"));
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		System.out.println("Completed");
		
		
Thread.sleep(5000);
		
		WebElement targetElement = browser.driver.findElement(By.xpath(".//*[@id='groups']/div[2]/div/div/div[2]/div/div/div["+i+"]/a/div"));
		Actions action = new Actions(browser.driver);
		/*action.click(targetElement);*/
		action.moveToElement(targetElement);
		action.perform();
		
		Thread.sleep(5000);
		
		browser.driver.findElement(By.xpath(".//*[@id='groups']/div[2]/div/div/div[2]/div/div/div["+i+"]/a/div/div")).click();
		break;
		}
		}}
	
	
	

}
