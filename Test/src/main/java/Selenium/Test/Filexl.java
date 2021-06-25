package Selenium.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Filexl {

	public static void main(String[] args) throws IOException {
		File file =new File("./xlFile/IBORDS Registration List.xlsx");
		FileInputStream ip = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(ip);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowcount = sheet.getPhysicalNumberOfRows();
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow row  =sheet.getRow(i);
			
			int cellCount =row.getPhysicalNumberOfCells();
			for(int j=0;j<cellCount;j++)
			{
				XSSFCell cell =row.getCell(j);
				System.out.println(cell);
			}
		}
	
	}

}
