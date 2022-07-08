package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_write {

	private static void Write_Data() throws Throwable {
		
		File f = new File("E:\\Eclipse Project Backups\\Maven\\information.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook();
		Sheet createSheet = w.createSheet("state");
		Row createRow = createSheet.createRow(0);
		Cell cell = createRow.createCell(0);
		cell.setCellValue("state");
		
		w.getSheet("state").getRow(0).getCell(1).setCellValue("capital");
		w.getSheet("state").getRow(0).getCell(2).setCellValue("rainfall");
		w.getSheet("state").getRow(1).getCell(0).setCellValue("tamilnadu");
		w.getSheet("state").getRow(1).getCell(1).setCellValue("chennai");
		w.getSheet("state").getRow(1).getCell(2).setCellValue("45");
		w.getSheet("state").getRow(2).getCell(0).setCellValue("kerala");
		w.getSheet("state").getRow(2).getCell(1).setCellValue("kochi");
		w.getSheet("state").getRow(2).getCell(2).setCellValue("98");
		w.getSheet("state").getRow(3).getCell(0).setCellValue("Himachal Pradesh");
		w.getSheet("state").getRow(3).getCell(1).setCellValue("manali");
		w.getSheet("state").getRow(3).getCell(2).setCellValue("50");
		w.getSheet("state").getRow(4).getCell(0).setCellValue("meghalaya ");
		w.getSheet("state").getRow(4).getCell(1).setCellValue("shillong");
		w.getSheet("state").getRow(4).getCell(2).setCellValue("150");
		w.getSheet("state").getRow(5).getCell(1).setCellValue("Punjab");
		
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		w.close();
		
	}
	
	public static void main(String[] args) throws Throwable {
		
		Write_Data();
		
		
	}
	
	
}
