package com.urloopWebScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.excelGetterSetter.GroupGS;
import com.urloopWeb.ModuleObjects.GroupWeb_Object;
import com.urloopWebPages.Browser;

public class GroupWebScripts {

	private int i = 1;

	public void createGroups(GroupWeb_Object groupWeb_Object, GroupGS groupGS) throws InterruptedException, AWTException {

		Thread.sleep(15000);
		Browser.findElementByPath(".//*[@id='side-menu']/li[2]/a/span[text()='Groups']").click();
		Thread.sleep(10000);

		JavascriptExecutor jse = (JavascriptExecutor) Browser.driver;
		jse.executeScript("scroll(0, -250);");

		Thread.sleep(5000);

		Browser.findElementByPath(".//*[@id='groups']/div[1]/div[2]/div/a/button/span[text()='Create New Group']")
				.click();
		Thread.sleep(5000);
		
		
		/*Attachment*/
		
		Browser.findElementByPath(".//*[@id='fileinfo']/a[text()='Add Image']")
		.click();
Thread.sleep(5000);
		
		StringSelection sel = new StringSelection("Group.jpg");

		/*    Copy to clipboard*/
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		System.out.println("selection" +sel);
		
		
		/*Create object of Robot class*/
		Robot robot = new Robot();
		Thread.sleep(1000);
	
		/*Press Enter*/
		robot.keyPress(KeyEvent.VK_ENTER);

		 /*Release Enter*/
		robot.keyRelease(KeyEvent.VK_ENTER);

		/*Press CTRL+V*/
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		/*Release CTRL+V*/
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		/*Press Enter */
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		
		Thread.sleep(10000);
		/*Attachment*/
		
		

		Browser.findElementByPath(".//*[@name='groupname']").sendKeys(groupGS.getGroupName());
		Thread.sleep(5000);

		if (Boolean.valueOf(groupGS.getOnly_Staff())) {
			Browser.findElementByPath(".//*[@value='staff']").click();
		}

		if (Boolean.valueOf(groupGS.getOnly_Residents())) {
			Browser.findElementByPath(".//*[@value='resident']").click();
		}

		if (Boolean.valueOf(groupGS.getEveryone())) {
			Browser.findElementByPath(".//*[@value='everyone']").click();
		}

		Thread.sleep(5000);
		Browser.findElementByPath(".//*[@id='description']").sendKeys(groupGS.getDescription());
		Thread.sleep(5000);

		/* JavascriptExecutor jse = (JavascriptExecutor)Browser.driver; */
		jse.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(5000);
		Browser.findElementByPath(".//*[@id='groupcreate']/div[1]/div[2]/a[text()='Save']").click();

	}

	public void scroll(GroupGS groupGS) throws InterruptedException {
		
		
		Thread.sleep(15000);
		Browser.findElementByPath(".//*[@id='side-menu']/li[2]/a/span[text()='Groups']").click();
		Thread.sleep(10000);
		
		

		
		Thread.sleep(10000);

		while (true) {

			i++;
			String hello = Browser
					.findElementByPath(".//*[@id='groups']/div[2]/div/div/div[2]/div/div/div[" + i + "]/div/span")
					.getText().toString().trim();
			System.out.println("hi :"+hello);
			
			if (hello.equals(groupGS.getGroupName().trim())) {
				JavascriptExecutor je = (JavascriptExecutor) Browser.driver;
				WebElement element = Browser.findElementByPath(".//*[@id='groups']/div[2]/div/div/div[2]/div/div/div[" + i
								+ "]/div/span[text()='"+groupGS.getGroupName()+"']");
				je.executeScript("arguments[0].scrollIntoView(true);", element);
				System.out.println("Completed");

				Thread.sleep(5000);

				WebElement targetElement = Browser
						.findElementByPath(".//*[@id='groups']/div[2]/div/div/div[2]/div/div/div[" + i + "]/a/div");
				Actions action = new Actions(Browser.driver);
				/* action.click(targetElement); */
				action.moveToElement(targetElement);
				action.perform();

				Thread.sleep(5000);

				Browser.findElementByPath(".//*[@id='groups']/div[2]/div/div/div[2]/div/div/div[" + i + "]/a/div/div")
						.click();
				break;
				
				
				
			}
		}
	}
	
	
	public void feedPosting(GroupGS groupGS) throws InterruptedException, AWTException{
		
		Thread.sleep(10000);
		
		Browser.findElementByPath(".//*[@id='viewGroup']/div[2]/div/div/div")
		.click();

		Thread.sleep(5000);
		Browser.findElementByPath(".//*[@id='gp-create-post-modal-box']/div/div[2]/div[2]/div[1]/textarea")
		.sendKeys(groupGS.getFeedPost());
		Thread.sleep(5000);
		
		
		
		/*Attachment*/
		
		Browser.findElementByPath(".//*[@id='imgInp']").click();
		Thread.sleep(5000);
		
		StringSelection sel = new StringSelection("Group.jpg");

		/*    Copy to clipboard*/
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		System.out.println("selection" +sel);
		
		
		/*Create object of Robot class*/
		Robot robot = new Robot();
		Thread.sleep(1000);
	
		/*Press Enter*/
		robot.keyPress(KeyEvent.VK_ENTER);

		 /*Release Enter*/
		robot.keyRelease(KeyEvent.VK_ENTER);

		/*Press CTRL+V*/
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		/*Release CTRL+V*/
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		/*Press Enter */
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		
		Thread.sleep(10000);
		/*Attachment*/
		

		Browser.findElementByPath(".//*[@id='gp-create-post-modal-box']/div/div[3]/a/button[text()='Post']")
		.click();
		
		
		
		
		
	}
	

}
