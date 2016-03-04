package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;

	// This method is to set the File path and to open the Excel file, Pass
	// Excel Path and Sheetname as Arguments to this method

	public static void setExcelFile(String Path, String SheetName)
			throws Exception {

		try {

			// Open the Excel file

			FileInputStream ExcelFile = new FileInputStream(Path);

			// Access the required test data sheet

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet(SheetName);

		} catch (Exception e) {

			throw (e);

		}

	}

	// This method is to read the test data from the Excel cell, in this we are
	// passing parameters as Row num and Col num

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try {

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

		} catch (Exception e) {

			return "";

		}

	}

	// This method is to write in the Excel cell, Row num and Col num are the
	// parameters

	public static void setCellData(String Result, int RowNum, int ColNum)
			throws Exception {

		try {

			Row = ExcelWSheet.getRow(RowNum);
			XSSFCellStyle style1 = ExcelWBook.createCellStyle();
			Font ft= ExcelWBook.createFont();
			Cell = Row.getCell(ColNum,
					org.apache.poi.ss.usermodel.Row.RETURN_BLANK_AS_NULL);
			if (Cell == null) {
				Cell = Row.createCell(ColNum);
				if ("pass".equalsIgnoreCase(Result))
					ft.setColor(IndexedColors.BLUE.getIndex());
				else
					ft.setColor(IndexedColors.RED.getIndex());
				style1.setFont(ft);
				Cell.setCellStyle(style1);
				Cell.setCellValue(Result);

			} else {
				Cell.setCellValue(Result);
			}
			// Constant variables Test Data path and Test Data file name

			FileOutputStream fileOut = new FileOutputStream(
					Constant.Path_TestData + Constant.File_TestData);
			ExcelWBook.write(fileOut);

			fileOut.flush();
			fileOut.close();
			ExcelWBook = new XSSFWorkbook(new FileInputStream(
					Constant.Path_TestData + Constant.File_TestData));
			ExcelWSheet = ExcelWBook.getSheet("Export_Worksheet");
		} catch (Exception e) {
			throw (e);
		}

	}

	public static int getrowCount() {
		int m = ExcelWSheet.getLastRowNum();

		return m;

	}

	public static int getColumnCount() {
		int m = ExcelWSheet.getRow(0).getLastCellNum();

		return m;

	}
}