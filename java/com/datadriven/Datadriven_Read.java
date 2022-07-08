package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Read {

	public static void readParticularData () throws Throwable {

		System.out.println("*** Read Particular Data ***");
		File f = new File("E:\\Eclipse Project Backups\\Maven\\information.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(3);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			
			String value = cell.getStringCellValue();
			System.out.println(value);
	}
		else if (cellType.equals(cellType.NUMERIC)) {
			
			double cellValue = cell.getNumericCellValue();
			int value = (int) cellValue ;
			System.out.println(cellValue);
		}
	} 

	public static void readAllDaata() throws Throwable {

		System.out.println("*** Read All Data ***");

		File f = new File("C:\\Users\\vijay\\eclipse-workspace\\Maven\\information.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		
		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < NumberOfRows; i++) {
			Row row = sheetAt.getRow(i);

			int numberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < numberOfCells; j++) {
			 Cell cell = row.getCell(j);
			 CellType cellType = cell.getCellType();
				
			 if (cellType.equals(cellType.STRING)) {
					
					String value = cell.getStringCellValue();
					System.out.println(value);
					
			}
				else if (cellType.equals(cellType.NUMERIC)) {
					
					double cellValue = cell.getNumericCellValue();
					int value = (int) cellValue ;
					System.out.println(cellValue);
				}			
			}
		}	
	}
	
	public static void readparticularRow() throws Throwable {

		System.out.println("*** Read Particular rows ***");
		
		File f = new File("C:\\Users\\vijay\\eclipse-workspace\\Maven\\information.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(3);

		int numberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < numberOfCells; j++) {
			 Cell cell = row.getCell(j);
			 CellType cellType = cell.getCellType();
				
			 if (cellType.equals(cellType.STRING)) {
					
					String value = cell.getStringCellValue();
					System.out.println(value);
					
			}
				else if (cellType.equals(cellType.NUMERIC)) {
					
					double cellValue = cell.getNumericCellValue();
					int value = (int) cellValue ;
					System.out.println(cellValue);
				}			
			}
	}
	
	public static void main(String[] args) throws Throwable {
		
		readParticularData(); 
		readAllDaata();
		readparticularRow();
	}
}

