package com.Tring.nbc.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Tring.nbc.core.FrontEndTest;

public class SeleniumUtil extends FrontEndTest {

	public final Logger logger = Logger.getLogger(SeleniumUtil.class);
	public final WebDriverWait wait;
	private final SeleniumCore seleniumcore;

	/**
	 * @param driver
	 *            the driver
	 */
	public SeleniumUtil(WebDriver driver) {
		wait = new WebDriverWait(driver, 5);
		seleniumcore = PageFactory.initElements(driver, SeleniumCore.class);
	}

	/**
	 * Click on The Enter Button
	 */
	public void clickEnterButton(){
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
	}

	/**
	 * Click on The Enter Button
	 */
	public void clickEscButton(){
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ESCAPE).build().perform();
		//waitForPageToLoad(driver);
	}

	/*
	 * Page down
	 */
	public void pageDown(){
		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
	}


	/*
	 * Copy On Clip Board
	 */
	public void copyOnClipBoard(String location) throws AWTException{
		StringSelection path=new StringSelection(location);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		seleniumcore.waitForMilliSeconds(2000);
		Robot robot=new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
		seleniumcore.waitForMilliSeconds(1000);
		robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyPress(java.awt.event.KeyEvent.VK_V);
		robot.keyRelease(java.awt.event.KeyEvent.VK_V);
		robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		seleniumcore.waitForMilliSeconds(1000);
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	}

	/*
	 * Right Click on element
	 */
	public void rightClickon_element(WebElement RightClickelement,WebElement MenuElement){
		Actions actions = new Actions(driver);
		actions.click(RightClickelement).build().perform();
		actions.contextClick(RightClickelement).build().perform();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		actions.click(MenuElement).build().perform();
	}

	/*
	 * Right Click on element move to sub menu
	 */
	public void rightClickon_element_Moveto_SubMenu(WebElement RightClickelement,WebElement MenuElement,WebElement  SubMenuElement){
		Actions actions = new Actions(driver);
		actions.click(RightClickelement).build().perform();
		actions.contextClick(RightClickelement).build().perform();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		actions.click(MenuElement).build().perform();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", SubMenuElement);
	}
	
	/*
	 * Double click on Element
	 */
	public void doubleclick(WebElement dobleclickElement ){
		Actions actions = new Actions(driver);
		actions.click(dobleclickElement).build().perform();
		actions.doubleClick(dobleclickElement).build().perform();
	}
	
	public long timestamp(){
		Date date=new Date();
		long currentdate=date.getTime();
		return currentdate;
	}

}