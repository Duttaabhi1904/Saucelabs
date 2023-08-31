package com.sauce.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sauce.base.LogBase;

public class GetCredentials {

	private Workbook wb;
	private Sheet sh;

	public GetCredentials() {
		try {

			FileInputStream fis = new FileInputStream("E:\\Mine\\Ecllipse\\SwagLabs\\Data\\SauceData.xlsx");
			wb = new XSSFWorkbook(fis);
			sh = wb.getSheetAt(0);
		} catch (Exception e) {
			LogBase.logs().error("DataDriven Failed " + e.toString());
		}

	}

	public String getUrl() {
		return sh.getRow(1).getCell(0).getStringCellValue();
	}

	public String getInvalidUser() {
		return sh.getRow(1).getCell(1).getStringCellValue();

	}

	public String getInvalidPass() {
		return sh.getRow(1).getCell(2).getStringCellValue();

	}

	public String getValidUser() {
		return sh.getRow(1).getCell(3).getStringCellValue();

	}

	public String getValidPass() {
		return sh.getRow(1).getCell(4).getStringCellValue();

	}

}
