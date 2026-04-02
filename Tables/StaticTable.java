package SeleniumLearningSkills;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class StaticTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//Number of Rows
	    List<WebElement>myrows= driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
	    int rows=myrows.size();
	    System.out.println("Number Of Rows Are:" +rows);
	    
	    //Number Of Columns	    
	    List<WebElement>mycols=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
	    int cols=mycols.size();
	    System.out.println("Number Of Columns Are:"+cols);
	    
	    //Specific cell value    	                             
	    //WebElement value= driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[2]"));
	    //String st=value.getText();
	    //System.out.println("The specific cell value is :" +st);
	    
	    
	    //Getting all rows and columns value
	   //for(int i=2;i<rows;i++)
	    //{
	    	//for(int j=1;j<cols;j++)
	    	//{
	    		//WebElement single=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]"));
	    		//Thread.sleep(5000);
	    	    //String names=single.getText();
	    	    //System.out.println(names);    	    
	    	   	    		
	        //}
	    //}
	    
	    //Getting conditional based data
	    
	    //Getting book which has maximum price
	    
	    //Getting book column in the list or particular column of table
	    
	   List<WebElement>mybooks= driver.findElements(By.xpath("//table[@name='BookTable']//tr//td[4]"));
	   System.out.println("The total books are:");
	   int total2=mybooks.size();
	   System.out.println(total2);
	   
	   //Name all the values of column book
	   
	   for (int m=1;m<total2;m++)
	   {
		  System.out.println(mybooks.get(m).getText());
		  
		  
	   } 
	  
	   //find the maximum price
	  
	   int max=0;
	 
		  for(int n=1;n<total2;n++)
		  {
			  int price=Integer.parseInt(mybooks.get(n).getText());
			  if(price>max)
			  {
				  max=price;
				  
			  }	 
		  
		  }
		  System.out.println("maximum price is:");
		  System.out.println(max);  
		  
		    
	   
	   //Find the bookname which has maximum price
		  for(int l=1;l<total2;l++)
		  {
			  int price=Integer.parseInt(mybooks.get(l).getText());
			  if(price==max)
			  {
				 WebElement book_name= driver.findElement(By.xpath("//table[@name='BookTable']//tr[" +(l+2)+ "]/td[1]"));
				String BookName= book_name.getText();
				System.out.println("The book with maximum price is:" +BookName);
				  
			  }
		  }
		
			  
			  
	    
		

	}

}
