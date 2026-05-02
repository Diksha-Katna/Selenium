package SeleniumLearningSkills;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\ExternalFiles\\Testing2.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("DynamicData");
		Scanner scan=new Scanner(System.in);               
		System.out.println("Enter how many rows?");
		int noOfrows=scan.nextInt();
		
		System.out.println("Enter how many cells?");
		int noOfcells=scan.nextInt();
		
		
		for(int r=0;r<noOfrows;r++)
		{
			XSSFRow currentRow=sheet.createRow(r);
		
		
		for(int c=0;c<noOfcells;c++)
		{
			XSSFCell cell =currentRow.createCell(c);
			cell.setCellValue(scan.next());
		}
		}
		workbook.write(file);  //attach workbook to the file
		workbook.close();
		file.close();
	}

}
