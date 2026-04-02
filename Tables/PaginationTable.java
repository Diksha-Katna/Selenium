package SeleniumLearningSkills;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//Number of rows
		List<WebElement>myrows=driver.findElements(By.xpath("//table[@id='productTable']//tr"));
		int rows=myrows.size();
		System.out.println("Total rows are:" +rows);
		
		//Number of columns
		
		List<WebElement>mycols=driver.findElements(By.xpath("//table[@id='productTable']//tr//th"));
		int cols=mycols.size();
		System.out.println("Total columns are:" +cols);
		
		//Read Specific cell value
		
		//WebElement cell=driver.findElement(By.xpath("//table[@id='productTable']//tr[1]//td[2]"));
		//String value=cell.getText();
		//System.out.println("Specific value is:" +value);
		
		// Getting all rows and columns
		
		for(int i=1;i<rows;i++)
		{
			for(int j=1;j<cols;j++)
				
			{
				
			WebElement Singlevalue=driver.findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td["+j+"]"));
			String str=Singlevalue.getText();
			System.out.println(str);
			
			}
			
		}	
		
		//Getting all pagination clicked
		List<WebElement>pages=driver.findElements(By.xpath("//ul[@id='pagination']//a"));
		int totalPages = pages.size();
		for(int p=1; p<=totalPages; p++)
		{
			WebElement page=driver.findElement(By.xpath("//ul[@id='pagination']//a[text()='"+p+"']"));
			page.click();
			
			
		}
			
			
			
		
			
			
		}
		
}
	


