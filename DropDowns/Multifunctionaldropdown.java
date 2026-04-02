package SeleniumLearningSkills;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multifunctionaldropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();	
		driver.get("https://mdbootstrap.com/docs/standard/extended/dropdown-checkbox/");
		Thread.sleep(5000);
		WebElement drop2=driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		drop2.click();
		
		
		//Select single Item
		
		driver.findElement(By.xpath("//input[@id='Checkme4']")).click();
		
		
		//total items in the dropdown
		List<WebElement>mylist=driver.findElements(By.xpath("//label[text()='Check me']"));
		int total=mylist.size();
		System.out.println(total);
		
		
		//Print all items from the dropdown
		
		//for(int i=0;i<total;i++)
		//{
			//System.out.println(mylist.get(i).getText());
		//}
		
		//Selecting multiple items 
		
		for(int i=3;i<total;i++)
		{
			mylist.get(i).click();
			
		}
		
		
		
		
		
		
		

	}

}
