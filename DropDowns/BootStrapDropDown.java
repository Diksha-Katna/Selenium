package SeleniumLearningSkills;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		WebElement drop1=driver.findElement(By.xpath("//button[@id='menu1']"));
		drop1.click();
		
		//Single Item Selection
	   //WebElement item1=driver.findElement(By.xpath("//a[text()='JavaScript']"));
	   //item1.click();
	   
	   
	   //Total Items in the bootstrap dropdown
	   
	    List<WebElement>mylist= driver.findElements(By.xpath("//li[@role='presentation']/a"));
	    System.out.println("Total items are");
	    int total=mylist.size();
	    System.out.println(total);
	    
	    
	    //Name of all the item in the bootstrap dropdown
	    
	    for(int i=0;i<total;i++)
	    {
	    	System.out.println(mylist.get(i).getText());
	    }
	
	}
}

	   
	    
	
		
		
		
		




