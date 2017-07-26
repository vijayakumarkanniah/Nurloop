package com.Tring.nbc.core;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat; 
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.Tring.nbc.utils.Constants;
import com.Tring.nbc.utils.ExcelReader;
import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FrontEndTest {
	public static WebDriver driver;
	private String filePath;
	private ThreadLocal<WebDriver> driverThread = new ThreadLocal<WebDriver>();
	public static Logger logger = Logger.getLogger(FrontEndTest.class);		
	private LoadConfig config = LoadConfig.getInstance();
	private String testRunType;
	public static String currDir=System.getProperty("user.dir");
	public static ExtentReports extent;
	public static ExtentTest extentTest;	
	public static ExtentTest test_Report_child;
	public static ExcelReader testDataSheet;
	public static JSONObject jsonObject; 
	public static String scenarioName;
	
	public String getRunType() {
		return testRunType;
	}
	
	@BeforeSuite(alwaysRun=true)
	public void  launchBrowserAndURL() throws MalformedURLException 	{
		jsonObject=new JSONObject();    
		testDataSheet = ExcelReader.getInstance(Constants.PATHTESTDATA);
		Map<String, String> testData;
		testData = testDataSheet.getRowValue("BrowserConfiguration", "Setup");		
		String browser =testData.get("BrowserName");
		String version=testData.get("Version");
		String runType=testData.get("Runtype");
		String hubUrl=testData.get("hubUrl");
		openApp(browser, version, runType, hubUrl);
		String ReportFile = currDir+"\\Extend Reports\\extendReporFile_"+currentTimeStamp()+".html";
		// Create object of extent report and specify the report file path.
		extent = new ExtentReports(ReportFile, false, DisplayOrder.OLDEST_FIRST);
		testData = testDataSheet.getRowValue("BuildDetails", "Setup");	
		jsonObject.put("Build no", testData.get("Build no"));
		jsonObject.put("Sprint no",testData.get("Sprint"));
	}
	
	@AfterSuite(alwaysRun=true)
	public void  closeReport() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		int passCount = 0;
		int failCount = 0;
		driver.quit();
		System.out.println(jsonObject);		
		@SuppressWarnings("unchecked")
		Iterator<String> keys = jsonObject.keys();
	    while(keys.hasNext())
	    {
	        String key = keys.next();
	        String value = jsonObject.getString(key);
	        if(value.trim().equalsIgnoreCase("Pass"))
	        {
	        	passCount++;
	        }
	      else if (value.trim().equalsIgnoreCase("Fail")) 
	      {
			failCount++;
	      }
	    }
	    jsonObject.put("Total Test Scenario's",new Integer (passCount+failCount));
	    jsonObject.put("Total Scenarios Passed", passCount);
	    jsonObject.put("Total Scenarios Failed", failCount);
	    String dateTime=currentTimeStamp();
	    String newDateTime=dateTime.substring(0,10)+dateTime.replace('_', 'T').substring(10).replace('-', ':');	    
	    jsonObject.put("Date",newDateTime);
	    File file = new File(currDir+"\\JSONFiles\\JSONFileFor_"+currentTimeStamp()+".json");
		file.createNewFile();
		FileWriter fw = new FileWriter(file);
		fw.write(jsonObject.toString());
		fw.close();
	    System.out.println("Total Test Scenario's "+(passCount+failCount));
	    System.out.println("There are "+passCount+" Scenario's got Passed");
	    System.out.println("There are "+failCount+" Scenario's got Failed");
		extentTest.log(LogStatus.PASS,"Closing Browser", "Browser closed");			 
		// close report.
		extent.endTest(extentTest);	 
		// writing everything to document.
		extent.flush();
	}

	protected void openApp(String browserName, String version, String runType,String hubUrl) throws MalformedURLException {
	System.out.println("browserName"+browserName);
	String BrowName=browserName;
	String hubURL=hubUrl;
	URL url;
	DesiredCapabilities capabilities = new DesiredCapabilities();
	if(BrowName.equals("android")||BrowName.contentEquals("ios")){
		url= new URL(hubURL);
	}else{						
		url= new URL(hubURL);
		capabilities.setJavascriptEnabled(true);
	}

	// Browser Initialization - INTERNET EXPLORER
	if (BrowName.contentEquals("iexplore")) {			
		System.setProperty("webdriver.ie.driver", currDir+"\\BrowserDrivers\\IEDriverServer.exe");
		//capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities = DesiredCapabilities.internetExplorer();
	}else if (BrowName.contentEquals("firefox")) {
		capabilities = DesiredCapabilities.firefox();
	}else if (BrowName.contentEquals("googlechrome")) {
		File file = new File(currDir+"\\BrowserDrivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
	}else if (BrowName.contentEquals("opera")) {
		capabilities = DesiredCapabilities.opera();
		//Browser Initialization - HTML
	}else if (BrowName.contentEquals("html")) {
		capabilities = DesiredCapabilities.htmlUnit();
		//Browser Initialization - SAFARI
	}else if (BrowName.contentEquals("safari")) {
		capabilities = DesiredCapabilities.safari();
		capabilities.setBrowserName("safari");
	}else if (BrowName.contentEquals("android")) {
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capabilities.setCapability("device","Android");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", config.getDeviceName());
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		//capabilities.setCapability("device ID", "emulator-5554");
		capabilities.setCapability(CapabilityType.VERSION, config.getDeviceVersion());
	//	capabilities.setCapability(CapabilityType.PLATFORM, platform);
		//capabilities.setCapability("app", app.getAbsolutePath()); //app.getAbsolutePath()
		// Here we mention the app's package name, to find the package name we have to convert .apk file into java class files
		capabilities.setCapability("app-package",config.getAndroidAppPackageName());
		//Here we mention the activity name, which is invoked initially as app's first page.
		capabilities.setCapability("app-activity",config.getAndroidAppActivityName());

	}else if (BrowName.contentEquals("ios")) {

	}else{
		capabilities = DesiredCapabilities.firefox();			
	}

	System.out.println("**************************************************");

	driver = new AndroidDriver(url, capabilities);
	if(!BrowName.contentEquals("android")||BrowName.contentEquals("ios")){
		driver.manage().window().maximize();
	}		
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
}
	
	public void createChildTest(String moduleName,String testScenarioDescription) {
		test_Report_child = extent.startTest(moduleName,testScenarioDescription);
	}
	
	public void logStatusFail(String testDescription,String errorMessage) {	
		test_Report_child.log(LogStatus.FAIL, testDescription,errorMessage);
		//extentTest.appendChild(test_Report_child);
		extentTest.getTest().setStatus(LogStatus.FAIL);
	}
	
	public void logStatusPass(String description,String result) {
		test_Report_child.log(LogStatus.PASS, description, result);
	}
	
	public void appendChildTest() 	{
		LogStatus currParentStatus = extentTest.getRunStatus();
		LogStatus currChildStatus = test_Report_child.getRunStatus();
		if(currParentStatus.toString().equals("unknown")) {
			extentTest.getTest().setStatus(test_Report_child.getRunStatus()); 
		} else if(currChildStatus.toString().equals("pass") && currParentStatus.toString().equals("pass")) {
			extentTest.getTest().setStatus(LogStatus.PASS); 
		}else {
			extentTest.getTest().setStatus(LogStatus.FAIL); 
		} 
		extentTest.appendChild(test_Report_child);
	}

	/**
	 * Setting Capabilities for different browsers
	 * @param browserName
	 * @param version
	 * @return DesiredCapabilities
	 */
	private DesiredCapabilities setCapabilities(String browserName,	String version) {
		DesiredCapabilities dc = null;
		if ("Firefox".equals(browserName)) {
			dc = DesiredCapabilities.firefox();
			dc.setVersion(version); // Issues in setting up the version for Grid
		} else if ("Chrome".equals(browserName)) {
			dc = DesiredCapabilities.chrome();
			dc.setVersion(version);
		} else if ("IE".equals(browserName)) {
			dc = DesiredCapabilities.internetExplorer();
			dc.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
			dc.setVersion(version);
		} else if ("Safari".equals(browserName)) {
			dc = DesiredCapabilities.safari();
			final SafariOptions options = new SafariOptions();
			options.setUseCleanSession(true);
			dc.setCapability(SafariOptions.CAPABILITY, options);
		}
		return dc;
	}

	/**
	 * Function to instantiate the remote driver with the given HUB URL and
	 * DesiredCapabilities
	 * @param hubUrl
	 * @param dc
	 * @return driver
	 */
	private RemoteWebDriver getRemoteDriver(String hubUrl, DesiredCapabilities dc) {
		RemoteWebDriver remoteWD = null;
		try {
			logger.info(" Starting Session at:" + hubUrl);
			remoteWD = new RemoteWebDriver(new URL(hubUrl), dc);
			remoteWD.setFileDetector(new LocalFileDetector());
		} catch (MalformedURLException e) {	
			logger.error(e.getMessage(),e.getCause());
		}
		return remoteWD;
	}

	/**
	 * Gets the file path to be used to store results on failure.
	 * @return filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * Setting the file path to be used to store results on failure.
	 * 
	 * @param filePath
	 *            - file path where reports will be saved.
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	/**
	 * Returns current timestamp.
	 * @return - current timestamp
	 */
	public static String currentTimeStamp() {
		final String dateFormat = "yyyy-MM-dd_hh-mm-ss";
		final Date d = new Date();
		final SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(d);
	}
	/**
	 * Capture the screen shot at the specified location.
	 * 
	 * @param result
	 *            - test result
	 */
	public void takeScreenShot(ITestResult result) {
		try {
			final File screenshot = ((TakesScreenshot) driverThread.get()).getScreenshotAs(OutputType.FILE);
			System.out.println(driverThread.get());
			final String testClassName = result.getTestClass().getRealClass().getSimpleName();
			final String suiteName = result.getTestContext().getSuite().getName()+ "--" + currentTimeStamp();
			final String testMethodName = result.getMethod().getMethodName();
			final String testName = result.getTestContext().getName();
			final String saveToPath = System.getProperty("user.dir")+ "/Reports/" + suiteName + "/" + testName + "/"+ testClassName + "/" + testMethodName;
			setFilePath(saveToPath);
			final String saveScreenshot = filePath + "/screenshot.png";
			System.out.println(" Copying screenshot to " + saveScreenshot);
			FileUtils.copyFile(screenshot, new File(saveScreenshot));
			System.out.println(" Screenshot copied ");
			final String saveErrorMsg = filePath + "/exceptionLogs.txt";
			writeToFile(result.getThrowable(), saveErrorMsg);
			//super.reportResults(filePath);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

	/**
	 * Writes the Exception trace to the file.
	 * @param throwable
	 * @param filePath
	 */
	private void writeToFile(Throwable throwable, String writeFilePath) {
		try {
			final OutputStream os = new FileOutputStream(writeFilePath);
			final PrintStream ps = new PrintStream(os);
			throwable.printStackTrace(ps);
		} catch (IOException io) {
			logger.error(io.getMessage(), io.getCause());
		}
	}

	/**
	 * Quit Browser after every class.
	 */
	//@AfterClass(alwaysRun=true)
	public void closeBrowser() {
		if (driverThread.get() != null) {
			final WebDriver wd = driverThread.get();
			wd.quit();
		}
	}

	/**
	 * Set Driver Instance to the ThreadLocal.
	 * 
	 * @param driverTh
	 *            - driver instance to be set to ThreadLocal.
	 */
	public void setDriverThread(WebDriver driverTh) {
		this.driverThread.set(driverTh);
	}	
}