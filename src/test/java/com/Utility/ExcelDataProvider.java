package com.Utility;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

	@Test(dataProvider = "testdata1")
	public void TestCase1(String uname, String pwd){
		System.out.println(uname+" | "+pwd);

	}

	@DataProvider(name = "testdata1")
	public Object[][] getData() throws Exception{

		Object data[][] = testData();
		return data;
	}

	public static Object[][] testData() throws Exception{
		ExcelUtils excel = new ExcelUtils();
		int noOfrows = excel.getRowCount();
		int noOfcol = excel.getColCount();

		Object data[][] = new Object[noOfrows-1][noOfcol];

		for(int i=1; i<noOfrows; i++){
			for(int j=0; j<noOfcol; j++){
				String u = excel.getUname(i, j);
				//System.out.print(u+" | ");
				data[i-1][j] = u;
			}

		}
		return data;

	}
}
