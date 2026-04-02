package SeleniumLearningSkills;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		
		driver.manage().window().maximize();
		
		//Login steps
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	    
	  //clicking on PIM 
	   driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click(); //PIM
	   
	   
	   //Clicking Single item
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
	   //WebElement item1= driver.findElement(By.xpath("//span[text()='Freelance']"));
	   //item1.click();
	   
	   
	   
	   
	   //Finding the size of dropdown
	    List<WebElement>mylist= driver.findElements(By.xpath("//div[@role='listbox']/div/span"));
	    int total=mylist.size();
	    System.out.println(total);
	    
	    
	    //Print all the dropdown members
	    for(int i=0;i<total;i++)
	    {
	    	System.out.println(mylist.get(i).getText());
	    	
	    }
	 
	   
	   
	  
	  
	  
	 
	  
	   
	   
	  		
		
	}

}
