package com.urloopWebPages;

import java.io.FileNotFoundException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Tring.nbc.utils.Constants;
import com.Tring.nbc.utils.ExcelReader;
import com.excelGetterSetter.CareAssessmentGS;
import com.excelGetterSetter.LoginGS;
import com.excelGetterSetter.ServicesGS;
import com.urloopWeb.ModuleObjects.LoginWeb_Object;
import com.urloopWebScripts.CareAssessmentWebScripts;
import com.urloopWebScripts.LoginWebScripts;
import com.urloopWebScripts.ServicesWebScripts;

public class CareAssessmentWebPages {
	
	
	
	public static ExcelReader testDataSheet;
	public static LoginWebScripts loginWebScripts;
	public static ChromeDriver driver;
	public static CareAssessmentWebPages careAssessmentWebPages;
	public static CareAssessmentGS careAssessmentGS;
	public static LoginWebPages loginWebPages;
	public static CareAssessmentWebScripts careAssessmentWebScripts;
	
	@BeforeTest
	private void configuration() {
		
		testDataSheet = ExcelReader.getInstance(Constants.PATHTESTDATA);
		careAssessmentWebPages = new CareAssessmentWebPages();
		careAssessmentGS = new CareAssessmentGS();
		careAssessmentWebScripts = new CareAssessmentWebScripts();
		loginWebPages = new LoginWebPages();
	}

	@Test(priority = 1)
	public void login() throws InterruptedException, FileNotFoundException {
		loginWebPages.configuration();
		loginWebPages.validCredentials();
	}
	
	@Test(priority = 2)
	public void createCareassessment() throws InterruptedException{
		
		careAssessmentGS.setTemplateName(
				testDataSheet.getCellValue("CareAssessment_Creation", "CareAssessment", "TemplateName"));
		careAssessmentGS.setQuestionTitle(
				testDataSheet.getCellValue("CareAssessment_Creation", "CareAssessment", "QuestionTitle"));
		careAssessmentGS.setQuestionAnswer1(
				testDataSheet.getCellValue("CareAssessment_Creation", "CareAssessment", "Answer1"));
		careAssessmentGS.setQuestionType(
				testDataSheet.getCellValue("CareAssessment_Creation", "CareAssessment", "Question Type"));
		
		careAssessmentWebScripts.createAssessment(careAssessmentGS);
	}
}
