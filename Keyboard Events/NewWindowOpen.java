package SeleniumLearningSkills;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewWindowOpen {

	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement regLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
				
		Actions act=new Actions(driver);
		
		//Control+Reglink
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		
		//Finding Window IDs
		Set<String> windowIDs=driver.getWindowHandles();
		
		List<String>WindowID=new ArrayList(windowIDs);
		String ParentID=WindowID.get(0);
		String ChildID=WindowID.get(1);	
		//Switch to Parent Window
		driver.switchTo().window(ParentID);	
		//Switch to Child Window
		driver.switchTo().window(ChildID);
		
		
		
		
		
		
		
	}

}
