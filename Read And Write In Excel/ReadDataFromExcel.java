package SeleniumLearningSkills;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File--->Workbook--->Sheets--->Rows----Cells

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
       FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\ExternalFiles\\Testing_data.xlsx");
       
       XSSFWorkbook myworkbook=new XSSFWorkbook(file);
           XSSFSheet mysheet=myworkbook.getSheet("Books");
             int total_rows=mysheet.getLastRowNum();
                int total_cells=mysheet.getRow(0).getLastCellNum();
                
                System.out.println("number of rows:"+ total_rows); 
        		System.out.println("number of cells:"+ total_cells);  
        		
        		
        		for(int r=0;r<=total_rows;r++)
        		{
        			XSSFRow currentRow=mysheet.getRow(r);
        						
        			for(int c=0;c<total_cells;c++)
        			{
        				XSSFCell cell=currentRow.getCell(c);
        				System.out.print(cell.toString()+"\t");
        				
        			}
        			System.out.println();
        		}
        		
        		myworkbook.close();
        		file.close();
           
       
       

		
	}

}
