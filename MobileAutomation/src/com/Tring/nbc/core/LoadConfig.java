package com.Tring.nbc.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public final class LoadConfig {

	private static String propFilePath = "resources/config.properties";
	private static LoadConfig loadConfig;
	private static Properties props;
	public static Logger logger = Logger.getLogger(LoadConfig.class);

	/**
	 * Constructor to load properties.
	 * 
	 * @throws FileNotFoundException
	 *             - throws if file does not found.
	 * @throws IOException
	 */
	private LoadConfig() throws FileNotFoundException, IOException {
		props = new Properties();
		props.load(new FileInputStream(propFilePath));
	}

	/**
	 * @return - instance of LoadConfig.
	 */
	public static LoadConfig getInstance() {
		try {
			loadConfig = new LoadConfig();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return loadConfig;
	}

	/**
	 * @return - Arista Home URL.
	 */
	public String getAristaURL() {
		return props.getProperty("aristaURL");
	}

	/**
	 * @return String
	 */
	public String getIEDriverPath() {
		return props.getProperty("IEDriverPath");
	}

	/**
	 * @return String
	 */
	public String getChromeDriverPath() {
		return props.getProperty("ChromeDriverPath");
	}
	
	public String getTestRun() {
		return props.getProperty("testRun").trim();
	}
	
	public String getBrowserName() {
		return props.getProperty("browser").trim();
	}
	
	public String getBuildNo() {
		return props.getProperty("buildNo").trim();
	}
	
	public String getRunNo() {
		return props.getProperty("runNumber").trim();
	}
	
	public String getDeviceVersion() {
		return props.getProperty("DeviceVersion").trim();
	}
	
	public String getDeviceName() {
		return props.getProperty("DeviceName").trim();
	}
	
	
	public String server() {
		return props.getProperty("server").trim();
	}
	
	public String port() {
		return props.getProperty("port");
	}
	
	public String getAndroidAppPackageName() {
		return props.getProperty("AndroidAppPackageName").trim();
	}
	
	public String getAndroidAppActivityName() {
		return props.getProperty("AndroidAppActivityName").trim();
	}
	
	public String getReportHeader() {
		return props.getProperty("ReportHeader").trim();
	}
	public String getReportpath() {
		return props.getProperty("ReportPath").trim();
	}
}
