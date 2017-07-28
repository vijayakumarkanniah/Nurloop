package com.urloopWebScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.excelGetterSetter.GroupGS;
import com.urloopWeb.ModuleObjects.GroupWeb_Object;
import com.urloopWebPages.Browser;

public class GroupWebScripts {

	private int i = 1;

	public void createGroups(GroupWeb_Object groupWeb_Object, GroupGS groupGS) throws InterruptedException {

		Thread.sleep(15000);
		Browser.findElementByPath(".//*[@id='side-menu']/li[2]/a/span[text()='Groups']").click();
		Thread.sleep(10000);

		JavascriptExecutor jse = (JavascriptExecutor) Browser.driver;
		jse.executeScript("scroll(0, -250);");

		Thread.sleep(5000);

		Browser.findElementByPath(".//*[@id='groups']/div[1]/div[2]/div/a/button/span[text()='Create New Group']")
				.click();
		Thread.sleep(5000);

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
					.getText().toString();
			if (hello.equals(groupGS.getOnly_Residents())) {
				JavascriptExecutor je = (JavascriptExecutor) Browser.driver;
				WebElement element = Browser.findElementByPath(".//*[@id='groups']/div[2]/div/div/div[2]/div/div/div[" + i
								+ "]/div/span[text()='"+groupGS.getOnly_Residents()+"']");
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

}
