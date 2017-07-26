package com.Tring.nbc.core;

public abstract class BaseTest {
	
	/**
	 * Abstract method for Front-End Test
	 * @param browserName
	 * @param version
	 * @param runType
	 * @param hubUrl
	 */
	protected abstract void setUp(String browserName, String version, String runType,String hubUrl);
	
	/**
	 * @param filePath
	 */
	protected void reportResults(String filePath){
		//logs.setFilePath(filePath);
		//logs.writeLogs();
		//dumps.writeDumps(filePath);
	}
	
}
