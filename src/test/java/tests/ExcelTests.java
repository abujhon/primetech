package tests;

import utilities.ExcelUtils;

public class ExcelTests {

	public static void main(String[] args) {

		//ExcelUtils.createExcelFile("ExcelTest.xlsx", "primetech");
		
		ExcelUtils.openExcelFile("C:\\Users\\lenovo\\eclipse-workspace\\com.primetech\\ExcelTest.xlsx", "primetech"); ///com.primetech/ExcelTest.xlsx
		
		System.out.println(ExcelUtils.getUsedRowsCount());
		System.out.println(ExcelUtils.getUsedCellCount(1));
		
		
		for (int i = 0; i < ExcelUtils.getUsedRowsCount() ; i++) {
			System.out.println(ExcelUtils.getCellData(i, 0));
		}
		
	}

}
