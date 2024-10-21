package com.Utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {


	String filepath = System.getProperty("user.dir");
	XSSFWorkbook book;
	XSSFSheet sheet;
	public ExcelUtils() throws Exception{
		book = new XSSFWorkbook(filepath+"/Excel/data.xlsx");
		sheet = book.getSheet("Sheet1");
	}

	public int getRowCount() throws Exception{

		int r = sheet.getPhysicalNumberOfRows();

		return r;
	}
	public int getColCount() throws Exception{

		int c = sheet.getRow(0).getPhysicalNumberOfCells();

		return c;
	}

	public String getUname(int rownum, int colnum) throws Exception{

		String uname = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		return uname;

	}
	public String getPwd(int rownum, int colnum) throws Exception{

		String pwd =sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		return pwd;

	}

}
