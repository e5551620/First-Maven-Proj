package com.Utility;

public class TestExcel {

	public static void main(String[] args) throws Exception {
		ExcelUtils excel = new ExcelUtils();
		
		excel.getRowCount();
		excel.getColCount();
		excel.getUname(1, 0);
		excel.getPwd(1, 1);

	}

}
