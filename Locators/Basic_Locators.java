package SeleniumLearningSkills;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Basic_Locators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
	    WebElement next=driver.findElement(By.id("next2"));
	
			    next.click();
			    System.out.println(" Next got clicked ");
	    	
	    
			    
		 List<WebElement> mylist=driver.findElements(By.className("list-group-item"));	
		 System.out.println(mylist.size());
	    
	    
	     List<WebElement>mylist2=driver.findElements(By.tagName("img"));
	     System.out.println(mylist2.size());
	   
		 List<WebElement> links=driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 

		 
		
		 
		    
		      
		      
	}

}
