package SeleniumLearningSkills;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.xpath("//select[@id='country']"));
		drop.click();
		
		Select mydropdown=new Select(drop);
		//Select Single option from the dropdown list	
		
		//mydropdown.selectByVisibleText("United Kingdom");
		//mydropdown.selectByValue("uk");
		//mydropdown.selectByIndex(5);
		
		//Counting the number of items in the dropdown
		List<WebElement>mylist=mydropdown.getOptions();
		System.out.println("Number of items is :");
		int total=mylist.size();
		System.out.println("The total items in the list are :"+total);
		
		
		//Print all the items 
		
		for(int i=0;i<total;i++) 
		{
		   System.out.println(mylist.get(i).getText());
		   			
		}
		
		
		
		
		
		
		
	}

}
