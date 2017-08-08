package com.urloopWebScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Tring.nbc.utils.WebScriptConstants;
import com.excelGetterSetter.CareAssessmentGS;
import com.urloopWebPages.Browser;

public class CareAssessmentWebScripts {
	
	public void createAssessment(CareAssessmentGS careAssessmentGS) throws InterruptedException{
	
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.CAREASSESSMENT_MENU).click();
		
		Thread.sleep(10000);
		Browser.findElementByPath(WebScriptConstants.CREATE_CAREASSESSMENT_BUTTON).click();
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.CAREASSESSMENT_TITLE_NAME).sendKeys(careAssessmentGS.getTemplateName());
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.CAREASSESSMENT_QUESTIONTYPE_FILED).click();
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.CAREASSESSMENT_QUESTIONTYPE_FILED_SINGLE_CHOICE).click();
		
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.CAREASSESSMENT_SERVICE_NAME_FIELD).click();
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.CAREASSESSMENT_SERVICE_NAME_FIELD_VALUE).click();
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.CAREASSESSMENT_QUESTION_TITLE).sendKeys(careAssessmentGS.getQuestionTitle());
		
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.CAREASSESSMENT_ANSWER_1).sendKeys(careAssessmentGS.getQuestionAnswer1());
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.CAREASSESSMENT_ANSWER_SAVE).click();
		
		
Thread.sleep(5000);
		
		WebElement c = Browser.findElementByPath(WebScriptConstants.SERVICE_BREAD_CRUMS);
		((JavascriptExecutor)Browser.driver).executeScript("arguments[0].scrollIntoView();", c);
		
		Thread.sleep(5000);
		Browser.findElementByPath(WebScriptConstants.CAREASSESSMENT_SAVE).click();
		
	}

}
