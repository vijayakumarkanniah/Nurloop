package delete;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.Tring.nbc.ModuleObjects.Mobile_Object;
import com.Tring.nbc.utils.Constants;
import com.Tring.nbc.utils.ExcelReader;
import com.Tring.nbc.utils.SeleniumCore;
import com.Tring.nbc.utils.SeleniumUtil;

public class Web {

	public static ExcelReader testDataSheet;
	
	public static SeleniumCore seleniumcore;
	public SeleniumUtil seleniumutil;
	public static Mobile_Object NbcPageObjects;
	
	
	
	public static ChromeDriver driver;
	
	public static void main(String args[]) throws IOException{
		
		
		
		
		
		testDataSheet = ExcelReader.getInstance(Constants.PATHTESTDATA);
		String  testDataf;
		testDataf = testDataSheet.getCellValue("BrowserConfiguration","Setup","BrowserName");
		System.out.println("Columb Values"+testDataf);
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VIJAY KUMAR\\workspace_new\\MobileAutomation\\MobileAutomation\\resources\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		/*driver.manage().window().maximize();*/
		
		driver.get("https://urloop-testing.appspot.com");
		
		
		
		seleniumcore=PageFactory.initElements(driver,SeleniumCore.class);
		NbcPageObjects=PageFactory.initElements(driver, Mobile_Object.class);
		
		
	String	username = testDataSheet.getCellValue("ValidCredentials","Login","Username");
	String	password = testDataSheet.getCellValue("ValidCredentials","Login","Password");
		
		
		NbcPageObjects.WebUsername.sendKeys(username);
		NbcPageObjects.WebPassword.sendKeys(password);
		NbcPageObjects.LoginClick.click();
}}
