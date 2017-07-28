package com.Tring.nbc.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public final class ExcelReader {

	private static String objectFilePath;
	private static ExcelReader reader;
	private File file;
	private Logger logger = Logger.getLogger(ExcelReader.class);

	/**
	 * @param filePath
	 * @throws FileNotFoundException
	 */
	private ExcelReader(String filePath) throws FileNotFoundException {
		file = new File(filePath);
	}

	/**
	 * Creates instance for ExcelReader and returns the instance.
	 * 
	 * @param filePath
	 *            - Path of the file
	 * @return ExcelReaderInstance
	 */
	public static ExcelReader getInstance(String filePath) {
		try {
			reader = new ExcelReader(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return reader;
	}

	/**
	 * @return the object file path
	 */
	public static String getobjectFilePath() {
		return objectFilePath;
	}

	/** Loads the element property excel path. */
	public static void loadElementPropertyExcelPath() {
		final Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("src/main/resources/config.properties"));
			objectFilePath = prop.getProperty("ELEMENTPROPERTYEXCEL");
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Get row value as Map for the given rownumber and sheet name.
	 * 
	 * @param rownum
	 *            - Row number to be read
	 * @param sheetName
	 *            - Name of the sheet
	 * @return rowvalue as Map
	 */
	public Map<String, String> getRowValue(int rownum, String sheetName) {

		final Map<String, String> rowData = getSheetData(rownum, sheetName);
		if (!rowData.isEmpty()) {
			System.out.println(rowData + "re");
			return rowData;
		} else {
			throw new NullPointerException(rownum + " : doen't exist in " + sheetName + " sheet");
		}
	}

	/**
	 * Get row value as Map for the given TestLink ID and sheet name.
	 * 
	 * @param tcID
	 *            - TestLink ID
	 * @param sheetName
	 *            - Sheet Name to fetch data
	 * @return Map
	 */
	public Map<String, String> getRowValue(String tcID, String sheetName) {
		final Map<String, String> rowData = getSheetData(tcID, sheetName);
		if (!rowData.isEmpty()) {
			return rowData;
		} else {
			throw new NullPointerException(tcID + " : doen't exist in " + sheetName + " sheet");
		}
	}

	/**
	 * Returns number of rows in a given sheet.
	 * 
	 * @param sheetName
	 *            - Name of the sheet
	 * @return rownumbers
	 */
	public int getRowCount(String sheetName) {
		final HSSFSheet sheet = getSheet(sheetName);
		final int rowNum = sheet.getLastRowNum();
		return rowNum;
	}

	/**
	 * Returns number of columns in a given sheet.
	 * 
	 * @param sheetName
	 *            - Name of the sheet
	 * @return columnnumbers
	 */
	public int getCoulmnCount(String sheetName) {
		final HSSFSheet sheet = getSheet(sheetName);
		final HSSFRow row = sheet.getRow(0);
		final int cellCount = row.getLastCellNum();
		return cellCount;
	}

	/**
	 * Returns cell value for the given rownum, sheetName and column value.
	 * 
	 * @param rownum
	 *            - Row number to be read
	 * @param sheetName
	 *            - Name of the sheet
	 * @param column
	 *            -Coulmn Name
	 * @return cellvalue
	 */
	public String getCellValue(int rownum, String sheetName, String column) {
		final Map<String, String> rowData = getSheetData(rownum, sheetName);
		if (!rowData.isEmpty()) {
			logger.info(" Value for :" + column + " is " + rowData.get(column));
			return rowData.get(column);
		} else {
			throw new NullPointerException(rownum + " : doen't exist in " + sheetName + " sheet");
		}
	}

	/**
	 * Returns cell value for the given Testlink ID, sheetName and column value.
	 * 
	 * @param tcID
	 *            - Testlink ID
	 * @param sheetName
	 *            - Sheet Name to read
	 * @param column
	 *            - Column name to fetch data
	 * @return String
	 */
	public String getCellValue(String tcID, String sheetName, String column) {
		final Map<String, String> rowData = getSheetData(tcID, sheetName);
		if (!rowData.isEmpty()) {
			logger.info(" Value for :" + column + " is " + rowData.get(column));
			return rowData.get(column);
		} else {
			throw new NullPointerException(tcID + " : doen't exist in " + sheetName + " sheet");
		}
	}

	/**
	 * Returns sheet name.
	 * 
	 * @param sheetName
	 *            - Name of the sheet
	 * @return sheetName
	 */
	private HSSFSheet getSheet(String sheetName) {
		HSSFWorkbook workbook;
		HSSFSheet sheet = null;
		try {
			workbook = new HSSFWorkbook(new FileInputStream(file));
			sheet = workbook.getSheet(sheetName);
			logger.info(" Data will be read from the sheet :" + sheetName);
			return sheet;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sheet;
	}

	/**
	 * Read and returns the sheet data as a Map.
	 * 
	 * @param rownum
	 *            - Row number to be read
	 * @param sheetName
	 *            - Name of the sheet
	 * @return sheetvalues as Map
	 */
	private Map<String, String> getSheetData(int rownum, String sheetName) {
		final List<String> rowData = new ArrayList<String>();
		final Map<String, String> rowVal = new HashMap<String, String>();
		Object value = null;
		final HSSFSheet sheet = getSheet(sheetName);
		final List<String> coulmnNames = getColumns(sheet);
		final HSSFRow row = sheet.getRow(rownum);
		final int firstCellNum = row.getFirstCellNum();
		final int lastCellNum = row.getLastCellNum();
		for (int j = firstCellNum; j < lastCellNum; j++) {
			final HSSFCell cell = row.getCell(j);
			if (cell == null || cell.getCellType() == Cell.CELL_TYPE_BLANK) {
				rowData.add("");
			} else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
				final Double val = cell.getNumericCellValue();
				value = val.intValue();// cell.getNumericCellValue();
				rowData.add(value.toString());
			} else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
				rowData.add(cell.getStringCellValue());
			} else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN || cell.getCellType() == Cell.CELL_TYPE_ERROR
					|| cell.getCellType() == Cell.CELL_TYPE_FORMULA) {
				throw new RuntimeException(" Cell Type is not supported ");
			}
			rowVal.put(coulmnNames.get(j), rowData.get(j));
		}
		return rowVal;
	}

	/**
	 * Read and returns the sheet data as a Map.
	 * 
	 * @param tcID
	 *            - TestLink ID
	 * @param sheetName
	 *            - Sheet Name to fetch data
	 * @return Map
	 */
	private Map<String, String> getSheetData(String tcID, String sheetName) {
		final List<String> rowData = new ArrayList<String>();
		final Map<String, String> rowVal = new HashMap<String, String>();
		Object value = null;
		final HSSFSheet sheet = getSheet(sheetName);
		final List<String> coulmnNames = getColumns(sheet);
		final int totalRows = sheet.getPhysicalNumberOfRows();
		final HSSFRow row = sheet.getRow(0);
		final int firstCellNum = row.getFirstCellNum();
		final int lastCellNum = row.getLastCellNum();
		for (int i = 1; i < totalRows; i++) {
			final HSSFRow rows = sheet.getRow(i);
			final String testLinkID = rows.getCell(0).getStringCellValue();
			if (tcID.equalsIgnoreCase(testLinkID)) {
				for (int j = firstCellNum; j < lastCellNum; j++) {
					final HSSFCell cell = rows.getCell(j);
					if (cell == null || cell.getCellType() == Cell.CELL_TYPE_BLANK) {
						rowData.add("");
					} else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
						final Double val = cell.getNumericCellValue();
						value = val.intValue();// cell.getNumericCellValue();
						rowData.add(value.toString());
					} else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
						rowData.add(cell.getStringCellValue());
					} else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
						rowData.add(String.valueOf(cell.getBooleanCellValue()));
					} else if (cell.getCellType() == Cell.CELL_TYPE_ERROR
							|| cell.getCellType() == Cell.CELL_TYPE_FORMULA) {
						throw new RuntimeException(" Cell Type is not supported ");
					}
					rowVal.put(coulmnNames.get(j), rowData.get(j).trim());
				}
				break;
			}
		}
		return rowVal;
	}

	/**
	 * Returns Column values from the given sheet.
	 * 
	 * @param sheet
	 *            - sheet
	 * @return columnvalues
	 */
	private List<String> getColumns(HSSFSheet sheet) {
		final HSSFRow row = sheet.getRow(0);
		final List<String> columnValues = new ArrayList<String>();
		final int firstCellNum = row.getFirstCellNum();
		final int lastCellNum = row.getLastCellNum();
		for (int i = firstCellNum; i < lastCellNum; i++) {
			final HSSFCell cell = row.getCell(i);
			columnValues.add(cell.getStringCellValue());
		}
		return columnValues;
	}

}
