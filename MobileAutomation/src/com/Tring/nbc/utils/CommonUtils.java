package com.Tring.nbc.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import com.urloopWebPages.Browser;

public class CommonUtils {

	public static void attachment(String domElements, String Filname) throws AWTException, InterruptedException {

		/* Attachment */

		Browser.findElementByPath(domElements).click();
		Thread.sleep(5000);

		StringSelection sel = new StringSelection(Filname);

		/*     Copy to clipboard */
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		System.out.println("selection" + sel);

		/* Create object of Robot class */
		Robot robot = new Robot();
		Thread.sleep(1000);

		/* Press Enter */
		robot.keyPress(KeyEvent.VK_ENTER);

		/* Release Enter */
		robot.keyRelease(KeyEvent.VK_ENTER);

		/* Press CTRL+V */
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		/* Release CTRL+V */
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		/* Press Enter  */
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(10000);
		/* Attachment */

	}

}
